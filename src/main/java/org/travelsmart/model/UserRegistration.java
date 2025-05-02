package org.travelsmart.model;

public class UserRegistration {
    private String email;
    private String password;

    public UserRegistration(String password, String email) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
