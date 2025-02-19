/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DefenseSystem.Components;

import DefenseSystem.Interfaces.MainControllerInterface;
import DefenseSystem.Interfaces.Observer;

/**
 *
 * @author yasaru sandaruwan
 */
public class Helicopter extends javax.swing.JFrame implements Observer {

    private final int id;
    private final MainControllerInterface mainControllerInterface;
    private int index;
    private int index2;
    private int index3;
    private String msgPri;

    /**
     * Creates new form Helicopter
     *
     * @param id
     * @param mainControllerInterface
     */
    public Helicopter(int id, MainControllerInterface mainControllerInterface) {
        this.id = id;
        this.mainControllerInterface = mainControllerInterface;
        this.mainControllerInterface.setComboBox("Helicopter");
        initComponents();
        setTitle("STF|💀|-Helicopter");
        setLocation(20, 30);
        shootBtn.setEnabled(false);
        missileBtn.setEnabled(false);
        laserBtn.setEnabled(false);
        getMainControllerMsgAreaField.setEditable(false);
        setVisible(true);
    }

    @Override
    public void areaClearance(String clearance) {
        if (clearance != null) {
            areaClearance.setText(clearance);
        }
    }

    @Override
    public void message(String msg) {

        if (msg != null) {
            getMainControllerMsgAreaField.append(msg + "\n");
        }
    }

    @Override
    public void strength(int strength) {
        if (positionBox.isSelected()) {
            if (strength >= 0 && strength < 10) {
                shootBtn.setEnabled(false);
                missileBtn.setEnabled(false);
                laserBtn.setEnabled(false);
            } else if (strength >= 10 && strength <= 30) {
                shootBtn.setEnabled(true);
                missileBtn.setEnabled(false);
                laserBtn.setEnabled(false);
            } else if (strength >= 30 && strength <= 80) {
                shootBtn.setEnabled(true);
                missileBtn.setEnabled(true);
                laserBtn.setEnabled(false);
            } else {
                shootBtn.setEnabled(true);
                missileBtn.setEnabled(true);
                laserBtn.setEnabled(true);
            }
        } else {
            shootBtn.setEnabled(false);
            missileBtn.setEnabled(false);
            laserBtn.setEnabled(false);
        }
    }

    @Override
    public void comboBoxIndex(int index) {
        this.index = index;
    }

    @Override
    public void setPrivateMsg(int index2, String msgPri) {
        this.index2 = index2;
        this.msgPri = msgPri;
        if (this.index2 == this.id) {
            getMainControllerMsgAreaField.append(msgPri + "\n");
        }
    }

    @Override
    public void getInfo(int index3) {
        this.index3 = index3;
        if (id == index3) {
            mainControllerInterface.setInfo((int) jSpinner1.getValue(), (int) jSpinner2.getValue(), jSlider1.getValue(), "");
        }
    }

    @Override
    public void setAmmoAmount(int index, int amount) {
        if (id == index) {
            jSpinner2.setValue((int) jSpinner2.getValue() + amount);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        areaClearance = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        getMainControllerMsgAreaField = new javax.swing.JTextArea();
        missileBtn = new javax.swing.JButton();
        laserBtn = new javax.swing.JButton();
        msgToMainControllerField = new javax.swing.JTextField();
        sendToMainControllerBtn = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        positionBox = new javax.swing.JCheckBox();
        shootBtn = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(49, 92, 43));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Soldier Count");

        jSpinner2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        areaClearance.setFont(new java.awt.Font("Avignon Pro", 1, 14)); // NOI18N
        areaClearance.setForeground(new java.awt.Color(255, 255, 255));
        areaClearance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaClearance.setText("Area Not Cleared ");

        getMainControllerMsgAreaField.setColumns(20);
        getMainControllerMsgAreaField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getMainControllerMsgAreaField.setForeground(new java.awt.Color(153, 0, 0));
        getMainControllerMsgAreaField.setRows(5);
        jScrollPane1.setViewportView(getMainControllerMsgAreaField);

        missileBtn.setBackground(new java.awt.Color(154, 164, 173));
        missileBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        missileBtn.setText("MISSILE OPERATION");
        missileBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        missileBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        missileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missileBtnActionPerformed(evt);
            }
        });

        laserBtn.setBackground(new java.awt.Color(154, 164, 173));
        laserBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        laserBtn.setText("LASER OPERATION");
        laserBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        laserBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        msgToMainControllerField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        msgToMainControllerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgToMainControllerFieldActionPerformed(evt);
            }
        });

        sendToMainControllerBtn.setBackground(new java.awt.Color(255, 231, 79));
        sendToMainControllerBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sendToMainControllerBtn.setText("SEND");
        sendToMainControllerBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendToMainControllerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendToMainControllerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToMainControllerBtnActionPerformed(evt);
            }
        });

        jSlider1.setBackground(new java.awt.Color(49, 92, 43));
        jSlider1.setForeground(new java.awt.Color(255, 255, 255));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(0);
        jSlider1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jSlider1MouseWheelMoved(evt);
            }
        });

        positionBox.setBackground(new java.awt.Color(49, 92, 43));
        positionBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        positionBox.setForeground(new java.awt.Color(255, 255, 255));
        positionBox.setText("Position");
        positionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBoxActionPerformed(evt);
            }
        });

        shootBtn.setBackground(new java.awt.Color(154, 164, 173));
        shootBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        shootBtn.setText("SHOOT");
        shootBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shootBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootBtnActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ammo Count");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(laserBtn)
                        .addGap(175, 175, 175)
                        .addComponent(positionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(msgToMainControllerField)
                                .addGap(29, 29, 29)
                                .addComponent(sendToMainControllerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(areaClearance, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(shootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(missileBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(9, 9, 9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(jSpinner2))))
                        .addGap(18, 18, 18)))
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(areaClearance, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(shootBtn)
                    .addComponent(missileBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laserBtn)
                    .addComponent(positionBox))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sendToMainControllerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(msgToMainControllerField))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void missileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_missileBtnActionPerformed

    private void shootBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootBtnActionPerformed
        int ammoAmount;
        if ((int) jSpinner2.getValue() > 0) {
            ammoAmount = (int) jSpinner2.getValue() - 1;
            jSpinner2.setValue(ammoAmount);
        }
    }//GEN-LAST:event_shootBtnActionPerformed

    private void msgToMainControllerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgToMainControllerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgToMainControllerFieldActionPerformed

    private void sendToMainControllerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToMainControllerBtnActionPerformed
        if (!msgToMainControllerField.getText().isEmpty()) {
            mainControllerInterface.setFields(msgToMainControllerField.getText(), getTitle() + " " + id);
        }
    }//GEN-LAST:event_sendToMainControllerBtnActionPerformed

    private void jSlider1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jSlider1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider1MouseWheelMoved

    private void positionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionBoxActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Helicopter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaClearance;
    private javax.swing.JTextArea getMainControllerMsgAreaField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JButton laserBtn;
    private javax.swing.JButton missileBtn;
    private javax.swing.JTextField msgToMainControllerField;
    private javax.swing.JCheckBox positionBox;
    private javax.swing.JButton sendToMainControllerBtn;
    private javax.swing.JButton shootBtn;
    // End of variables declaration//GEN-END:variables

}
