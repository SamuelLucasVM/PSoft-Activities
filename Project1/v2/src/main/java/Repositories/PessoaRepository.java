package Repositories;

import Entities.Pessoa;

import java.util.HashMap;

public class PessoaRepository {
    private HashMap<String, Pessoa> pessoas;

    public PessoaRepository() {
        pessoas = new HashMap<String, Pessoa>();
    }

    public void addPessoa(Pessoa pessoa) {
        if (!pessoas.containsKey(pessoa.getCpf())) {
            pessoas.put(pessoa.getCpf(), pessoa);
        }
    }

    public Pessoa getPessoa(String cpf) {
        Pessoa response = null;
        if (pessoas.containsKey(cpf)){
            response = pessoas.get(cpf);
        }
        return response;
    }

    public void updatePessoa(Pessoa pessoa) {
        if (pessoas.containsKey(pessoa.getCpf())) {
            pessoas.put(pessoa.getCpf(), pessoa);
        }
    }

    public void deletePessoa(String cpf) {
        if (pessoas.containsKey(cpf)) {
            pessoas.remove(cpf);
        }
    }
}
