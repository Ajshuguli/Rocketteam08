package ec.edu.espe.bank.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.bank.controller.CdtController;
import utils.Connection;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author RocketTeam
 */
public class FmrCDTAccount extends javax.swing.JFrame {

    MongoCollection<Document> CDTAccount = new Connection().obtenerDB().getCollection("CDTAccounts");
    DefaultTableModel tabla = new DefaultTableModel() {
    };

    public FmrCDTAccount() {
        initComponents();
        initButtons();

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtInvestment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        investYears = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnCalculate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtInterest = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblErrorCedula = new javax.swing.JLabel();
        lblErrorName = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        lblErrorInvestment = new javax.swing.JLabel();
        lblErrorInterest = new javax.swing.JLabel();
        lblErrorAmount = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 102));
        setForeground(new java.awt.Color(102, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("CDT Account");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 7, 163, 68));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, -1, -1));

        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, -1, -1));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 93, 156, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 146, 156, -1));

        jLabel4.setText("How much do you want to invest?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 202, -1, -1));

        txtInvestment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInvestmentKeyTyped(evt);
            }
        });
        getContentPane().add(txtInvestment, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 202, 156, -1));

        jLabel5.setText("Select how Many years do you want to invest");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 261, -1, -1));

        investYears.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ", "2 ", "3 ", "4", "5", "6" }));
        getContentPane().add(investYears, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 258, 156, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setToolTipText("");

        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCalculate.setText("Calculate Interest");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.setEnabled(false);
        btnAdd.setFocusCycleRoot(true);
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel8.setText("Amount");

        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });

        txtInterest.setEnabled(false);
        txtInterest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInterestKeyTyped(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cdtImagen.png"))); // NOI18N

        btnClean.setText("Clean");
        btnClean.setEnabled(false);
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        jLabel6.setText("Interest you will generate");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrorInvestment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrorAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrorInterest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(jLabel7)
                .addGap(211, 211, 211))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnReturn)
                .addGap(32, 32, 32)
                .addComponent(btnCalculate)
                .addGap(30, 30, 30)
                .addComponent(btnAdd)
                .addGap(42, 42, 42)
                .addComponent(btnClean)
                .addGap(47, 47, 47)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblErrorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblErrorInvestment, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblErrorInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(31, 31, 31))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorAmount))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnExit)
                    .addComponent(btnAdd)
                    .addComponent(btnReturn)
                    .addComponent(btnClean))
                .addGap(58, 58, 58))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 840, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initButtons() {
        txtInterest.setEditable(false);
        txtAmount.setEditable(false);
    }
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String user = txtName.getText();
        String id = txtId.getText();
        String investment = txtInvestment.getText();
        String yearOfInvestment = investYears.getSelectedItem().toString();

        try {
            JFrame cdtAdd = CdtController.updateData(user, id, investment, yearOfInvestment);
            Document data = new Document();
            data.put("id", Integer.parseInt(txtId.getText()));
            data.put("User", txtName.getText());
            data.put("Investment", Float.parseFloat(txtInvestment.getText()));
            data.put("YearsOfInvestment", investYears.getSelectedItem().hashCode());
            CDTAccount.insertOne(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmAccount open = new FrmAccount();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        Double capital, reason, time, interest, amount;

        capital = Double.parseDouble(txtInvestment.getText());
        time = Double.parseDouble(investYears.getSelectedItem().toString());
        reason = 0.12D;

        amount = Math.pow(1 + reason, time) * capital;
        interest = amount - capital;

        txtInterest.setText(Double.toString(Math.round(interest)));
        txtAmount.setText(Double.toString(Math.round(amount)));
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        int key = evt.getKeyChar();
        boolean numbers = (key >= 48 && key <= 57);
        boolean supr = (key == 8);

        if (numbers || supr) {
            lblErrorCedula.setForeground(new Color(102, 255, 255));
            lblErrorCedula.setText("Correct Format");
        } else {
            JOptionPane.showMessageDialog(this, "Fill only with numbers from 0 to 9");
            lblErrorCedula.setForeground(new Color(255, 0, 0));
            lblErrorCedula.setText("Error. Enter only numbers");
            evt.consume();
        }
        habilyInsert();
        habilyClean();
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int key = evt.getKeyChar();
        boolean uper = (key >= 65 && key <= 90);
        boolean lower = (key >= 97 && key <= 122);
        boolean espace = (key == 32);
        boolean supr = (key == 8);

        if ((uper || lower || espace || supr)) {
            lblErrorName.setForeground(new Color(102, 255, 255));
            lblErrorName.setText("Correct Format");
        } else {
            JOptionPane.showMessageDialog(this, "Fill only with uppercase and lowercase letters");
            lblErrorName.setForeground(new Color(255, 0, 0));
            lblErrorName.setText("Error. Enter only letters");
            evt.consume();
        }
        habilyInsert();
        habilyClean();
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtInvestmentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInvestmentKeyTyped
        double key = evt.getKeyChar();
        boolean numbers = (key >= 48 && key <= 57);
        boolean dat = (key == 46);
        boolean supr = (key == 8);

        if (numbers || dat || supr) {
            lblErrorInvestment.setForeground(new Color(102, 255, 255));
            lblErrorInvestment.setText("Correct Format");
        } else {
            JOptionPane.showMessageDialog(this, "Fill with decimals and the operator '.'");
            lblErrorInvestment.setForeground(new Color(255, 0, 0));
            lblErrorInvestment.setText("Error. Enter only float numbers");
            evt.consume();
        }
        habilyInsert();
        habilyClean();
    }//GEN-LAST:event_txtInvestmentKeyTyped

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        clearFields();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void txtInterestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInterestKeyTyped
        double key = evt.getKeyChar();
        boolean numbers = (key >= 48 && key <= 57);
        boolean dat = (key == 46);
        boolean supr = (key == 8);

        if (numbers || dat || supr) {
            lblErrorInterest.setForeground(new Color(102, 255, 255));
            lblErrorInterest.setText("Correct Format");
        } else {
            JOptionPane.showMessageDialog(this, "Fill with decimals and the operator '.'");
            lblErrorInterest.setForeground(new Color(255, 0, 0));
            lblErrorInterest.setText("Error. Enter only float numbers");
            evt.consume();
        }
        habilyInsert();
        habilyClean();
    }//GEN-LAST:event_txtInterestKeyTyped

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
        double key = evt.getKeyChar();
        boolean numbers = (key >= 48 && key <= 57);
        boolean dat = (key == 46);
        boolean supr = (key == 8);

        if (numbers || dat || supr) {
            lblErrorAmount.setForeground(new Color(102, 255, 255));
            lblErrorAmount.setText("Correct Format");
        } else {
            JOptionPane.showMessageDialog(this, "Fill with decimals and the operator '.'");
            lblErrorAmount.setForeground(new Color(255, 0, 0));
            lblErrorAmount.setText("Error. Enter only float numbers");
            evt.consume();
        }
        habilyInsert();
        habilyClean();
    }//GEN-LAST:event_txtAmountKeyTyped
    public void habilyInsert() {
        if (!txtId.getText().isEmpty() && !txtName.getText().isEmpty() && !txtInvestment.getText().isEmpty()
                && !txtInterest.getText().isEmpty() && !txtAmount.getText().isEmpty()) {
            btnAdd.setEnabled(true);
        } else {
            btnAdd.setEnabled(false);
        }
    }

    public void habilyClean() {
        if (!txtId.getText().isEmpty() && !txtName.getText().isEmpty() && !txtInvestment.getText().isEmpty()) {
            btnClean.setEnabled(true);
        } else {
            btnClean.setEnabled(false);
        }
    }

    public void clearFields() {
        txtId.setText("");
        txtName.setText("");
        txtInvestment.setText("");
        txtInterest.setText("");
        txtAmount.setText("");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FmrCDTAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrCDTAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrCDTAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrCDTAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrCDTAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> investYears;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblErrorAmount;
    private javax.swing.JLabel lblErrorCedula;
    private javax.swing.JLabel lblErrorInterest;
    private javax.swing.JLabel lblErrorInvestment;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtInterest;
    private javax.swing.JTextField txtInvestment;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}