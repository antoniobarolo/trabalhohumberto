package br.espm.poo.aula05;

import java.util.UUID;

public class Cliente {

    private final UUID uuid;
    private String nome;
    private String telefone;
    private Conta conta;

    public Cliente() {
        this.uuid = UUID.randomUUID();
        this.conta = new Conta();
    }

    public String getId() {
        return uuid.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (null == nome || nome.trim().length() == 0) {
            throw new RuntimeException("Nome nao pode ser vazio");
        }
        this.nome = nome.trim();
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
