package Controllers;

import DTOs.PessoaDTO;
import Entities.Endereco;
import Services.PessoaServices;

public class PessoaController {
    private PessoaServices pServices;

    public PessoaController() {
        pServices = new PessoaServices();
    }

    public void createPessoa(String nome, int idade, String cpf, String telefone, String profissao) {
        pServices.createPessoa(nome, idade, cpf, telefone, profissao);
    }
    public void createPessoa(String nome, int idade, String cpf, String telefone, Endereco endereco, String profissao) {
        pServices.createPessoa(nome, idade, cpf, telefone, endereco, profissao);
    }

    public PessoaDTO readPessoa(String cpf) {
        return pServices.readPessoa(cpf);
    }

    public void updateIdadePessoa(String cpf, int idade) {
        pServices.updateIdadePessoa(cpf, idade);
    }

    public void updateTelefonePessoa(String cpf, String telefone) {
        pServices.updateTelefonePessoa(cpf, telefone);
    }

    public void addEnderecoPessoa(String cpf, Endereco endereco) {
        pServices.addEnderecoPessoa(cpf, endereco);
    }

    public void updateProfissaoPessoa(String cpf, String profissao) {
        pServices.updateProfissaoPessoa(cpf, profissao);
    }

    public void deletePessoa(String cpf) {
        pServices.deletePessoa(cpf);
    }
}
