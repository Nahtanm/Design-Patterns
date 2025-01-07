package br.com.nahtanm.observer;

import java.util.ArrayList;
import java.util.List;

public class Noticia implements Assunto {
    private List<Observador> observadors = new ArrayList<>();
    private String titulo;

    public void publish(String titulo){
        this.titulo = titulo;
        notificarTodos();
    }

    @Override
    public void addObservador(Observador observador) {
        observadors.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadors.remove(observador);
    }

    @Override
    public void notificarTodos() {
        observadors.forEach(ob -> ob.ultimasNoticias(this));
    }

    @Override
    public String toString() {
        return "Noticia{" +
                " titulo='" + titulo + '\'' +
                '}';
    }
}
