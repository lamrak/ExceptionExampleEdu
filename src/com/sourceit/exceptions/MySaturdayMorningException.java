package com.sourceit.exceptions;

public class MySaturdayMorningException extends Exception {
    String errorMsg = "Bad Morning staurday exception";

    @Override
    public String getMessage() {
        return errorMsg;
    }
}
