package com.example.doces.DTOs;
import java.util.Date;


// DTO para interligação do front com o banco
public class DoceDTO {

    private String nome;
    private String recheio;
    private double preco;
    private Date fabricacao;
    private Date validade;

    public DoceDTO(String nome, String recheio, double preco, Date fabricacao, Date validade) {
        this.nome = nome;
        this.recheio = recheio;
        this.preco = preco;
        this.fabricacao = fabricacao;
        this.validade = validade;
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
