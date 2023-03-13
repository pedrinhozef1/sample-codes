package br.com.alura.loja.escola.academico.aluno;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.dominio.aluno.Email;
import br.com.alura.escola.academico.dominio.aluno.RegraDeNegocio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach(){
        this.aluno = new Aluno(new CPF("111.222.333-44"), "Teste", new Email("teste@teste.com"));
    }

    @Test
    void deveriaAdiconarUmTelefone(){
        this.aluno.adicionarTelefone("48", "833734581");

        assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    void deveriaAdicionarDoisTelefones(){
        this.aluno.adicionarTelefone("48", "132868365");
        this.aluno.adicionarTelefone("48", "639863829");

        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    void deveriaDispararExecaoRegraDeNegocioQuandoAlunoComMaisDeDoisTelefones(){

        RegraDeNegocio excecao = assertThrows(RegraDeNegocio.class,
                () -> {
                    aluno.adicionarTelefone("48", "123123123");
                    aluno.adicionarTelefone("48", "888774499");
                    aluno.adicionarTelefone("40", "111334455");
                });
        assertEquals("Aluno com o numero máximo de telefones cadastrados", excecao.getMessage());
    }
}
