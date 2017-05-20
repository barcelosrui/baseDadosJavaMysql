/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededos;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author Convite
 */
public class verInsersoes extends javax.swing.JFrame {
    private static final String USERNAME ="root";
    private static final String PASSWORD ="";
    private static final String URL="jdbc:mysql://localhost:3306/testar";
    /**
     * Creates new form verInsersoes
     */
    public verInsersoes() {
        initComponents();
        MostraTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lID = new javax.swing.JLabel();
        lIDSelect = new javax.swing.JLabel();
        lnome = new javax.swing.JLabel();
        lcontacto = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfContacto = new javax.swing.JTextField();
        lIdade = new javax.swing.JLabel();
        tfIdade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsers = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btApagar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lID.setText("ID:");

        lnome.setText("Nome:");

        lcontacto.setText("Contacto:");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        lIdade.setText("Idade:");

        tbUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CONTACTO", "IDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsers);

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btApagar.setText("Apagar");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lnome)
                                .addGap(36, 36, 36)
                                .addComponent(tfNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lcontacto)
                                        .addComponent(lIdade)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfContacto)
                                            .addComponent(tfIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(lIDSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btApagar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lID)
                    .addComponent(lIDSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcontacto)
                    .addComponent(tfContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lIdade)
                    .addComponent(btApagar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tbUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsersMouseClicked
        // TODO add your handling code here:
        int i = tbUsers.getSelectedRow();
        TableModel mod = tbUsers.getModel();
        lIDSelect.setText(mod.getValueAt(i, 0)+"");
        tfNome.setText(mod.getValueAt(i, 1)+"");
        tfContacto.setText(mod.getValueAt(i, 2)+"");
        tfIdade.setText(mod.getValueAt(i, 3)+"");
    }//GEN-LAST:event_tbUsersMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        String update = "UPDATE tbuser SET nome='"+tfNome.getText()+"',contacto='"+tfContacto.getText()+"',idade='"+tfIdade.getText()+"' WHERE id='"+lIDSelect.getText()+"'";
        executaQuery(update,"Editados");
    }//GEN-LAST:event_btEditarActionPerformed

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
        // TODO add your handling code here:
        String delete = "DELETE FROM tbuser WHERE id='"+lIDSelect.getText()+"'";
        executaQuery(delete,"Apagados");
    }//GEN-LAST:event_btApagarActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
        ResultSet rs = null;
        Statement st = null;
        int id = 0;
        try {
            Connection conn = getConnection();
            st = conn.createStatement();           
            String selectID = "SELECT id FROM tbuser ORDER BY id DESC limit 1;";
            rs = st.executeQuery(selectID);
            if (rs.next()) {
                id = rs.getInt("id");
            } 
            id++;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()+"\n"+ex.getSQLState()+"\n"+ex.getSQLState());
        }
        String insert = "INSERT INTO testar.tbuser (id,nome,contacto,idade) VALUES ('"+id+"','"+tfNome.getText()+"','"+tfContacto.getText()+"','"+tfIdade.getText()+"');";
        executaQuery(insert,"Inseridos");
    }//GEN-LAST:event_btInserirActionPerformed
    public Connection getConnection(){
        Connection conn;
        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            return conn;
        }catch(SQLException ex){
            ex.getMessage();
            return null;
        }
    }
    
    public ArrayList<Tbuser> getUL(){
        ArrayList<Tbuser> ul = new ArrayList<>();
        Connection conn = getConnection();
        String select = "SELECT * FROM tbuser;";
        Statement st;
        ResultSet rs;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(select);
            Tbuser user;
            while(rs.next()){
                user = new Tbuser(rs.getInt("id"),rs.getString("nome"),rs.getInt("contacto"),rs.getInt("idade"));
                ul.add(user);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return ul;
    }
    public void MostraTabela(){
        ArrayList<Tbuser> lista = getUL();
        DefaultTableModel mod =(DefaultTableModel)tbUsers.getModel();
        
        Object[] row = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            row[0]=lista.get(i).getId();
            row[1]=lista.get(i).getNome();
            row[2]=lista.get(i).getContacto();
            row[3]=lista.get(i).getIdade();          
            mod.addRow(row);
        }
    }
   
    
    public void executaQuery(String Query, String mensagem){
        Connection conn = getConnection();
        Statement st;
        try {
            st = conn.createStatement();
            if((st.executeUpdate(Query))==1){
                DefaultTableModel mod = (DefaultTableModel)tbUsers.getModel();
                mod.setRowCount(0);
                MostraTabela();
                JOptionPane.showMessageDialog(null,"Dados "+ mensagem+" com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"Dados "+ mensagem+" sem sucesso.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(verInsersoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verInsersoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verInsersoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verInsersoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verInsersoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btInserir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lID;
    private javax.swing.JLabel lIDSelect;
    private javax.swing.JLabel lIdade;
    private javax.swing.JLabel lcontacto;
    private javax.swing.JLabel lnome;
    private javax.swing.JTable tbUsers;
    private javax.swing.JTextField tfContacto;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}