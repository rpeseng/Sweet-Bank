
package gui;

import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.IconAyarlari;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;

public class HesapEkrani extends javax.swing.JFrame implements IDuzenleyici {

    public HesapEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hesapEkraniPanel = new javax.swing.JPanel();
        hosgeldinizLabel = new javax.swing.JLabel();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        turkisLiraIcon = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        paraCekIconLabel = new javax.swing.JLabel();
        paraCekButton = new javax.swing.JButton();
        kullaniciAyarlarLabel = new javax.swing.JLabel();
        paraYatırIconLabel = new javax.swing.JLabel();
        paraYatırButton = new javax.swing.JButton();
        havaleButton = new javax.swing.JButton();
        transferIcon = new javax.swing.JLabel();
        paymentButton = new javax.swing.JButton();
        paymentIcon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        logoutIcon = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hesapEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));

        hosgeldinizLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hosgeldinizLabel.setForeground(new java.awt.Color(51, 0, 255));
        hosgeldinizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinizLabel.setText("HOŞGELDİNİZ");

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        kullaniciAdSoyadLabel.setForeground(new java.awt.Color(51, 0, 255));
        kullaniciAdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciAdSoyadLabel.setText("[ KULLANICI ADI SOYADI ]");

        turkisLiraIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/turkishLiraİcon.png"))); // NOI18N

        bakiyeLabel.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        bakiyeLabel.setText("[ BAKİYE ]");

        paraCekIconLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\rojha\\Documents\\NetBeansProjects\\Sweet Bank\\src\\gui\\iconlar\\paraCekIcon.png")); // NOI18N

        paraCekButton.setBackground(new java.awt.Color(255, 255, 102));
        paraCekButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paraCekButton.setText("Para Çek");
        paraCekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraCekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseExited(evt);
            }
        });
        paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekButtonActionPerformed(evt);
            }
        });

        kullaniciAyarlarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/settingsIcon.png"))); // NOI18N
        kullaniciAyarlarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kullaniciAyarlarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullaniciAyarlarLabelMouseClicked(evt);
            }
        });

        paraYatırIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/paraYatirIcon1.png"))); // NOI18N

        paraYatırButton.setBackground(new java.awt.Color(255, 255, 102));
        paraYatırButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paraYatırButton.setText("Para Yatır");
        paraYatırButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraYatırButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraYatırButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraYatırButtonMouseExited(evt);
            }
        });
        paraYatırButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatırButtonActionPerformed(evt);
            }
        });

        havaleButton.setBackground(new java.awt.Color(255, 255, 102));
        havaleButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        havaleButton.setText("Havale");
        havaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                havaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                havaleButtonMouseExited(evt);
            }
        });
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });

        transferIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/transferIcon1.png"))); // NOI18N

        paymentButton.setBackground(new java.awt.Color(255, 255, 102));
        paymentButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paymentButton.setText("Ödemeler");
        paymentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paymentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentButtonMouseExited(evt);
            }
        });
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        paymentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/paymentIcon.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        logoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/logoutIcon.png"))); // NOI18N
        logoutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutIconMouseClicked(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout hesapEkraniPanelLayout = new javax.swing.GroupLayout(hesapEkraniPanel);
        hesapEkraniPanel.setLayout(hesapEkraniPanelLayout);
        hesapEkraniPanelLayout.setHorizontalGroup(
            hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(logoutIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullaniciAdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kullaniciAyarlarLabel))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paraCekIconLabel)
                                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(paraCekButton)))
                                .addGap(25, 25, 25)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paraYatırIconLabel)
                                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(paraYatırButton)))
                                .addGap(25, 25, 25)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(transferIcon)
                                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(havaleButton)))
                                .addGap(15, 15, 15)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paymentIcon)
                                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(paymentButton))))
                            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(turkisLiraIcon)
                                .addGap(20, 20, 20)
                                .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hesapEkraniPanelLayout.setVerticalGroup(
            hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kullaniciAyarlarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciAdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logoutIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(turkisLiraIcon)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bakiyeLabel)))
                .addGap(70, 70, 70)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addComponent(paraCekIconLabel)
                        .addGap(25, 25, 25)
                        .addComponent(paraCekButton))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(paraYatırIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(paraYatırButton))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(transferIcon)
                        .addGap(15, 15, 15)
                        .addComponent(havaleButton))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(paymentIcon)
                        .addGap(15, 15, 15)
                        .addComponent(paymentButton)))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        hesapEkraniPanel.setFocusable(true);

    
    }

    
    
    
    /*
    *Buton Renklendirme ve icon değiştirme
    */
    private void setBgFg(Component c){
       ButtonAyarlari.setBgFg(((JButton) c), Color.black, Color.white);
    }
    private void paraCekButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseEntered
        this.setBgFg(evt.getComponent());
        IconAyarlari.changeIcon(paraCekIconLabel,"paraCekIcon2");
    }//GEN-LAST:event_paraCekButtonMouseEntered

    private void paraCekButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseExited
        ButtonAyarlari.originalBgFg( (JButton) evt.getComponent());
        IconAyarlari.setOriginalIcon(paraCekIconLabel);
    }//GEN-LAST:event_paraCekButtonMouseExited

    private void paraYatırButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatırButtonMouseEntered
        this.setBgFg(evt.getComponent());
        IconAyarlari.changeIcon(paraYatırIconLabel,"paraYatirIcon2");
    }//GEN-LAST:event_paraYatırButtonMouseEntered

    private void paraYatırButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatırButtonMouseExited
        ButtonAyarlari.originalBgFg( (JButton) evt.getComponent());
        IconAyarlari.setOriginalIcon(paraYatırIconLabel);
    }//GEN-LAST:event_paraYatırButtonMouseExited

    private void havaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseEntered
        this.setBgFg(evt.getComponent());
        IconAyarlari.changeIcon(transferIcon,"transferIcon2");
    }//GEN-LAST:event_havaleButtonMouseEntered

    private void havaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseExited
        ButtonAyarlari.originalBgFg( (JButton) evt.getComponent());
        IconAyarlari.setOriginalIcon(transferIcon);
    }//GEN-LAST:event_havaleButtonMouseExited

    private void paymentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentButtonMouseEntered
        this.setBgFg(evt.getComponent());
        IconAyarlari.changeIcon(paymentIcon,"paymentIcon2");
    }//GEN-LAST:event_paymentButtonMouseEntered

    private void paymentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentButtonMouseExited
        ButtonAyarlari.originalBgFg( (JButton) evt.getComponent());
        IconAyarlari.setOriginalIcon(paymentIcon);
    }//GEN-LAST:event_paymentButtonMouseExited

    /*
    *Buton Action
    */

    private void paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCekButtonActionPerformed
        ActionAyarlari.setVisible(this, new paraCekmeEkrani());
    }//GEN-LAST:event_paraCekButtonActionPerformed

    private void paraYatırButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatırButtonActionPerformed
        ActionAyarlari.setVisible(this, new paraYatirmaEkrani());
    }//GEN-LAST:event_paraYatırButtonActionPerformed

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havaleButtonActionPerformed
        ActionAyarlari.setVisible(this, new havaleEkrani());
    }//GEN-LAST:event_havaleButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        ActionAyarlari.setVisible(this, new paymentEkrani());
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void kullaniciAyarlarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciAyarlarLabelMouseClicked
        ActionAyarlari.setVisible(this, new kullaniciAyarlarEkrani());
    }//GEN-LAST:event_kullaniciAyarlarLabelMouseClicked

    private void logoutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutIconMouseClicked
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_logoutIconMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton havaleButton;
    private javax.swing.JPanel hesapEkraniPanel;
    private javax.swing.JLabel hosgeldinizLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JLabel kullaniciAyarlarLabel;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JButton paraCekButton;
    private javax.swing.JLabel paraCekIconLabel;
    private javax.swing.JButton paraYatırButton;
    private javax.swing.JLabel paraYatırIconLabel;
    private javax.swing.JButton paymentButton;
    private javax.swing.JLabel paymentIcon;
    private javax.swing.JLabel transferIcon;
    private javax.swing.JLabel turkisLiraIcon;
    // End of variables declaration//GEN-END:variables
}
