package DTOs;

import java.util.ArrayList;

import Entities.Pessoa;
import Entities.Endereco;

public class PessoaDTO {
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private ArrayList<Endereco> enderecos;
    private String profissao;

    public PessoaDTO(Pessoa pessoa) {
        this.nome = pessoa.getNome();
        this.idade = pessoa.getIdade();
        this.cpf = pessoa.getCpf();
        this.telefone = pessoa.getTelefone();
        this.profissao = pessoa.getProfissao();
        this.enderecos = pessoa.getEnderecos();
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCpf() {
        return cpf;
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