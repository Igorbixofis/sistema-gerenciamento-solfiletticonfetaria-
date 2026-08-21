package com.example.doces.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;


import java.util.Date;

@Entity
public class Doce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String nome;
    private String recheio;
    private double preco;
    private Date fabricacao;
    private Date validade;


    // construtor com id para que a maquina possa criar o mesmo no banco de dados
    public Doce(long id, String nome, String recheio, double preco, Date fabricacao, Date validade) {
        this.id = id;
        this.nome = nome;
        this.recheio = recheio;
        this.preco = preco;
        this.fabricacao = fabricacao;
        this.validade = validade;
    }

    // construtor sem o id para inserção de dados principalmente no response e no postman
    public Doce( String nome, String recheio, double preco, Date fabricacao, Date validade) {

        this.nome = nome;
        this.recheio = recheio;
        this.preco = preco;
        this.fabricacao = fabricacao;
        this.validade = validade;
    }


    //construtor vazio para que seja possivel usar a entdade em outros arquivos do mesmo projeto
    public Doce() {

    }//



    // abaixo esta o getter and setter para a manipulação crud das informações
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }


}