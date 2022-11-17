package br.com.alura.escola.academico.dominio.aluno;

public class RegraDeNegocio extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public RegraDeNegocio(String mensagem){
        super(mensagem);
    }
}
