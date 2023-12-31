/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitemasimplificadodechamado;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author satarosa
 */
public class Chamados extends javax.swing.JFrame {

 
    
    ArrayList <String> pessoas = new ArrayList<>();
    ArrayList <String> velhos = new ArrayList<>();
    ArrayList <String> ultimosChamados = new ArrayList<>();
    int quantidadeDeprioridades;
    
    

 
    
    public Chamados() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();
        ChamarNormal = new javax.swing.JButton();
        adicionarPessoaNormal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA DE CHAMADO - EASYCOMPUTER");
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 100, 700, 30);

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(840, 510, 300, 100);

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
        jScrollPane1.setViewportView(area1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 140, 960, 220);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chamados_Deferidos.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 370, 450, 40);

        area2.setEditable(false);
        area2.setBackground(new java.awt.Color(204, 255, 204));
        area2.setColumns(1);
        area2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        area2.setForeground(new java.awt.Color(255, 51, 51));
        area2.setRows(1);
        jScrollPane4.setViewportView(area2);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(190, 420, 357, 330);

        ChamarNormal.setText("Chamar");
        ChamarNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChamarNormalActionPerformed(evt);
            }
        });
        getContentPane().add(ChamarNormal);
        ChamarNormal.setBounds(970, 640, 120, 23);

        adicionarPessoaNormal.setText("Adicionar");
        adicionarPessoaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPessoaNormalActionPerformed(evt);
            }
        });
        getContentPane().add(adicionarPessoaNormal);
        adicionarPessoaNormal.setBounds(830, 640, 130, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SECRETARIA MUNICIPAL DE SAUDE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 770, 1370, 20);

        jLabel5.setBackground(new java.awt.Color(255, 204, 102));
        jLabel5.setFont(new java.awt.Font("Nyala", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SYSTEM_LOGOpng.png"))); // NOI18N
        jLabel5.setText("SISTEMA DE CHAMADO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 8, 1490, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoGeral.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-200, 0, 1600, 810);

        setSize(new java.awt.Dimension(1420, 836));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
      int cont = 0;
      
      int chamPrioridade = 0;
      int qttdPcall = 1;
      int adicionadoPrioridade;
      int sendoCham = 0;
      int chamoudaPrioridade;
      int contador;
      
     
       
    public void addPessoa(int cont){
        pessoas.add("PNA"+cont);
        jLabel4.setText("SECRETARIA MUNICIPAL DE SAUDE! \n ALTERBYTE SYSTEM");
    }
    int incrementar = 0;
    private void ChamarNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChamarNormalActionPerformed
        
      
        if(incrementar < pessoas.size() && qttdPcall <= 5){
            area1.setText("\n"+"         "+pessoas.get(incrementar));
            qttdPcall++;
           
            if (qttdPcall >= 5){
                qttdPcall=0;
                if(!velhos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "ATENÇÃO\n Há, " +quantidadeDeprioridades+" na fila de Prioridades aguardando serem chamadas");
                }
            }
            
            
            if(incrementar >= 1){
                area2.setText(area2.getText()+"\n"+pessoas.get(incrementar)); 
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

      int aumentar = 0;
    private void adicionarPessoaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPessoaNormalActionPerformed
        // TODO add your handling code here:
       
        cont++;
        contador++;
        pessoas.add("PNA"+cont);
       
    }//GEN-LAST:event_adicionarPessoaNormalActionPerformed

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
            java.util.logging.Logger.getLogger(Chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chamados().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
