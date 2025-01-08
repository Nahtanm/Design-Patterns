package br.com.nahtanm.facade;

public class Demo {
    public static void main(String[] args) {
        IApartamentoService iApartamentoService = new ApartamentoService();
        iApartamentoService.cadastrarApartamento(new Apartamento(12L, "Um texto qualquer sobre o apartamento"));
    }
}
