
package aplicacion;


public class Inicio extends javax.swing.JFrame {

   
    public Inicio() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuNuevaEmp = new javax.swing.JMenuItem();
        menuArea = new javax.swing.JMenu();
        menuNuevaArea = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuNuevaVenta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuNuevoReporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setFont(new java.awt.Font("Andalus", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(255, 153, 0));
        setName("frmInicio"); // NOI18N
        setSize(new java.awt.Dimension(500, 300));

        jMenuBar1.setName("menuInicio"); // NOI18N
        jMenuBar1.setOpaque(false);

        jMenu2.setText("Archivo");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        mnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        mnSalir.setText("Salir");
        mnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mnSalir);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Expediente");
        jMenu3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        menuNuevaEmp.setText("Nuevo Expediente");
        menuNuevaEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevaEmpActionPerformed(evt);
            }
        });
        jMenu3.add(menuNuevaEmp);

        jMenuBar1.add(jMenu3);

        menuArea.setText("Area");
        menuArea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        menuNuevaArea.setText("Nueva Area");
        menuNuevaArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevaAreaActionPerformed(evt);
            }
        });
        menuArea.add(menuNuevaArea);

        jMenuBar1.add(menuArea);

        jMenu5.setText("Doctor");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        menuNuevaVenta.setText("Nueva Doctor");
        menuNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevaVentaActionPerformed(evt);
            }
        });
        jMenu5.add(menuNuevaVenta);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        menuNuevoReporte.setText("Nuevo reporte");
        menuNuevoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoReporteActionPerformed(evt);
            }
        });
        jMenu6.add(menuNuevoReporte);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnSalirActionPerformed

    private void menuNuevaEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevaEmpActionPerformed
        Expediete form = new Expediete();
        form.setVisible(true);
        this.enable(false);
        this.setVisible(false);
    }//GEN-LAST:event_menuNuevaEmpActionPerformed

    private void menuNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevaVentaActionPerformed
         FrmDoctor a = new FrmDoctor();
        
        a.setVisible(true);
        this.enable(false);
        this.setVisible(false);
    }//GEN-LAST:event_menuNuevaVentaActionPerformed

    private void menuNuevaAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevaAreaActionPerformed
        FrmArea a = new FrmArea();
        
        a.setVisible(true);
        this.enable(false);
        this.setVisible(false);
    }//GEN-LAST:event_menuNuevaAreaActionPerformed

    private void menuNuevoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoReporteActionPerformed
        FrmReporte a = new FrmReporte();
        a.setVisible(true);
        this.enable(false);
        this.setVisible(false);
    }//GEN-LAST:event_menuNuevoReporteActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArea;
    private javax.swing.JMenuItem menuNuevaArea;
    private javax.swing.JMenuItem menuNuevaEmp;
    private javax.swing.JMenuItem menuNuevaVenta;
    private javax.swing.JMenuItem menuNuevoReporte;
    private javax.swing.JMenuItem mnSalir;
    // End of variables declaration//GEN-END:variables
}
