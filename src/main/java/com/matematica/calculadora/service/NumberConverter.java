package com.matematica.calculadora.service;

public class NumberConverter {
    public static boolean isNumeric(String strNumber) {

        // verificando se é null returna false
        if (strNumber == null) return false;

        // replaceAll , aceita com virgula
        String number = strNumber.replaceAll(",", ".");
        // funcao regex vai verificar se e numerico
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
    public static Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;
        // BR 10,25 US 10.25
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }
}
