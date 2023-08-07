package com.matematica.calculadora.controller;


import com.matematica.calculadora.exception.UnsupertedMatch;
import com.matematica.calculadora.service.NumberConverter;
import com.matematica.calculadora.service.Operacoes;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
    @Autowired
     private Operacoes operacoes;



    //mocke de id
    private final AtomicLong counter = new AtomicLong();

    // name = String de parametro

    @GetMapping
    @RequestMapping("/soma/{numberOne}/{numberTwo}")
    public Double soma(
           // @RequestParam(value = "name", defaultValue = "World")
           @PathVariable(value="numberOne")
            String numberOne,
           @PathVariable(value="numberTwo")
            String numberTwo)
        throws Exception{

        //NumberConverter. vai chamar FUNCAO DA CLASS NumberConverter = mesmo que injecao de dependcias de outra classe @Autored
        if( ! NumberConverter.isNumeric(numberOne) || ! NumberConverter.isNumeric(numberTwo)) {

            // se der erro Excpetion
            //estancia a classe de Excecao que a gente criou e
            // digita a mensagem na tela
            throw new UnsupertedMatch("please set a numeric value");
        }
        // soma vai ser feita aqui no retorno depois de convertater numeros pra double
        return operacoes.soma(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));
    }

    @GetMapping
    @RequestMapping("/subtrair/{numberOne}/{numberTwo}")
    public Double subtracao(
            // capturando as variaveis passadas na url
            @PathVariable(value="numberOne") String numberOne,
            @PathVariable(value="numberTwo") String numberTwo)  throws Exception{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            // se der erro faz
            throw new UnsupertedMatch("digite um caractere numerico");

        }

        return operacoes.subtracao(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));



    }
    @GetMapping
    @RequestMapping("/multiplica/{numberOne}/{numberTwo}")
    public Double multiplicar(
            // capturando as variaveis passadas na url
            @PathVariable(value="numberOne") String numberOne,
            @PathVariable(value="numberTwo") String numberTwo)  throws Exception{
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
            // se der erro faz
            throw new UnsupertedMatch("digite um caractere numerico");

        }

        return operacoes.multiplicar(NumberConverter.convertToDouble(numberOne),NumberConverter.convertToDouble(numberTwo));



    }


}



