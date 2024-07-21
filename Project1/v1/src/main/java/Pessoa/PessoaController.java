package Pessoa;
public class PessoaController {
    private PessoaServices pServices;

    public PessoaController() {
        pServices = new PessoaServices();
    }

    public void createPessoa(String nome, int idade, String cpf, String telefone, String endereco, String profissao) {
        pServices.createPessoa(nome, idade, cpf, telefone, endereco, profissao);
    }

    public String readPessoa(String cpf) {
        return pServices.readPessoa(cpf);
    }

    public void updateIdadePessoa(String cpf, int idade) {
        pServices.updateIdadePessoa(cpf, idade);
    }

    public void updateTelefonePessoa(String cpf, String telefone) {
        pServices.updateTelefonePessoa(cpf, telefone);
    }

    public void addEnderecoPessoa(String cpf, String endereco) {
        pServices.addEnderecoPessoa(cpf, endereco);
    }

    public void updateProfissaoPessoa(String cpf, String profissao) {
        pServices.updateProfissaoPessoa(cpf, profissao);
    }

    public void deletePessoa(String cpf) {
        pServices.deletePessoa(cpf);
    }
}
