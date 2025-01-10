package br.com.nahtanm.adapter;

public class BuracoRedondo {
    private double raio;


    public BuracoRedondo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public Boolean encaixe(PinoRedondo pinoRedondo){
        Boolean result;
        result = (this.raio >= pinoRedondo.getRaio());
        return result;
    }

}
