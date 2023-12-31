/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Usuario
 */
public class Calculadora extends javax.swing.JFrame {

        private String cadenaNumeros = "";
        private String operacion = "nula";
        private double primerNumero, resultado;
        private boolean activado = true;
        private boolean punto = true;
    
    public Calculadora() {
        initComponents();
         this.setTitle("Calculadora");
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

        panel = new javax.swing.JPanel();
        botonC = new javax.swing.JButton();
        botonRAIZ = new javax.swing.JButton();
        botonDIVIDIR = new javax.swing.JButton();
        botonCE = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonMULTIPLICAR = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        botonRESTAR = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonSUMAR = new javax.swing.JButton();
        botonSUMRES = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPUNTO = new javax.swing.JButton();
        botonIGUAL = new javax.swing.JButton();
        EtiquetaNumeros = new javax.swing.JLabel();
        EtiquetaMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(5, 4));

        botonC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        panel.add(botonC);

        botonRAIZ.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonRAIZ.setText("√ ");
        botonRAIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRAIZActionPerformed(evt);
            }
        });
        panel.add(botonRAIZ);

        botonDIVIDIR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonDIVIDIR.setText("/");
        botonDIVIDIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDIVIDIRActionPerformed(evt);
            }
        });
        panel.add(botonDIVIDIR);

        botonCE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonCE.setText("CE");
        botonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCEActionPerformed(evt);
            }
        });
        panel.add(botonCE);

        boton7.setBackground(new java.awt.Color(153, 153, 153));
        boton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        panel.add(boton7);

        boton8.setBackground(new java.awt.Color(153, 153, 153));
        boton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        panel.add(boton8);

        boton9.setBackground(new java.awt.Color(153, 153, 153));
        boton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        panel.add(boton9);

        botonMULTIPLICAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonMULTIPLICAR.setText("X");
        botonMULTIPLICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMULTIPLICARActionPerformed(evt);
            }
        });
        panel.add(botonMULTIPLICAR);

        boton4.setBackground(new java.awt.Color(153, 153, 153));
        boton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        panel.add(boton4);

        boton5.setBackground(new java.awt.Color(153, 153, 153));
        boton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        panel.add(boton5);

        boton6.setBackground(new java.awt.Color(153, 153, 153));
        boton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        panel.add(boton6);

        botonRESTAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonRESTAR.setText("-");
        botonRESTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRESTARActionPerformed(evt);
            }
        });
        panel.add(botonRESTAR);

        boton1.setBackground(new java.awt.Color(153, 153, 153));
        boton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        panel.add(boton1);

        boton2.setBackground(new java.awt.Color(153, 153, 153));
        boton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        panel.add(boton2);

        boton3.setBackground(new java.awt.Color(153, 153, 153));
        boton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        panel.add(boton3);

        botonSUMAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonSUMAR.setText("+");
        botonSUMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSUMARActionPerformed(evt);
            }
        });
        panel.add(botonSUMAR);

        botonSUMRES.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonSUMRES.setText("+/-");
        botonSUMRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSUMRESActionPerformed(evt);
            }
        });
        panel.add(botonSUMRES);

        boton0.setBackground(new java.awt.Color(153, 153, 153));
        boton0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        panel.add(boton0);

        botonPUNTO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonPUNTO.setText(".");
        botonPUNTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPUNTOActionPerformed(evt);
            }
        });
        panel.add(botonPUNTO);

        botonIGUAL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonIGUAL.setText("=");
        botonIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIGUALActionPerformed(evt);
            }
        });
        panel.add(botonIGUAL);

        EtiquetaNumeros.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        EtiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaNumeros.setText("0");

        EtiquetaMuestra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EtiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EtiquetaNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EtiquetaMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EtiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDIVIDIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDIVIDIRActionPerformed
         if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";
            
            activado = false;
        }
    }//GEN-LAST:event_botonDIVIDIRActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "0";
        }else{
            cadenaNumeros += "0";
        }     
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton0ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "3";
        }else{
            cadenaNumeros += "3";
        }     
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "7";
        }else{
            cadenaNumeros += "7";
        }     
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "8";
        }else{
            cadenaNumeros += "8";
        }     
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "9";
        }else{
            cadenaNumeros += "9";
        }     
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
       if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "4";
        }else{
            cadenaNumeros += "4";
        }     
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "5";
        }else{
            cadenaNumeros += "5";
        }     
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "6";
        }else{
            cadenaNumeros += "6";
        }     
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "1";
        }else{
            cadenaNumeros += "1";
        }     
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if(EtiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "2";
        }else{
            cadenaNumeros += "2";
        }     
        EtiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton2ActionPerformed

    private void botonSUMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSUMARActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";
            
            activado = false;}
    }//GEN-LAST:event_botonSUMARActionPerformed

    private void botonIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIGUALActionPerformed
        double segundoNumero;
        if(operacion.equals("nula")){
            EtiquetaNumeros.setText(cadenaNumeros);
        }
        
        else if(operacion.equals("sumar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero + segundoNumero;;
            EtiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        else if(operacion.equals("restar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero - segundoNumero;;
            EtiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        
        else if(operacion.equals("multiplicar")){
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero * segundoNumero;;
            EtiquetaNumeros.setText(String.format("% .2f",resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        }
        else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            if (segundoNumero == 0) {
                EtiquetaNumeros.setText("NoSeDividePor0");
            } else {
                resultado = primerNumero / segundoNumero;;
                EtiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }
        }
        
        EtiquetaMuestra.setText("");
        activado = true;
        punto = false;
    
    }//GEN-LAST:event_botonIGUALActionPerformed

    private void botonMULTIPLICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMULTIPLICARActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            operacion = "multiplicar";
            
            activado = false;
        }
    }//GEN-LAST:event_botonMULTIPLICARActionPerformed

    private void botonRESTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRESTARActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            EtiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";
            
            activado = false;
        }
    }//GEN-LAST:event_botonRESTARActionPerformed

    private void botonRAIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRAIZActionPerformed
         primerNumero = Double.parseDouble(cadenaNumeros);
        EtiquetaMuestra.setText("sqrt("+cadenaNumeros+")");
        resultado = Math.sqrt(primerNumero);
        EtiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    
    }//GEN-LAST:event_botonRAIZActionPerformed

    private void botonPUNTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPUNTOActionPerformed
        if(punto == true){
            if(cadenaNumeros.equals("")){
                cadenaNumeros = "0.";
            }else{
                cadenaNumeros += ".";
            }
            EtiquetaNumeros.setText(cadenaNumeros);
            punto = false;
        }    
    }//GEN-LAST:event_botonPUNTOActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        EtiquetaMuestra.setText("");
        EtiquetaNumeros.setText("0");
        operacion = "nula";
        cadenaNumeros = "";
        activado = true;
        punto = true;
   
    }//GEN-LAST:event_botonCActionPerformed

    private void botonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCEActionPerformed
         int tamaño = cadenaNumeros.length(); 
        if(tamaño > 0){
            if(tamaño == 1){
                cadenaNumeros = "0";
            }else{
                cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length() - 1);
            }
            EtiquetaNumeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_botonCEActionPerformed

    private void botonSUMRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSUMRESActionPerformed
       if(cadenaNumeros.charAt(0) != '-'){ 
            cadenaNumeros = "-" + cadenaNumeros;
        }else{
            cadenaNumeros = cadenaNumeros.substring(1,cadenaNumeros.length());
        }
        EtiquetaNumeros.setText(cadenaNumeros);
    
    }//GEN-LAST:event_botonSUMRESActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, UnsupportedLookAndFeelException, InstantiationException {
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaMuestra;
    private javax.swing.JLabel EtiquetaNumeros;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonCE;
    private javax.swing.JButton botonDIVIDIR;
    private javax.swing.JButton botonIGUAL;
    private javax.swing.JButton botonMULTIPLICAR;
    private javax.swing.JButton botonPUNTO;
    private javax.swing.JButton botonRAIZ;
    private javax.swing.JButton botonRESTAR;
    private javax.swing.JButton botonSUMAR;
    private javax.swing.JButton botonSUMRES;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
