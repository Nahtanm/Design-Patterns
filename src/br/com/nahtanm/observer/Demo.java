package br.com.nahtanm.observer;

public class Demo {
    public static void main(String[] args) {

        Noticia noticia = new Noticia();
        noticia.addObservador(new JornalLocal());
        noticia.addObservador(new JornalLocalDeOutraCidade());
        noticia.publish("Peixe morre afogado no rio que avia secado");

    }
}
