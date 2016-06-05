

package aplicacion;

import javax.swing.JOptionPane;


public class Expediete extends javax.swing.JFrame {

  
    public Expediete() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDire = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        rdbM = new javax.swing.JRadioButton();
        rdbF = new javax.swing.JRadioButton();
        comboNivel = new javax.swing.JComboBox();
        checkFutbol = new javax.swing.JCheckBox();
        checkCantar = new javax.swing.JCheckBox();
        checkMusica = new javax.swing.JCheckBox();
        checkBailar = new javax.swing.JCheckBox();
        checkOtro = new javax.swing.JCheckBox();
        txtOtro = new javax.swing.JTextField();
        comboClase = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese los Datos del Expediente.");

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Telefono:");

        jLabel8.setText("Genero:");

        jLabel9.setText("municipio");

        jLabel10.setText("Medicamentos");

        jLabel12.setText("departamento");

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });

        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });

        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeKeyTyped(evt);
            }
        });

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtDire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireKeyTyped(evt);
            }
        });

        buttonGroup1.add(rdbM);
        rdbM.setSelected(true);
        rdbM.setText("Masculino");

        buttonGroup1.add(rdbF);
        rdbF.setText("Femenino");

        comboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ciudad arce", "colon", "lourdes" }));

        checkFutbol.setText("Paracetamos");

        checkCantar.setText("mebendasol");
        checkCantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCantarActionPerformed(evt);
            }
        });

        checkMusica.setText("Anaflat");

        checkBailar.setText("Aspirina");

        checkOtro.setText("Otro");
        checkOtro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkOtroMouseClicked(evt);
            }
        });
        checkOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOtroActionPerformed(evt);
            }
        });

        txtOtro.setEnabled(false);
        txtOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtroActionPerformed(evt);
            }
        });
        txtOtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOtroKeyTyped(evt);
            }
        });

        comboClase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "La libertad", "Ahuachapan", "Sonsonate", "la union", "usulutan", "san miguel", "cabañas", "san salvador", "santa ana", "la paz", "san vicente" }));
        comboClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClaseActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btCancelar.setText("Limpiar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbM)
                                    .addComponent(jButton1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(btCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addComponent(jButton2)
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(rdbF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtDire, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad)
                                    .addComponent(txtApe, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCod, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkFutbol)
                                    .addComponent(checkMusica)
                                    .addComponent(checkOtro))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBailar)
                                    .addComponent(checkCantar)
                                    .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jButton3))
                            .addComponent(comboClase, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkFutbol)
                            .addComponent(checkCantar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkMusica)
                            .addComponent(checkBailar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOtro)
                            .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(comboClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtDire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rdbM)
                            .addComponent(rdbF))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(btCancelar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkCantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCantarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkCantarActionPerformed

    private void checkOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOtroActionPerformed
        if(this.checkOtro.isSelected()==true){
            this.txtOtro.enable(true);
        }
        else{
            this.txtOtro.enable(false);
        }
    }//GEN-LAST:event_checkOtroActionPerformed

    private void checkOtroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOtroMouseClicked
        
        
    }//GEN-LAST:event_checkOtroMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio form = new Inicio();
        form.setVisible(true);
        this.enable(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String inte="";
       
        
        Exp emp = new Exp();
        emp.setCodEmp(Integer.parseInt(this.txtCod.getText()));
        emp.setNomEmp(this.txtNom.getText());
        emp.setApeEmp(this.txtApe.getText());
        emp.setEdadEmp(Integer.parseInt(this.txtEdad.getText()));
        emp.setDireEmp(this.txtDire.getText());
        emp.setTelEmp(this.txtTel.getText());
        if(this.rdbM.isSelected()){
            emp.setGeneroEmp("Masculino");
        }
        else{
            emp.setGeneroEmp("Femenino");
        }
        emp.setNivelEmp(this.comboNivel.getSelectedItem().toString());
        emp.setClase(this.comboClase.getSelectedItem().toString());
        if(this.checkBailar.isSelected()){
            inte+="Paracetamol ";
        }
        if(this.checkCantar.isSelected()){
         inte+="\nCantar ";
        }
        if(this.checkFutbol.isSelected()){
         inte+="\nFutbol ";
        }
        if(this.checkMusica.isSelected()){
         inte+="\nMusica ";
        }
        if(this.checkOtro.isSelected()){
          inte+=this.txtOtro.getText();
        }
        
        
        
        JOptionPane.showMessageDialog(null, "Codigo: "+emp.getCodEmp()+"\nNombre: "+emp.getNomEmp()+"\nApellido: "+emp.getApeEmp()+
                "\nEdad: "+emp.getEdadEmp()+"\nDireccion: "+emp.getDireEmp()+"\nTelefono: "+emp.getTelEmp()+"\nGenero: "+emp.getGeneroEmp()+
                "\nMedicamento: "+emp.getInteresesEmp());
                
        
        this.txtApe.setText(null);

        this.txtCod.setText(null);
        this.txtDire.setText(null);
        this.txtEdad.setText(null);
        this.txtNom.setText(null);
        this.txtOtro.setText(null);

        this.txtTel.setText(null);
        this.checkBailar.setSelected(false);
        this.checkCantar.setSelected(false);
        this.checkFutbol.setSelected(false);
        this.checkMusica.setSelected(false);
        this.checkOtro.setSelected(false);
        this.comboClase.setSelectedIndex(0);
        this.comboNivel.setSelectedIndex(0);
        this.rdbM.setSelected(true);
        this.txtOtro.enable(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.txtApe.setText(null);
        this.txtCod.setText(null);
        this.txtDire.setText(null);
        this.txtEdad.setText(null);
        this.txtNom.setText(null);
        this.txtOtro.setText(null);
       
        this.txtTel.setText(null);
        this.checkBailar.setSelected(false);
        this.checkCantar.setSelected(false);
        this.checkFutbol.setSelected(false);
        this.checkMusica.setSelected(false);
        this.checkOtro.setSelected(false);
        this.comboClase.setSelectedIndex(0);
        this.comboNivel.setSelectedIndex(0);
        this.rdbM.setSelected(true);
        this.txtOtro.enable(false);
                
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txtOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtroActionPerformed

    private void txtCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyTyped
        char tecleo = evt.getKeyChar();
        
        if(tecleo<'0' || tecleo >'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char tecleo = evt.getKeyChar();
        
        if(tecleo<'0' || tecleo >'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyTyped
        char tecleo = evt.getKeyChar();
        
        if(tecleo<'A' || tecleo >'Z' && tecleo<'a' || tecleo >'z'){
            evt.consume();
        }
    }//GEN-LAST:event_txtNomKeyTyped

    private void txtApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyTyped
        char tecleo = evt.getKeyChar();
        
        if(tecleo<'A' || tecleo >'Z' && tecleo<'a' || tecleo >'z'){
            evt.consume();
        }
    }//GEN-LAST:event_txtApeKeyTyped

    private void txtDireKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireKeyTyped
        char tecleo = evt.getKeyChar();
        
        if(tecleo<'A' || tecleo >'Z' && tecleo<'a' || tecleo >'z'){
            evt.consume();
        }
    }//GEN-LAST:event_txtDireKeyTyped

    private void txtOtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOtroKeyTyped
        char tecleo = evt.getKeyChar();
        
        if(tecleo<'A' || tecleo >'Z' && tecleo<'a' || tecleo >'z'){
            evt.consume();
        }
    }//GEN-LAST:event_txtOtroKeyTyped

    private void comboClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClaseActionPerformed

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
            java.util.logging.Logger.getLogger(Expediete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expediete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expediete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expediete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expediete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBailar;
    private javax.swing.JCheckBox checkCantar;
    private javax.swing.JCheckBox checkFutbol;
    private javax.swing.JCheckBox checkMusica;
    private javax.swing.JCheckBox checkOtro;
    private javax.swing.JComboBox comboClase;
    private javax.swing.JComboBox comboNivel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rdbF;
    private javax.swing.JRadioButton rdbM;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDire;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtOtro;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
