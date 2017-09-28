package main.services;

import main.services.IConnectionResponse;
import main.services.IHttpMessageFactory;
import main.services.ISession;

public class HttpMessageFactory implements IHttpMessageFactory {
    public IConnectionResponse createSessionCreatedResponse(ISession session) {
        return null;
    }

    public IConnectionResponse createDefaultResponse() {
        return null;
    }
}
