package com.example.onlinecoffeesandbox.controller.advice;

import com.example.onlinecoffeesandbox.controller.response.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionalHandler {
    @ExceptionHandler(value = RuntimeException.class)
    public Response handleRuntimeException(RuntimeException e) {
        return Response.fail(e.getMessage());
    }
}
