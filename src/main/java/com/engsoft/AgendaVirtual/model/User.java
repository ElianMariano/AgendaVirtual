package com.engsoft.AgendaVirtual.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    private @Id @GeneratedValue Long id;
    private String nome;
    private String telefone;
    private String cidade;
    private String rua;
    private String uf;
    private String senha;
    private String idade;
    private String email;
    private Date nascimento;

    public User(){}

    public User(String nome, String telefone, String email){
    }

    public Long getId(){
        return id;
    }

    public String getIdade() {
    	return this.idade;
    }
    public void setIdade(String idade) {
    	this.idade = idade;
    }
    public void setId(Long id){
        this.id = id;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return String.format("Id: %s, Nome: %s, Email: %s", id, nome, email);
    }
}
