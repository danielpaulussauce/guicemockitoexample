package main.model;

public class Cookie {

    private String cookiecontent;
    private String id;
    private String UserId;
    private CookieAdditionalDetails details;

    public String getCookiecontent() {
        return cookiecontent;
    }

    public void setCookiecontent(String cookiecontent) {
        this.cookiecontent = cookiecontent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public CookieAdditionalDetails getDetails() {
        return details;
    }

    public void setDetails(CookieAdditionalDetails details) {
        this.details = details;
    }
}
