/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.banco.entidade;

/**
 *
 * @author Igor Fernandes
 */
public class ContaCorrente {

    private String nomeCorrentista;
    private String senha;
    private String numero;
    private double saldo;

    public ContaCorrente() {
    }

//    public ContaCorrente(double saldo) {
//        this.saldo = saldo;
//    }
// eu usaria esse contrutor com parametro pra na hora de criar  objeto, 
//já criar setando um valor para o saldo que não seja o default de double
    
    
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
