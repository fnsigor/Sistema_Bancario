/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.banco.tela;

import br.com.banco.entidade.ContaCorrente;
import br.com.banco.regra_negocio.ContaNegocio;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor Fernandes
 */
public class CaixaEletronico extends javax.swing.JFrame {

    private ContaCorrente contaCorrente;

    public CaixaEletronico() {
        initComponents();
        logado.setVisible(false);

    }
//isso se chama sobrecarga de metodos/metodos contrutores = dois construtores na mesma classe.  Isso só é possível se os construtores tiverem parametros diferentes

    public CaixaEletronico(ContaCorrente conta) {
        initComponents();
        contaCorrente = conta;
        // aqui não precisou usar o this. pois as váriaveis conta(local) e contaCorrente(global) possuem nomes diferentes
        logado.setVisible(false);
        lbCorrentista.setText("Correntista: " + contaCorrente.getNomeCorrentista());
        lbNumeroConta.setText("conta: " +contaCorrente.getNumero());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        varSenha = new javax.swing.JPasswordField();
        btLogado = new javax.swing.JButton();
        logado = new javax.swing.JPanel();
        btSaldo = new javax.swing.JButton();
        btDeposito = new javax.swing.JButton();
        btSaque = new javax.swing.JButton();
        lbCorrentista = new javax.swing.JLabel();
        lbNumeroConta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caixa Eletrônico");

        principal.setToolTipText("");
        principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Caixa Eletrônico");

        lbSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSenha.setText("Senha:");

        btLogado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLogado.setText("Entrar");
        btLogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogadoActionPerformed(evt);
            }
        });

        logado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btSaldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSaldo.setText("Saldo");
        btSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaldoActionPerformed(evt);
            }
        });

        btDeposito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btDeposito.setText("Deposito");
        btDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositoActionPerformed(evt);
            }
        });

        btSaque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSaque.setText("Saque");
        btSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaqueActionPerformed(evt);
            }
        });

        lbCorrentista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCorrentista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbNumeroConta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNumeroConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout logadoLayout = new javax.swing.GroupLayout(logado);
        logado.setLayout(logadoLayout);
        logadoLayout.setHorizontalGroup(
            logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCorrentista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(logadoLayout.createSequentialGroup()
                        .addGroup(logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbNumeroConta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSaldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addComponent(btDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logadoLayout.setVerticalGroup(
            logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCorrentista, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lbNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbSenha)
                .addGap(18, 18, 18)
                .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogadoActionPerformed
        String senha = String.valueOf(varSenha.getPassword());
        //valueoff transforma valores em String, que nem o ParseInt
        if (senha.equals(contaCorrente.getSenha())) {
            logado.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Senha Incorreta");
        }
        varSenha.setText("");
    }//GEN-LAST:event_btLogadoActionPerformed

    private void btSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaldoActionPerformed
        JOptionPane.showMessageDialog(null, "Seu saldo é de " + contaCorrente.getSaldo() + " reais");
    }//GEN-LAST:event_btSaldoActionPerformed

    private void btDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositoActionPerformed
        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
        ContaNegocio cn = new ContaNegocio();
        cn.fazerDeposito(contaCorrente, valorDeposito);
        JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso. Seu saldo agora é de " + contaCorrente.getSaldo() + " reais");
    }//GEN-LAST:event_btDepositoActionPerformed

    private void btSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaqueActionPerformed
        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
        ContaNegocio cn = new ContaNegocio();
        String msg = cn.fazerSaque(contaCorrente, valorSaque);
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_btSaqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaixaEletronico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeposito;
    private javax.swing.JButton btLogado;
    private javax.swing.JButton btSaldo;
    private javax.swing.JButton btSaque;
    private javax.swing.JLabel lbCorrentista;
    private javax.swing.JLabel lbNumeroConta;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel logado;
    private javax.swing.JPanel principal;
    private javax.swing.JPasswordField varSenha;
    // End of variables declaration//GEN-END:variables
}
