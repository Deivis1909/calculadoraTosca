package com.matematica.calculadora.service;

import com.matematica.calculadora.exception.UnsupertedMatch;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Setter
@Getter
@Service
public class Operacoes {

    public Double soma(
           Double numberOne,Double numberTwo
           )
            {

        // soma vai ser feita aqui no retorno depois de convertater numeros pra double
        return numberOne + numberTwo;
    }


    public Double subtracao(
            // capturando as variaveis passadas na url
            Double numberOne,Double numberTwo)  {
        return numberOne - numberTwo;

    }

    public Double multiplicar(
            Double numberOne,Double numberTwo)  {
        return numberOne * numberTwo;

    }
}
