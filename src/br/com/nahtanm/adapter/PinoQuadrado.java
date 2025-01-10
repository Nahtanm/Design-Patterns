package br.com.nahtanm.adapter;

public class PinoQuadrado {
    private double cumprimento;

    public PinoQuadrado(double cumprimento) {
        this.cumprimento = cumprimento;
    }

    public double getCumprimento() {
        return cumprimento;
    }

    public double getQuadrado(){
        double resultado;
        resultado = Math.pow(this.cumprimento, 2);
        return resultado;
    }

}
