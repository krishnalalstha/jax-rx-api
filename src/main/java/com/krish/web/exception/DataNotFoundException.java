package com.krish.web.exception;

/**
 * Created by krishna on 6/21/17.
 */
public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String message) {
        super(message);
    }
}
