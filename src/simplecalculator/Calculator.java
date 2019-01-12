/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

public class Calculator extends javax.swing.JFrame {
double firstnumber=0;
double secondnumber=0;
double result =0;

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtSecondNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtFirstNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtResult = new javax.swing.JTextField();
        BtnPlus = new javax.swing.JButton();
        BtnMinus = new javax.swing.JButton();
        BtnMul = new javax.swing.JButton();
        BtnDevide = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");

        jPanel1.setBackground(new java.awt.Color(255, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Arithmatic Operation"));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("First Number");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Second Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Result");

        BtnPlus.setText("+");
        BtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlusActionPerformed(evt);
            }
        });

        BtnMinus.setText("-");
        BtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinusActionPerformed(evt);
            }
        });

        BtnMul.setText("*");
        BtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMulActionPerformed(evt);
            }
        });

        BtnDevide.setText("/");
        BtnDevide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDevideActionPerformed(evt);
            }
        });

        BtnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(TxtSecondNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtFirstNum, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnClear)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPlus)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMinus)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMul)
                        .addGap(18, 18, 18)
                        .addComponent(BtnDevide)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSecondNum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtFirstNum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnClear)
                    .addComponent(BtnPlus)
                    .addComponent(BtnMinus)
                    .addComponent(BtnMul)
                    .addComponent(BtnDevide))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlusActionPerformed
         firstnumber = Double.parseDouble(TxtFirstNum.getText());
          secondnumber = Double.parseDouble(TxtSecondNum.getText());
           result = firstnumber+secondnumber;
          TxtResult.setText(new Double (result).toString());
    }//GEN-LAST:event_BtnPlusActionPerformed

    private void BtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinusActionPerformed
        firstnumber = Double.parseDouble(TxtFirstNum.getText());
         secondnumber = Double.parseDouble(TxtSecondNum.getText());
           result = firstnumber-secondnumber;
          TxtResult.setText(new Double (result).toString());
    }//GEN-LAST:event_BtnMinusActionPerformed

    private void BtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMulActionPerformed
          firstnumber = Double.parseDouble(TxtFirstNum.getText());
          secondnumber = Double.parseDouble(TxtSecondNum.getText());
           result = firstnumber*secondnumber;
          TxtResult.setText(new Double (result).toString());
    }//GEN-LAST:event_BtnMulActionPerformed

    private void BtnDevideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDevideActionPerformed
          firstnumber = Double.parseDouble(TxtFirstNum.getText());
          secondnumber = Double.parseDouble(TxtSecondNum.getText());
           result = firstnumber/secondnumber;
          TxtResult.setText(new Double (result).toString());
    }//GEN-LAST:event_BtnDevideActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        firstnumber=0;
        secondnumber=0;
        result=0;
        TxtFirstNum.setText(null);
        TxtSecondNum.setText(null);
        TxtResult.setText(null);
    }//GEN-LAST:event_BtnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnDevide;
    private javax.swing.JButton BtnMinus;
    private javax.swing.JButton BtnMul;
    private javax.swing.JButton BtnPlus;
    private javax.swing.JTextField TxtFirstNum;
    private javax.swing.JTextField TxtResult;
    private javax.swing.JTextField TxtSecondNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
