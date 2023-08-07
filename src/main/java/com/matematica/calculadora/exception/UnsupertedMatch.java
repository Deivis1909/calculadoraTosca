package com.matematica.calculadora.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupertedMatch extends RuntimeException{

    public static final long seriaLVersion = 1L;

    //Constructor
    public UnsupertedMatch(String ex){
        super(ex);
    }

}
