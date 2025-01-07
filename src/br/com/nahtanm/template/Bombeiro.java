package br.com.nahtanm.template;

public class Bombeiro extends Trabalhador {
    @Override
    protected void trabalhando() {
        System.out.println("Apagando o fogo");
    }
}
