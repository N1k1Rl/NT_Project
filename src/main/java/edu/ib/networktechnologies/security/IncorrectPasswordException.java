package edu.ib.networktechnologies.security;

public class IncorrectPasswordException extends RuntimeException { public IncorrectPasswordException(String username) {
    super("Incorrect password provided"); }
}