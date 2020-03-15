package com.reciplease.recipe.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;
@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value={ApiException.class})
    public ResponseEntity<Object> handleApiException(ApiException e){
        //Create payload
        ApiExceptionService exception =  new ApiExceptionService(e.getMessage(), e, HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")));
        // return response entity
        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);

    }
}
