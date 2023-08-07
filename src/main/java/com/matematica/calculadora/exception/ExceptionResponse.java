package com.matematica.calculadora.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExceptionResponse implements Serializable {

    private static final long serialVersion = 1L;

    private Date timesTemp;

    private String message;

    private String details;


}
