package Entities;

public class Endereco {
    private String rua;
    private String bairro;
    private int numero;
    private String complemento;
    private String cep;

    public Endereco(String rua, String bairro, int numero, String cep) { this(rua, bairro, numero, "", cep); }

    public Endereco(String rua, String bairro, int numero, String complemento, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
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
