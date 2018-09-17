/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.muni.ui;

import java.awt.Color;
import javax.swing.JOptionPane;
import poo.muni.controller.gestorDeEmpleo;

/**
 *
 * @author Capacitacion5
 */
public class PantallaPostulante extends javax.swing.JFrame {
  private gestorDeEmpleo gestor;
  String nombreUsuario;
    

    /**
     * Creates new form PantallaPostulante
     */
    public PantallaPostulante(gestorDeEmpleo gestor, String nombreUsuario) {
         initComponents();
         this.gestor = gestor;
         this.nombreUsuario = nombreUsuario;
         this.setLocationRelativeTo(null);
    }

    public void Limpiar() {
        FieldNombrePos.setText("");
        FieldApellidoPos.setText("");
        FieldDomicilioPOS.setText("");
        FieldDNIPOS.setText("");
        FieldCuilPOS.setText("");
        FieldEdadPOS.setText("");
        FieldEmailPOS.setText("");
        FieldMovilidadPOS.setText("");
        FieldDocAdicPOS.setText("");
        FieldTELPOS.setText("");
        FieldTelAltPOS.setText("");
        FielddispHoraPOS.setText("");
        FieldDocAdicPOS.setText("");
        jRadioButtonmasculino.setSelected(false);
        jRadioButtonFemenino.setSelected(false);
    }

    public boolean nightMode(boolean encendido) {
        jPanelnuevopostulante.setBackground(Color.darkGray);
        jLabelTitulopos.setForeground(Color.white);
        jLabelnombrepos.setForeground(Color.white);
        jLabelapellidopos.setForeground(Color.white);
        jLabelcuilpos.setForeground(Color.white);
        jLabeldisphorariapos.setForeground(Color.white);
        jLabeldnipos.setForeground(Color.white);
        jLabeldocadicpos.setForeground(Color.white);
        jLabeldomiciliopos.setForeground(Color.white);
        jLabeledadpos.setForeground(Color.white);
        jLabelemailpos.setForeground(Color.white);
        jLabelmovilipos.setForeground(Color.white);
        jLabelprogramapos.setForeground(Color.white);
        jLabelsexopos.setForeground(Color.white);
        jLabeltelalrtpos.setForeground(Color.white);
        jLabeltelprinpos.setForeground(Color.white);
        jRadioButtonmasculino.setBackground(Color.darkGray);
        jRadioButtonmasculino.setForeground(Color.white);
        jRadioButtonFemenino.setBackground(Color.darkGray);
        jRadioButtonFemenino.setForeground(Color.white);
        return encendido;

    }

    public boolean ValidarPostulante() {
        
        boolean isValid=true;

        String sexo;
        String nombre = FieldNombrePos.getText();
        String apellido = FieldApellidoPos.getText();
        String domicilio = FieldDomicilioPOS.getText();
        String DNI = FieldDNIPOS.getText();
        String edad = FieldEdadPOS.getText();
        String cuil = FieldCuilPOS.getText();
        String telPricipal = FieldTELPOS.getText();
        String telAlternativo = FieldTelAltPOS.getText();
        String email = FieldEmailPOS.getText();
        String movilidad = FieldMovilidadPOS.getText();
        String disponibidadHoraria = FielddispHoraPOS.getText();
        String programa = FieldProgramaPOS.getText();
        String docAdicional = FieldDocAdicPOS.getText();
        if (jRadioButtonmasculino.isSelected()) {
            sexo = "Masculino";
        } else if (jRadioButtonFemenino.isSelected()) {
            sexo = "Femenino";
        }
        if (nombre.isEmpty() || apellido.isEmpty() || domicilio.isEmpty() || DNI.isEmpty() ||edad.isEmpty() ||cuil.isEmpty()||telPricipal.isEmpty()||telAlternativo.isEmpty() || email.isEmpty()|| movilidad.isEmpty()||disponibidadHoraria.isEmpty()||programa.isEmpty()|| docAdicional.isEmpty()) {
           
            JOptionPane.showMessageDialog(null, "No deje campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
          isValid= false;  
        } 
        
        if (!isValidEmailAddress(email)) {
            JOptionPane.showMessageDialog(null, "Ingrese un email valido", "Error", JOptionPane.ERROR_MESSAGE);  
            isValid=false;

        } 
        
        return isValid;
        
    }

    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelnuevopostulante = new javax.swing.JPanel();
        jLabelnombrepos = new javax.swing.JLabel();
        jLabelapellidopos = new javax.swing.JLabel();
        jLabeldomiciliopos = new javax.swing.JLabel();
        jLabelcuilpos = new javax.swing.JLabel();
        jLabeltelprinpos = new javax.swing.JLabel();
        jLabeltelalrtpos = new javax.swing.JLabel();
        jLabelemailpos = new javax.swing.JLabel();
        jLabelmovilipos = new javax.swing.JLabel();
        jLabeldisphorariapos = new javax.swing.JLabel();
        jLabeldocadicpos = new javax.swing.JLabel();
        jLabelprogramapos = new javax.swing.JLabel();
        jLabeldnipos = new javax.swing.JLabel();
        jLabeledadpos = new javax.swing.JLabel();
        jLabelsexopos = new javax.swing.JLabel();
        jLabelTitulopos = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        FieldNombrePos = new javax.swing.JTextField();
        FieldApellidoPos = new javax.swing.JTextField();
        FieldDomicilioPOS = new javax.swing.JTextField();
        jRadioButtonmasculino = new javax.swing.JRadioButton();
        jRadioButtonFemenino = new javax.swing.JRadioButton();
        FieldDNIPOS = new javax.swing.JTextField();
        FieldEdadPOS = new javax.swing.JTextField();
        FieldCuilPOS = new javax.swing.JTextField();
        FieldTELPOS = new javax.swing.JTextField();
        FieldTelAltPOS = new javax.swing.JTextField();
        FieldEmailPOS = new javax.swing.JTextField();
        FieldMovilidadPOS = new javax.swing.JTextField();
        FielddispHoraPOS = new javax.swing.JTextField();
        FieldDocAdicPOS = new javax.swing.JTextField();
        FieldProgramaPOS = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        GuardarBoton = new javax.swing.JButton();
        ButtonCancelarpos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelnuevopostulante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelnuevopostulante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelnombrepos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelnombrepos.setText("Nombre:");

        jLabelapellidopos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelapellidopos.setText("Apellido:");

        jLabeldomiciliopos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeldomiciliopos.setText("Domicilio:");

        jLabelcuilpos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelcuilpos.setText("Cuil:");

        jLabeltelprinpos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeltelprinpos.setText("Telefono Principal:");

        jLabeltelalrtpos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeltelalrtpos.setText("Telefono alternativo:");

        jLabelemailpos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelemailpos.setText("Email:");

        jLabelmovilipos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelmovilipos.setText("Movilidad:");

        jLabeldisphorariapos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeldisphorariapos.setText("Disponibilidad horaria:");

        jLabeldocadicpos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeldocadicpos.setText("Documentacion Adicional:");

        jLabelprogramapos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelprogramapos.setText("Programa:");

        jLabeldnipos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeldnipos.setText("DNI:");

        jLabeledadpos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabeledadpos.setText("Edad:");

        jLabelsexopos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelsexopos.setText("Sexo:");

        jLabelTitulopos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulopos.setText("Nuevo Postulante");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/muni/ui/logo.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jRadioButtonmasculino.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonmasculino.setText("Masculino");

        jRadioButtonFemenino.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonFemenino.setText("Femenino");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/muni/ui/Imagenes/Linea modelo 3_1.jpg"))); // NOI18N

        GuardarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/muni/ui/IconoRegister.png"))); // NOI18N
        GuardarBoton.setText("Guardar");
        GuardarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBotonActionPerformed(evt);
            }
        });

        ButtonCancelarpos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/muni/ui/Imagenes/logo cancelar 2.png"))); // NOI18N
        ButtonCancelarpos.setText("Cancelar");
        ButtonCancelarpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarposActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/muni/ui/Imagenes/editar.png"))); // NOI18N
        jButton1.setText("Editar");

        javax.swing.GroupLayout jPanelnuevopostulanteLayout = new javax.swing.GroupLayout(jPanelnuevopostulante);
        jPanelnuevopostulante.setLayout(jPanelnuevopostulanteLayout);
        jPanelnuevopostulanteLayout.setHorizontalGroup(
            jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelnuevopostulanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GuardarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonCancelarpos))
                    .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                        .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelnombrepos)
                                    .addComponent(jLabelapellidopos)
                                    .addComponent(jLabeldomiciliopos)
                                    .addComponent(jLabelsexopos)
                                    .addComponent(jLabeldnipos)
                                    .addComponent(jLabeledadpos)
                                    .addComponent(jLabelemailpos)
                                    .addComponent(jLabelcuilpos))
                                .addGap(30, 30, 30)
                                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(FieldApellidoPos, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addComponent(FieldDomicilioPOS)
                                        .addComponent(FieldNombrePos))
                                    .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                                        .addComponent(jRadioButtonmasculino)
                                        .addGap(33, 33, 33)
                                        .addComponent(jRadioButtonFemenino))
                                    .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(FieldCuilPOS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addComponent(FieldEdadPOS, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FieldDNIPOS, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(FieldEmailPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(157, 157, 157)
                                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                                        .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabeltelprinpos)
                                            .addComponent(jLabeltelalrtpos)
                                            .addComponent(jLabelmovilipos)
                                            .addComponent(jLabeldisphorariapos))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(FielddispHoraPOS, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                                .addComponent(FieldMovilidadPOS)
                                                .addComponent(FieldTELPOS))
                                            .addComponent(FieldTelAltPOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                                        .addComponent(jLabelprogramapos)
                                        .addGap(105, 105, 105)
                                        .addComponent(FieldDocAdicPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                                        .addComponent(jLabeldocadicpos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldProgramaPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabelTitulopos)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel16)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelnuevopostulanteLayout.setVerticalGroup(
            jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelTitulopos))
                    .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnombrepos)
                    .addComponent(jLabeltelprinpos)
                    .addComponent(FieldNombrePos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldTELPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelapellidopos)
                    .addComponent(jLabeltelalrtpos)
                    .addComponent(FieldApellidoPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldTelAltPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeldomiciliopos)
                    .addComponent(FieldDomicilioPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelmovilipos)
                    .addComponent(FieldMovilidadPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelsexopos)
                    .addComponent(jRadioButtonmasculino)
                    .addComponent(jRadioButtonFemenino)
                    .addComponent(FielddispHoraPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeldisphorariapos))
                .addGap(32, 32, 32)
                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeldnipos)
                    .addComponent(FieldDNIPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldDocAdicPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelprogramapos))
                .addGap(32, 32, 32)
                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelnuevopostulanteLayout.createSequentialGroup()
                        .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeledadpos)
                            .addComponent(FieldEdadPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeldocadicpos))
                        .addGap(32, 32, 32)
                        .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelcuilpos)
                            .addComponent(FieldCuilPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelemailpos)
                            .addComponent(FieldEmailPOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(FieldProgramaPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelnuevopostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancelarpos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarBoton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelnuevopostulante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelnuevopostulante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBotonActionPerformed
      
        if(ValidarPostulante())
        {
             JOptionPane.showMessageDialog(null, "Usuario registrado con éxito", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
             Limpiar();
        }
    }//GEN-LAST:event_GuardarBotonActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        nightMode(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void ButtonCancelarposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarposActionPerformed
      dispose();
      new PantallaMenuPrincipal(gestor, nombreUsuario);
    }//GEN-LAST:event_ButtonCancelarposActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                
//
//}
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PantallaPostulante.class
//.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        
//
//} catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PantallaPostulante.class
//.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        
//
//} catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PantallaPostulante.class
//.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        
//
//} catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PantallaPostulante.class
//.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PantallaPostulante().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelarpos;
    private javax.swing.JTextField FieldApellidoPos;
    private javax.swing.JTextField FieldCuilPOS;
    private javax.swing.JTextField FieldDNIPOS;
    private javax.swing.JTextField FieldDocAdicPOS;
    private javax.swing.JTextField FieldDomicilioPOS;
    private javax.swing.JTextField FieldEdadPOS;
    private javax.swing.JTextField FieldEmailPOS;
    private javax.swing.JTextField FieldMovilidadPOS;
    private javax.swing.JTextField FieldNombrePos;
    private javax.swing.JTextField FieldProgramaPOS;
    private javax.swing.JTextField FieldTELPOS;
    private javax.swing.JTextField FieldTelAltPOS;
    private javax.swing.JTextField FielddispHoraPOS;
    private javax.swing.JButton GuardarBoton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabelTitulopos;
    private javax.swing.JLabel jLabelapellidopos;
    private javax.swing.JLabel jLabelcuilpos;
    private javax.swing.JLabel jLabeldisphorariapos;
    private javax.swing.JLabel jLabeldnipos;
    private javax.swing.JLabel jLabeldocadicpos;
    private javax.swing.JLabel jLabeldomiciliopos;
    private javax.swing.JLabel jLabeledadpos;
    private javax.swing.JLabel jLabelemailpos;
    private javax.swing.JLabel jLabelmovilipos;
    private javax.swing.JLabel jLabelnombrepos;
    private javax.swing.JLabel jLabelprogramapos;
    private javax.swing.JLabel jLabelsexopos;
    private javax.swing.JLabel jLabeltelalrtpos;
    private javax.swing.JLabel jLabeltelprinpos;
    private javax.swing.JPanel jPanelnuevopostulante;
    private javax.swing.JRadioButton jRadioButtonFemenino;
    private javax.swing.JRadioButton jRadioButtonmasculino;
    // End of variables declaration//GEN-END:variables
}
