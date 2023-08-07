package com.matematica.calculadora.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

// @controller adivice concentra o tratamento de excecoes
@ControllerAdvice
@RestController
public class CustumizeResponseEtityHandler extends ResponseEntityExceptionHandler {


    // tratando erro mais genereico 500
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleExcpetions(Exception ex, WebRequest request){
        // estancia um objeto ExcptionResponse que trata objetos genericos
        // e recebe dados que quer ver
        ExceptionResponse exceptionResponse = new ExceptionResponse(

                // data do erro
                new Date(),
                //mensagem do erro
                ex.getMessage(),
                //descricao do erro
                request.getDescription(false));
                return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);



    }

    // tratando a classe de exceção UnsuportedMatch
    // classe de exceçao criada por nos
    @ExceptionHandler(UnsupertedMatch.class)
    public final ResponseEntity<ExceptionResponse> handleBadRequest(Exception ex, WebRequest request){
        // estancia um objeto ExcptionResponse que trata objetos genericos
        // e recebe dados que quer ver
        ExceptionResponse exceptionResponse = new ExceptionResponse(

                // data do erro
                new Date(),
                //mensagem do erro
                ex.getMessage(),
                //descricao do erro
                request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);



    }
}
