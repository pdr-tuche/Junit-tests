package org.example.classes;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(int nota){
        double dinheiroAMais;
        if (nota < 6){
            dinheiroAMais = this.salario * 0.1;
            setSalario(this.salario + dinheiroAMais);
        } else{
            dinheiroAMais = this.salario * 0.2;
            setSalario(this.salario + dinheiroAMais);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
