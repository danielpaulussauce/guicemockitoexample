package main.services;

import main.model.Cookie;
import main.model.CustomHeader;
import main.model.UserSession;

import java.util.HashMap;
import java.util.List;

public class ConnectionRequest implements IConnectionRequest {

    private List<Cookie> cookies;
    private UserSession session;
    private HashMap<String, CustomHeader> headers;
    private String rawContent;
    private String bodyType;

private String ip;
private int port;

    public List<Cookie> getCookies() {
        return cookies;
    }

    public void setCookies(List<Cookie> cookies) {
        this.cookies = cookies;
    }

    public UserSession getSession() {
        return session;
    }

    public void setSession(UserSession session) {
        this.session = session;
    }

    public HashMap<String, CustomHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String, CustomHeader> headers) {
        this.headers = headers;
    }

    public String getRawContent() {
        return rawContent;
    }

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
