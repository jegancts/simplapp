package com.task.microservice.handler;


import com.task.microservice.dto.ErrorDto;
import com.task.microservice.exceptions.TaskNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<ErrorDto> handleTaskNotFoundException(TaskNotFoundException ex) {
        ErrorDto errorDto = new ErrorDto();
        errorDto.setStatus("404");
        errorDto.setMessage(ex.getMessage());
        return new ResponseEntity<ErrorDto> (errorDto,HttpStatus.NOT_FOUND);
    }

//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//        return errors;
//    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleTaskNotClientException(MethodArgumentNotValidException ex) {
        Map<String,String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((err)-> {
            String fieldName = ((FieldError) err).getField();
            String errmsg = err.getDefaultMessage();
            errors.put(fieldName,errmsg);
//
//            String fieldName = ((FieldError) error).getField();
        });
        String status = String.valueOf(HttpStatus.BAD_REQUEST.value());
        errors.put("status",status);
        System.out.print(errors);
        return errors;

    }
}
