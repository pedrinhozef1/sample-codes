package br.com.alura.escola.gameficacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void atribuirSelo(Selo selo);

    List<Selo> buscarSelosPorCPF(CPF cpf);
}
