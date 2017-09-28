package main.services;

import main.model.Cookie;
import main.model.CustomHeader;

public class ConnectionResponse implements IConnectionResponse {

    private String responseId;
    private Cookie cookie;
    private CustomHeader header;

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public Cookie getCookie() {
        return cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public CustomHeader getHeader() {
        return header;
    }

    public void setHeader(CustomHeader header) {
        this.header = header;
    }
}
