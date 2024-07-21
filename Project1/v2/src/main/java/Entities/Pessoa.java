package Entities;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private ArrayList<Endereco> enderecos;
    private String profissao;

    public Pessoa(String nome, int idade, String cpf, String telefone, Endereco endereco, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.profissao = profissao;
        this.enderecos = new ArrayList<Endereco>();
        this.enderecos.add(endereco);
    }

    public Pessoa(String nome, int idade, String cpf, String telefone, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.profissao = profissao;
        this.enderecos = new ArrayList<Endereco>();
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }
    public String getProfissao() {
        return profissao;
    }
}