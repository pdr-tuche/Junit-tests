package org.example.classes;

public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        return a / b;
    }

    public boolean verificaPar(int x) {
        return x % 2 == 0;
    }
}
