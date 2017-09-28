package main.services;

public interface IHttpMessageFactory {
    IConnectionResponse createSessionCreatedResponse(ISession session);

    IConnectionResponse createDefaultResponse();
}
