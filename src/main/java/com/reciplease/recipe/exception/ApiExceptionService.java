package com.reciplease.recipe.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiExceptionService {
    private final String msg;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timeStamp;

    public String getMsg() {
        return msg;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }

    public ApiExceptionService(String msg, Throwable throwable, HttpStatus httpStatus, ZonedDateTime timeStamp) {
        this.msg = msg;
        this.throwable = throwable;

        this.httpStatus = httpStatus;
        this.timeStamp = timeStamp;
    }
}
