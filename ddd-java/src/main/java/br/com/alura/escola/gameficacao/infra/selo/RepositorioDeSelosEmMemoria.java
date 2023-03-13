package br.com.alura.escola.gameficacao.infra.selo;

import br.com.alura.escola.gameficacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.gameficacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void atribuirSelo(Selo selo){
        this.selos.add(selo);
    }

    @Override
    public List<Selo> buscarSelosPorCPF(CPF cpf){
        return this.selos
                .stream()
                .filter(s -> s.getCpfAluno().equals(cpf))
                .collect(Collectors.toList());
    }
}
