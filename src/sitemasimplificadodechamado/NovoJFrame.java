/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitemasimplificadodechamado;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author satarosa
 */
public class NovoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NovoJFrame
     */
    
      ArrayList <String> pessoas = new ArrayList<>();
    ArrayList <String> velhos = new ArrayList<>();
    ArrayList <String> ultimosChamados = new ArrayList<>();
    int quantidadeDeprioridades;
    
    
     
      int cont = 0;
      
      int chamPrioridade = 0;
      int qttdPcall = 1;
      int adicionadoPrioridade;
      int sendoCham = 0;
      int chamoudaPrioridade;
      int contador;
         int incrementar = 0;
           int aumentar = 0;
    public NovoJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        area1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();
        adicionarPessoaNormal = new javax.swing.JButton();
        ChamarNormal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoGeral.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 204, 102));
        jLabel5.setFont(new java.awt.Font("Nyala", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SYSTEM_LOGOpng.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario.png"))); // NOI18N

        area1.setEditable(false);
        area1.setBackground(new java.awt.Color(204, 255, 204));
        area1.setColumns(1);
        area1.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        area1.setForeground(new java.awt.Color(255, 51, 51));
        area1.setRows(1);
        area1.setToolTipText("");
        area1.setWrapStyleWord(true);
        area1.setAlignmentX(10.0F);
        area1.setAutoscrolls(false);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chamados_Deferidos.png"))); // NOI18N

        area2.setEditable(false);
        area2.setBackground(new java.awt.Color(204, 255, 204));
        area2.setColumns(1);
        area2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        area2.setForeground(new java.awt.Color(255, 51, 51));
        area2.setRows(1);
        jScrollPane4.setViewportView(area2);

        adicionarPessoaNormal.setText("Adicionar");
        adicionarPessoaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPessoaNormalActionPerformed(evt);
            }
        });

        ChamarNormal.setText("Chamar");
        ChamarNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChamarNormalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1096, 1096, 1096)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ChamarNormal, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(adicionarPessoaNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(284, 284, 284))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1670, Short.MAX_VALUE)
                            .addComponent(area1))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1690, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(area1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(adicionarPessoaNormal)
                .addGap(30, 30, 30)
                .addComponent(ChamarNormal)
                .addGap(170, 170, 170))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(447, 447, 447)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(401, 401, 401)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarPessoaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPessoaNormalActionPerformed
        // TODO add your handling code here:

        cont++;
        contador++;
        pessoas.add("PNA"+cont);

    }//GEN-LAST:event_adicionarPessoaNormalActionPerformed

    int podeChamar = 2000;
    private void ChamarNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChamarNormalActionPerformed

        if(incrementar < pessoas.size() && contador <= podeChamar ){
            area1.setText("\n"+"                          "+pessoas.get(incrementar));
            qttdPcall++;

            if (qttdPcall >= 5){
                qttdPcall=0;
                if(!velhos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "ATENÇÃO\n Há, " +quantidadeDeprioridades+" na fila de Prioridades aguardando serem chamadas");
                }
            }

            if(incrementar >= 1){
                area2.setText("      "+area2.getText()+"\n     "+pessoas.get(incrementar));
            }
            else{
                area2.setText(pessoas.get(incrementar));

            }

            incrementar++;

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Não há mais chamados a serem realizados!" );

        }

        /*
        int t = pessoas.size();

        JOptionPane.showMessageDialog(null, " Tamanho do array "+pessoas.size()+"tamanho do contador"+contador+"valor de incrementar"+incrementar);

        if(contador <= pessoas.size() && qttdPcall <= 5 ){
            JOptionPane.showMessageDialog(null, " ENTROU AKI! ");

            area1.setText("\n"+"         "+pessoas.get(incrementar));
            area1.setBackground(Color.yellow);
            area2.setText(area2.getText()+"\n"+pessoas.get(incrementar));
            ultimosChamados.add(pessoas.get(incrementar));
            qttdPcall++;
        }
        else{
            JOptionPane.showMessageDialog(null, " Não há mais chamados a serem realizados na categoria Normais! ");
        }
        if (qttdPcall == 5){
            qttdPcall=0;
            if(!velhos.isEmpty()){
                JOptionPane.showMessageDialog(null, "Há "+velhos.size()+" pessoas na fila de Prioridades aguardando serem chamadas");
            }
        }
        //else
        contador++;
        incrementar++;

        //metodo

        */
    }//GEN-LAST:event_ChamarNormalActionPerformed

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
            java.util.logging.Logger.getLogger(NovoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChamarNormal;
    private javax.swing.JButton adicionarPessoaNormal;
    private javax.swing.JTextArea area1;
    private javax.swing.JTextArea area2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
