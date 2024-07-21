package Pessoa;

public class PessoaServices {
    private PessoaRepository pRepository;

    PessoaServices() {
        pRepository = new PessoaRepository();
    }

    void createPessoa(String nome, int idade, String cpf, String telefone, String endereco, String profissao) {
        Pessoa pessoa = new Pessoa(nome, idade, cpf, telefone, endereco, profissao);

        pRepository.addPessoa(pessoa);
    }

    String readPessoa(String cpf) {
        Pessoa pessoa = pRepository.getPessoa(cpf);

        return pessoa.toString();
    }

    void updateIdadePessoa(String cpf, int idade) {
        Pessoa pessoa = pRepository.getPessoa(cpf);

        pessoa.setIdade(idade);

        pRepository.updatePessoa(pessoa);
    }

    void updateTelefonePessoa(String cpf, String telefone) {
        Pessoa pessoa = pRepository.getPessoa(cpf);

        pessoa.setTelefone(telefone);

        pRepository.updatePessoa(pessoa);
    }

    void addEnderecoPessoa(String cpf, String endereco) {
        Pessoa pessoa = pRepository.getPessoa(cpf);

        pessoa.addEndereco(endereco);

        pRepository.updatePessoa(pessoa);
    }

    void updateProfissaoPessoa(String cpf, String profissao) {
        Pessoa pessoa = pRepository.getPessoa(cpf);

        pessoa.setProfissao(profissao);

        pRepository.updatePessoa(pessoa);
    }

    void deletePessoa(String cpf) {
        pRepository.deletePessoa(cpf);
    }
}
