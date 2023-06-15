package com.ajp.yummer.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Alaa Jawhar
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    protected void handleBadRequest(RuntimeException e, HttpServletResponse response) throws IOException {
        log.error("Exception: ", e);
        response.sendError(HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }
}
