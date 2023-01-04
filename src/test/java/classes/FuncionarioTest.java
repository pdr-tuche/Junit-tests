package classes;

import org.example.classes.Funcionario;
import org.junit.jupiter.api.*;

public class FuncionarioTest {

    Funcionario funcionario;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("este e o before all");
    }

    @BeforeEach // executa antes do teste
    public void createFuncionario(){
        funcionario = new Funcionario("fulano",2_000);
        System.out.println("before each");
    }

    @AfterEach //executa depois de cada teste
    public void after(){
        System.out.println("after each");
    }

    @Test
    public void reajustaSalarioNotaMaiorIgualSeis(){
        funcionario.aumentarSalario(6);
        double salarioAtual = funcionario.getSalario();
        Assertions.assertEquals(2400,salarioAtual);
    }

    @Test
    public void reajustaSalarioNotaMenorQueSeis(){
        funcionario.aumentarSalario(0);
        double salarioAtual = funcionario.getSalario();
        Assertions.assertEquals(2200,salarioAtual);
    }

}
