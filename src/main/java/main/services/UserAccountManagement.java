package main.services;

import main.services.IConnectionRequest;
import main.services.ISession;
import main.services.IUserAccountManagement;

public class UserAccountManagement implements IUserAccountManagement{
    public ISession createSessionUser(IConnectionRequest request) {
        return null;
    }

    public boolean containsValidLoginRequest(IConnectionRequest request) {
        return false;
    }
}
