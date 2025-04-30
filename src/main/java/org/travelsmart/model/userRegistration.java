package org.travelsmart.model;

public class userRegistration {
    private String username;
    private String password;
    private String email;

    public userRegistration(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


}
