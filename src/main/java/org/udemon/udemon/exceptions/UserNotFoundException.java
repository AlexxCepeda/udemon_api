package org.udemon.udemon.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(long userId) {
        super("ERR_DATA_NOT_FOUND", "No se encontró el usuario", userId);
    }
}
