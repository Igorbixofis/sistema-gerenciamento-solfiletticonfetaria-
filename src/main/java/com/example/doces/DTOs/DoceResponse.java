package com.example.doces.DTOs;

import java.util.Date;

// response com criação de classe, getter and setter e construtor vazio como um método de proteção para o banco de dados/back end não se ligue diretamente com o front para não ocorrer vazamento de dados
public class DoceResponse {

    private String nome;
    private String recheio;
    private double preco;
    private Date fabricacao;
    private Date validade;


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



    public DoceResponse(){}


    public DoceResponse( String nome, String recheio, double preco, Date fabricacao, Date validade) {
        this.nome = nome;
        this.recheio = recheio;
        this.preco = preco;
        this.fabricacao = fabricacao;
        this.validade = validade;
    }


}
