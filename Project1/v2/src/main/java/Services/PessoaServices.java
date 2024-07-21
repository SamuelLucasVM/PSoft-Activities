package Services;

import DTOs.PessoaDTO;
import Entities.Pessoa;
import Entities.Endereco;
import Repositories.PessoaRepository;

public class PessoaServices {
    private PessoaRepository pRepository;

    public PessoaServices() {
        pRepository = new PessoaRepository();
    }

    public void createPessoa(String nome, int idade, String cpf, String telefone, String profissao) {
        Pessoa pessoa = new Pessoa(nome, idade, cpf, telefone, profissao);

        pRepository.addPessoa(pessoa);
    }

    public void createPessoa(String nome, int idade, String cpf, String telefone, Endereco endereco, String profissao) {
        Pessoa pessoa = new Pessoa(nome, idade, cpf, telefone, endereco, profissao);

        pRepository.addPessoa(pessoa);
    }

    public PessoaDTO readPessoa(String cpf) {
        Pessoa pessoa = pRepository.getPessoa(cpf);

        return new PessoaDTO(pessoa);
    }

    public void updateIdadePessoa(String cpf, int idade) {
        Pessoa pessoa = pRepository.getPessoa(cpf);

        pessoa.setIdade(idade);

        pRepository.updatePessoa(pessoa);
    }

    public void updateTelefonePessoa(String cpf, String telefone) {
        Pessoa pessoa = pRepository.getPessoa(cpf);

        pessoa.setTelefone(telefone);

        pRepository.updatePessoa(pessoa);
    }

    public void addEnderecoPessoa(String cpf, Endereco endereco) {
        Pessoa pessoa = pRepository.getPessoa(cpf);

        pessoa.addEndereco(endereco);

        pRepository.updatePessoa(pessoa);
    }

    public void updateProfissaoPessoa(String cpf, String profissao) {
        Pessoa pessoa = pRepository.getPessoa(cpf);

        pessoa.setProfissao(profissao);

        pRepository.updatePessoa(pessoa);
    }

    public void deletePessoa(String cpf) {
        pRepository.deletePessoa(cpf);
    }
}
