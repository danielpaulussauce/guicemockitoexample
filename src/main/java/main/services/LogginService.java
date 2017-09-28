package main.services;

import main.services.ILoggingService;

public class LogginService implements ILoggingService {
    public void log(String s, String ip, int port) {
        System.out.println(String.format(s,ip,port));
    }
}
