package br.com.nahtanm.facade;

public class ApartamentoService implements IApartamentoService{
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isApartamentoCadatrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);

        if (isApartamentoCadatrado && !isCamposValidos){
            return false;
        }
        return cadastrarNoBanco(apartamento);
    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento){
        // Fazer consulta;
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento){
        //Verificar campos
        return false;
    }

}
