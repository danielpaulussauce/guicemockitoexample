package main.services;

import javax.inject.Inject;

public class Server implements IServer {


    private final IDatabase dataBase;
    private IUserAccountManagement userAccountManagement;
    private ILoggingService loggingService;
    private IHttpConnectionFactory httpConnectionFactory;
    private IHttpMessageFactory messageFactory;


    @Inject
    public Server(IDatabase db, IUserAccountManagement UserAccountManagement, ILoggingService LoggingService, IHttpConnectionFactory HttpConnectionFactory,
                  IHttpMessageFactory messageFactory) {

        this.dataBase = db;
        userAccountManagement = UserAccountManagement;
        loggingService = LoggingService;
        httpConnectionFactory = HttpConnectionFactory;
        this.messageFactory = messageFactory;
    }

    public void run() {
        dataBase.printTables();
    }

    public IConnectionResponse acceptConnection(IConnectionRequest request) {
        loggingService.log("got new request from %s:%s", request.getIp(), request.getPort());
        httpConnectionFactory.handle(request);
        IConnectionResponse response;
        if (userAccountManagement.containsValidLoginRequest(request)) {
            ISession session = userAccountManagement.createSessionUser(request);
            response = messageFactory.createSessionCreatedResponse(session);
        } else response = messageFactory.createDefaultResponse();
        return response;
    }

}
