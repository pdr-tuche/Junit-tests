package org.example;

import org.example.classes.Calculadora;
import org.example.classes.Funcionario;

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

        Funcionario funcionario = new Funcionario("Pedro", 2_000);
        System.out.printf("salario atual do %s é de: %f\n", funcionario.getNome(), funcionario.getSalario());
        funcionario.aumentarSalario(6);
        System.out.printf("salario pós aumento do %s é de: %f\n", funcionario.getNome(), funcionario.getSalario());

    }
}