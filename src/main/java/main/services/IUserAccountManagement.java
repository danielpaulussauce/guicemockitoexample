package main.services;

public interface IUserAccountManagement {
    ISession createSessionUser(IConnectionRequest request);

    boolean containsValidLoginRequest(IConnectionRequest request);
}
