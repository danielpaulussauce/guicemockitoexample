package main.services;

public interface IHttpConnectionFactory {
    void handle(IConnectionRequest request);
}
