package DTOs;

import Entities.Endereco;

public class EnderecoDTO {
    private String rua;
    private String bairro;
    private int numero;
    private String complemento;
    private String cep;

    public EnderecoDTO(Endereco endereco) {
        this.rua = endereco.getRua();
        this.bairro = endereco.getBairro();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.cep = endereco.getCep();
    }

    public String getRua() {
        return rua;
    }
    public String getBairro() {
        return bairro;
    }
    public int getNumero() {
        return numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getCep() {
        return cep;
    }
}
