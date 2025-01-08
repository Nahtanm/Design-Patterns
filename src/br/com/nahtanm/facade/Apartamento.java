package br.com.nahtanm.facade;

public class Apartamento {
    private Long codigo;
    private String descricao;

    public Apartamento(Long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
