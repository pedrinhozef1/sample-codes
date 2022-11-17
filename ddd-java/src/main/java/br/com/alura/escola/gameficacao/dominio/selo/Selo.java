package br.com.alura.escola.gameficacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

public class Selo {
    private CPF cpfAluno;
    private String nome;

    public Selo(CPF cpf, String nome){
        this.cpfAluno = cpf;
        this.nome = nome;
    }

    public CPF getCpfAluno(){
        return this.cpfAluno;
    }

    public String getNome(){
        return this.nome;
    }
}
