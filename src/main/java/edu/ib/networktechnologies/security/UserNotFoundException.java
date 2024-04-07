package edu.ib.networktechnologies.security;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String username) {
    super("The user with username: " + username + " doesn't exist"); }
}