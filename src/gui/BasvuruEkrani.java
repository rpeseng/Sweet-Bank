/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author rojha
 */
public class BasvuruEkrani extends javax.swing.JFrame implements IDuzenleyici {

    /**
     * Creates new form BaşvuruEkrani
     */
    public BasvuruEkrani() {
        initComponents();
        getEdits();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvuruEkraniPanel = new javax.swing.JPanel();
        kisiselBilgilerLabel = new javax.swing.JLabel();
        adSoyadLabel = new javax.swing.JLabel();
        AdSoyadText = new javax.swing.JTextField();
        tcNoLAbel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        tcNoLAbel1 = new javax.swing.JLabel();
        cevapText = new javax.swing.JTextField();
        guvenlikBilgilerLabel = new javax.swing.JLabel();
        CevapLabel = new javax.swing.JLabel();
        guvenlikSorusuCbox = new javax.swing.JComboBox<>();
        guvenlikSorusuLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        basvurButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basvuruEkraniPanel.setBackground(new java.awt.Color(255, 204, 102));

        kisiselBilgilerLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        kisiselBilgilerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiselBilgilerLabel.setText("Kişisel Bilgiler");
        kisiselBilgilerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        adSoyadLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adSoyadLabel.setText("Ad Soyad :");
        adSoyadLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AdSoyadText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tcNoLAbel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNoLAbel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLAbel.setText("T.C No :");
        tcNoLAbel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tcNoText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tcNoLAbel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNoLAbel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLAbel1.setText("Telelefon No :");
        tcNoLAbel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cevapText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cevapText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cevapTextActionPerformed(evt);
            }
        });

        guvenlikBilgilerLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        guvenlikBilgilerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guvenlikBilgilerLabel.setText("Güvenlik Bilgileri");
        guvenlikBilgilerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CevapLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CevapLabel.setText("Cevap :");
        CevapLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        guvenlikSorusuCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil hayvanıınızın adı nedir ?", "En sevdiğiniz nesne nedir ?", "İlkokul öğretmeninizin soyadı nedir ?", "Yaşamak istediğiniz yer neresidir ?", "Ya da rastgele cümle girin (Önerilir)." }));

        guvenlikSorusuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikSorusuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikSorusuLabel.setText("Güvenlik sorusu :");
        guvenlikSorusuLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        basvurButton.setText("Başvur");
        basvurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basvurButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButtonMouseExited(evt);
            }
        });
        basvurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basvuruEkraniPanelLayout = new javax.swing.GroupLayout(basvuruEkraniPanel);
        basvuruEkraniPanel.setLayout(basvuruEkraniPanelLayout);
        basvuruEkraniPanelLayout.setHorizontalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addComponent(guvenlikSorusuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guvenlikSorusuCbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addComponent(CevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cevapText)))
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adSoyadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tcNoLAbel1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(tcNoLAbel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(kisiselBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(guvenlikBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AdSoyadText, cevapText, guvenlikSorusuCbox, tcNoText, telNoText});

        basvuruEkraniPanelLayout.setVerticalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(kisiselBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLAbel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLAbel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(guvenlikBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikSorusuCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikSorusuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AdSoyadText, adSoyadLabel});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tcNoLAbel, tcNoText});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cevapText, tcNoLAbel1, telNoText});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CevapLabel, guvenlikSorusuCbox, guvenlikSorusuLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(basvuruEkraniPanel);
        basvuruEkraniPanel.setFocusable(true);
        
        TextAyarlari.setOnlyAlphabetic(AdSoyadText);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setMaxLimit(telNoText, 11);
    }
    

    private void cevapTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cevapTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cevapTextActionPerformed

    private void basvurButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_basvurButtonMouseClicked

    /*
    *Button setting.
    */
    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        ButtonAyarlari.setBgFg(basvurButton, Color.black, Color.gray);
    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        ButtonAyarlari.originalBgFg(basvurButton);
    }//GEN-LAST:event_basvurButtonMouseExited

    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
       JOptionPane.showMessageDialog(this,"Başvurunuz başarıyla alınmıştır.");
       ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_basvurButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdSoyadText;
    private javax.swing.JLabel CevapLabel;
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JButton basvurButton;
    private javax.swing.JPanel basvuruEkraniPanel;
    private javax.swing.JTextField cevapText;
    private javax.swing.JLabel guvenlikBilgilerLabel;
    private javax.swing.JComboBox<String> guvenlikSorusuCbox;
    private javax.swing.JLabel guvenlikSorusuLabel;
    private javax.swing.JLabel kisiselBilgilerLabel;
    private javax.swing.JLabel tcNoLAbel;
    private javax.swing.JLabel tcNoLAbel1;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}
