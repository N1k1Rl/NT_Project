package edu.ib.networktechnologies.security;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String username) { super(String.format("User with username " + username + " already exists" ));
    }
}