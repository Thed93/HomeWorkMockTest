package me.zinchenko.mock;

public class UserNonUniqueException extends Exception {
    public UserNonUniqueException(String message) {
        super(message);
    }
}