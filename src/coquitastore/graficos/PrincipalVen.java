/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coquitastore.graficos;

import java.awt.PopupMenu;

/**
 *
 * @author Toshiba
 */
public class PrincipalVen extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalVen() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDeskotopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCerrar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemRealizarVentas = new javax.swing.JMenuItem();
        jMenuItemConsultaProductos = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        getContentPane().setLayout(null);

        jDeskotopPanePrincipal.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout jDeskotopPanePrincipalLayout = new javax.swing.GroupLayout(jDeskotopPanePrincipal);
        jDeskotopPanePrincipal.setLayout(jDeskotopPanePrincipalLayout);
        jDeskotopPanePrincipalLayout.setHorizontalGroup(
            jDeskotopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1410, Short.MAX_VALUE)
        );
        jDeskotopPanePrincipalLayout.setVerticalGroup(
            jDeskotopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );

        getContentPane().add(jDeskotopPanePrincipal);
        jDeskotopPanePrincipal.setBounds(0, -40, 1410, 1055);

        jMenuBar1.setName("CokitaStore"); // NOI18N

        jMenu1.setText("Archivo");

        jMenuItemCerrar.setText("Cerrar");
        jMenuItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCerrar);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Ventas");

        jMenuItemRealizarVentas.setText("Realizar ventas ");
        jMenuItemRealizarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRealizarVentasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemRealizarVentas);

        jMenuItemConsultaProductos.setText("Consulta");
        jMenuItemConsultaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaProductosActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemConsultaProductos);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ayuda");

        jMenuItem9.setText("Acerca de...");
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarActionPerformed
        // TODO add your handling code here:
       // System.exit(0);
       this.dispose();
       
        
    }//GEN-LAST:event_jMenuItemCerrarActionPerformed

    private void jMenuItemConsultaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaProductosActionPerformed
        // TODO add your handling code here:
        ConsultaProductos consultaProductos=new ConsultaProductos ();
        PopupMenu consultaProducto;
        jDeskotopPanePrincipal.add(consultaProductos);
        consultaProductos.show();
        
    }//GEN-LAST:event_jMenuItemConsultaProductosActionPerformed

    private void jMenuItemRealizarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarVentasActionPerformed
        // TODO add your handling code here:
        VentaProducto ventaProducto=new VentaProducto();
        jDeskotopPanePrincipal.add(ventaProducto);
        ventaProducto.show(); 
    }//GEN-LAST:event_jMenuItemRealizarVentasActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDeskotopPanePrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemCerrar;
    private javax.swing.JMenuItem jMenuItemConsultaProductos;
    private javax.swing.JMenuItem jMenuItemRealizarVentas;
    // End of variables declaration//GEN-END:variables
}
