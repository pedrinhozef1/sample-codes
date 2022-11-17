package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.TipoEvento;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class AlunoMatriculado implements Evento {
    private final CPF cpfAluno;
    private final LocalDateTime dataEvento;

    public AlunoMatriculado(CPF cpf){
        this.cpfAluno = cpf;
        this.dataEvento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime dataEvento(){
        return this.dataEvento;
    }

    public CPF getCpfAluno(){
        return this.cpfAluno;
    }

    @Override
    public TipoEvento tipoEvento(){
        return TipoEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes(){
        return Map.of("cpf", cpfAluno);
    }
}
