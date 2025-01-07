package br.com.nahtanm.observer;

public interface Assunto {

    void addObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarTodos();
}
