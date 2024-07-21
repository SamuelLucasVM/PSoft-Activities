package Pessoa;

import java.util.HashMap;

public class PessoaRepository {
    private HashMap<String, Pessoa> pessoas;

    PessoaRepository() {
        pessoas = new HashMap<String, Pessoa>();
    }

    void addPessoa(Pessoa pessoa) {
        if (!pessoas.containsKey(pessoa.getCpf())) {
            pessoas.put(pessoa.getCpf(), pessoa);
        }
    }

    Pessoa getPessoa(String cpf) {
        Pessoa response = null;
        if (pessoas.containsKey(cpf)){
            response = pessoas.get(cpf);
        }
        return response;
    }

    void updatePessoa(Pessoa pessoa) {
        if (pessoas.containsKey(pessoa.getCpf())) {
            pessoas.put(pessoa.getCpf(), pessoa);
        }
    }

    void deletePessoa(String cpf) {
        if (pessoas.containsKey(cpf)) {
            pessoas.remove(cpf);
        }
    }
}
