package br.com.nahtanm.adapter;

public class AdaptadorPinoQuadrado extends PinoRedondo {
    private PinoQuadrado pinoQuadrado;

    public AdaptadorPinoQuadrado(PinoQuadrado pinoQuadrado) {
        this.pinoQuadrado = pinoQuadrado;
    }

    @Override
    public double getRaio() {
        double resultado;
        resultado = (Math.sqrt(Math.pow((this.pinoQuadrado.getCumprimento() / 2), 2) * 2));
        return resultado;
    }
}
