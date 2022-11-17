package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogAlunoMatriculado extends Ouvinte {
    @Override
    public void reageAo(Evento evento){
        String dataEventoFormatada = evento.dataEvento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println("Aluno com o CPF " + ((AlunoMatriculado) evento).getCpfAluno().getNumero() + " em " + dataEventoFormatada + " !");
    }

    @Override
    protected boolean processaEvento(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
