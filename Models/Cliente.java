package Models;

import DB.ContasDB;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String idade;
    private int id;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente(){}
    public Cliente(String nome, String idade, int id, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.senha = senha;
    }

    public void addConta(Contas novaConta) {
        ContasDB contasDB = new ContasDB();
        contasDB.novaConta(novaConta);
    }




    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", id=" + id +
                ", senha='" + senha + '\'' +
                '}';
    }
}
