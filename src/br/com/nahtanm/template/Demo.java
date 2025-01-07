package br.com.nahtanm.template;

public class Demo {
    public static void main(String[] args) {
        Trabalhador bombeiro = new Bombeiro();
        bombeiro.executarRotina();

        System.out.println();

        Trabalhador advogado = new Advogado();
        advogado.executarRotina();
    }
}
