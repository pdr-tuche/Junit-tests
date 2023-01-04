package classes;

import org.example.classes.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    public void somaDoisNumeros() {
        int soma = calc.soma(2, 2);
        Assertions.assertEquals(4, soma);
    }

    @Test
    public void subtraiDoisNumeros() {
        int sub = calc.subtracao(2, 1);
        Assertions.assertEquals(1, sub);
    }

    @Test
    public void multiplicaDoisNumeros() {
        int mult = calc.multiplicacao(2, 2);
        Assertions.assertEquals(4, mult);
    }

    @Test
    public void divideDoisNumeros() {
        double divisao = calc.divisao(3, 2);
        Assertions.assertEquals(1.5, divisao);
    }

    @Test
    public void verificaSeEPar() {
        boolean res = calc.verificaPar(0);
        Assertions.assertTrue(res);
    }

}
