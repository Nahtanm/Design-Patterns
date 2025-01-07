package br.com.nahtanm.template;


public abstract class Trabalhador {

    public void executarRotina() {
        acordando();
        irAoTrabalho();
        voltandoDoTrabalho();
        trabalhando();
    }

   protected abstract void trabalhando();

    private void acordando() {
        System.out.println("Acordando");
    }

    private void irAoTrabalho() {
        System.out.println("Indo ao trabalho");
    }

    private void voltandoDoTrabalho() {
        System.out.println("Voltando do trabalho");
    }

}
