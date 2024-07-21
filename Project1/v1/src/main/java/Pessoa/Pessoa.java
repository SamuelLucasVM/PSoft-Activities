package Pessoa;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private ArrayList<String> enderecos;
    private String profissao;

    Pessoa(String nome, int idade, String cpf, String telefone, String endereco, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.profissao = profissao;
        this.enderecos = new ArrayList<String>();
        this.enderecos.add(endereco);
    }

    @Override
    public String toString() {
        String response = String.format(
            "nome: %s \n" + 
            "idade: %d \n" +
            "cpf: %s \n" +
            "telefone: %s \n" +
            "profissao: %s \n", 
            nome, idade, cpf, telefone, profissao);

        response += "enderecos: \n";
        for (String endereco : enderecos) {
            response += String.format("     %s\n", endereco);
        }

        return response;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    void addEndereco(String endereco) {
        this.enderecos.add(endereco);
    }

    void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    String getCpf(){
        return this.cpf;
    }
}