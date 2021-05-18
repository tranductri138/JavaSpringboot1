package com.example.manageremp.api;

import com.example.manageremp.exception.ErrorReponse;
import com.example.manageremp.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ExceptionController {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorReponse handlerNotfoundException(NotFoundException ex, WebRequest request){
        logger.trace(ex.getMessage());
        return new ErrorReponse(HttpStatus.NOT_FOUND,ex.getMessage());
    }
}
