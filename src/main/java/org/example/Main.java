package org.example;

import org.example.classes.Calculadora;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resSoma = calculadora.soma(1, 2);
        int resSub = calculadora.subtracao(1, 2);
        int resMult = calculadora.multiplicacao(1, 2);
        double resDiv = calculadora.divisao(1, 2);
        boolean pair = calculadora.verificaPar(1);

        System.out.printf("resultado da soma => %d\n" +
                        "resultado da subtração => %d\n" +
                        "resultado da multiplicação => %d\n" +
                        "resultado da divisao => %f\n" +
                        "resultado da paridade => %s\n",
                resSoma, resSub, resMult, resDiv, pair);
    }
}