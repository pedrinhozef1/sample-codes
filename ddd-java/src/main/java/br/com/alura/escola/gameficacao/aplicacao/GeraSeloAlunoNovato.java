package br.com.alura.escola.gameficacao.aplicacao;

import br.com.alura.escola.gameficacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gameficacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoEvento;

public class GeraSeloAlunoNovato extends Ouvinte {
    private final RepositorioDeSelos repositorio;

    public GeraSeloAlunoNovato(RepositorioDeSelos repositorio){
        this.repositorio = repositorio;
    }

    @Override
    protected void reageAo(Evento evento) {
        CPF cpf = (CPF) evento.informacoes().get("cpf");
        Selo novato = new Selo(cpf, "Novato");
        repositorio.atribuirSelo(novato);
    }

    @Override
    protected boolean processaEvento(Evento evento) {
        return evento.tipoEvento().equals(TipoEvento.ALUNO_MATRICULADO);
    }
}
