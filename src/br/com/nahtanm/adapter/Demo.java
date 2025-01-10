package br.com.nahtanm.adapter;

public class Demo {
    public static void main(String[] args) {
        BuracoRedondo buracoRedondo = new BuracoRedondo(5);
        PinoRedondo pinoRedondo = new PinoRedondo(5);

        if (buracoRedondo.encaixe(pinoRedondo)){
            System.out.println("Pino encaixado");
        }

        AdaptadorPinoQuadrado adaptadorPinoQuadrado = new AdaptadorPinoQuadrado(new PinoQuadrado(3));
        AdaptadorPinoQuadrado adaptadorPinoQuadrado1 = new AdaptadorPinoQuadrado(new PinoQuadrado(10));

        if (buracoRedondo.encaixe(adaptadorPinoQuadrado)){
            System.out.println("Pino quadrado encaixado no buraco redondo");
        }else {
            System.out.println("Pino não encaixado");
        }

    }
}
