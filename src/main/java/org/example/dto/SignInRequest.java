package org.example.dto;
import jakarta.validation.constraints.NotBlank;

public class SignInRequest {


    @NotBlank
    private String username;   // or email, depending on your design

    @NotBlank
    private String password;

    // getters & setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
