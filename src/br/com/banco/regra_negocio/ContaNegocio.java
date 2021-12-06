/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.banco.regra_negocio;

import br.com.banco.entidade.ContaCorrente;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor Fernandess
 */
public class ContaNegocio {

    public void cadastrarContaCorrente(ContaCorrente conta) {
        conta.setSenha(gerarSenha());
        conta.setNumero(gerarNumeroConta());
    }

    private String gerarNumeroConta() {

        String numeroAleatorio = "";
        for (int i = 0; i < 5; i++) {
            numeroAleatorio += (int) (Math.random() * 10);
        }

        return numeroAleatorio;
    }

    private String gerarSenha() {

        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
            "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",};
        //isso é um vetor (array unidimensional)

        int tamanho = letras.length;
        String senha = "";
        int indice;

        for (int i = 0; i < 4; i++) {
            indice = (int) (Math.random() * tamanho);
            senha = senha + letras[indice];
        }

        return senha;
    }

    public void fazerDeposito(ContaCorrente conta, double valorDeposito) {
//        double total = valorDeposito + conta.getSaldo();
//        conta.setSaldo(total);
        conta.setSaldo(valorDeposito + conta.getSaldo());

    }

    public String fazerSaque(ContaCorrente conta, double valorSaque) {
        String mensagem;
        if (valorSaque <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valorSaque);
            mensagem = "Retire seu dinheiro";
        } else {
            mensagem = "O saldo de "+conta.getSaldo()+" reais é insuficiente para realizar esta operação";
        }
        return mensagem;
    }

//    public static void main(String[] args) {
//        ContaNegocio cn = new ContaNegocio();
//        System.out.println(cn.gerarNumeroConta());
//    }
}
