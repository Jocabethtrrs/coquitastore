/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coquitastore.graficos;

import coquitastore.datos.UsuarioDAO;
import coquitastore.domain.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class BajaUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form AltaUser
     */
    public BajaUser() {
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

        jTextFieldName = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCerrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Baja de Usuario");
        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldName);
        jTextFieldName.setBounds(321, 143, 168, 30);

        jButtonEliminar.setText("Eliminar Usuario");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar);
        jButtonEliminar.setBounds(190, 210, 110, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Baja de Usuarios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 20, 156, 22);

        jLabel2.setText("Nombre de Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 150, 120, 20);

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrar);
        jButtonCerrar.setBounds(330, 210, 80, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coquitastore/graficos/iconos/idk.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 10, 90, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
           UsuarioDAO usuarioDAO= new UsuarioDAO ();
        String usuario=jTextFieldName.getText();
        int resultOption=JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar a "+ usuario + " de la base de datos?");
        if (resultOption== JOptionPane.YES_OPTION){
                  Usuario eliminarUsuario=new Usuario (usuario);
               try {
                   usuarioDAO.eliminar(eliminarUsuario);
               } catch (SQLException ex) {
                   Logger.getLogger(BajaUser.class.getName()).log(Level.SEVERE, null, ex);
               }
        }else{
            JOptionPane.showMessageDialog(null, "Operacion sin cambio.");
            
        }
     
 
      
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
