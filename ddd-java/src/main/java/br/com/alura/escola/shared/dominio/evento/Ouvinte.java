package br.com.alura.escola.shared.dominio.evento;

public abstract class Ouvinte {
    public void processa(Evento evento){
        if (this.processaEvento(evento)) {
            this.reageAo(evento);
        }
    }

    protected abstract void reageAo(Evento evento);
    protected abstract boolean processaEvento(Evento evento);
}
