/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import ArayuzIslemleri.RenkVeIconlar;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Elif Eftelya
 */
public class GirisEkrani extends javax.swing.JFrame {

    //Classlar
    RenkVeIconlar renkVeIconlar = new RenkVeIconlar();
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

    //Dğişkenler
    public Integer posX;
    public Integer posY;

    /**
     * Creates new form GirisEkrani
     */
    public GirisEkrani() {
        initComponents();
        this.setLocation(dimension.width / 2 - this.getSize().width / 2, dimension.height / 2 - this.getSize().height / 2);
    }

    public void initComponentsGiris(boolean acilis) {

        jTextField_KullaniciAdi.setVisible(!acilis);
        jPasswordField_Sifre.setVisible(!acilis);

        if (acilis) {
            jLabel_UserIkon.setIcon(renkVeIconlar.getUserWarning());
        } else {
            jLabel_UserIkon.setIcon(renkVeIconlar.getUser()); 
        }
        
        jLabel_KurtarmaMesaji.setVisible(acilis);
        jLabel_Sayac.setVisible(acilis);
        jTextField_KurtarmaKodu.setVisible(acilis);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_AnaPanel = new javax.swing.JPanel();
        jPanel_GirisIkon = new javax.swing.JPanel();
        jLabel_GirisIkon = new javax.swing.JLabel();
        jPanel_GirisParametreleri = new javax.swing.JPanel();
        jPanel_Navigasyon = new javax.swing.JPanel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_Minimize = new javax.swing.JLabel();
        jLabel_Move = new javax.swing.JLabel();
        jPanel_KullaniciIkon = new javax.swing.JPanel();
        jLabel_UserIkon = new javax.swing.JLabel();
        jLabel_KurtarmaMesaji = new javax.swing.JLabel();
        jLabel_Sayac = new javax.swing.JLabel();
        jPanel_GirisAlanlari = new javax.swing.JPanel();
        jTextField_KullaniciAdi = new javax.swing.JTextField();
        jPasswordField_Sifre = new javax.swing.JPasswordField();
        jTextField_KurtarmaKodu = new javax.swing.JTextField();
        jLabel_SifremiUnuttum = new javax.swing.JLabel();
        jButton_GirisYap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel_AnaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204)));
        jPanel_AnaPanel.setPreferredSize(new java.awt.Dimension(700, 510));

        jPanel_GirisIkon.setPreferredSize(new java.awt.Dimension(350, 499));

        jLabel_GirisIkon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/girisEkrani.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_GirisIkonLayout = new javax.swing.GroupLayout(jPanel_GirisIkon);
        jPanel_GirisIkon.setLayout(jPanel_GirisIkonLayout);
        jPanel_GirisIkonLayout.setHorizontalGroup(
            jPanel_GirisIkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_GirisIkon, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel_GirisIkonLayout.setVerticalGroup(
            jPanel_GirisIkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GirisIkonLayout.createSequentialGroup()
                .addComponent(jLabel_GirisIkon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel_GirisParametreleri.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_GirisParametreleri.setPreferredSize(new java.awt.Dimension(350, 499));

        jPanel_Navigasyon.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel2.png"))); // NOI18N
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseExited(evt);
            }
        });

        jLabel_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimize.png"))); // NOI18N
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseExited(evt);
            }
        });

        jLabel_Move.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/move.png"))); // NOI18N
        jLabel_Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel_MoveMouseDragged(evt);
            }
        });
        jLabel_Move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_MoveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_NavigasyonLayout = new javax.swing.GroupLayout(jPanel_Navigasyon);
        jPanel_Navigasyon.setLayout(jPanel_NavigasyonLayout);
        jPanel_NavigasyonLayout.setHorizontalGroup(
            jPanel_NavigasyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_NavigasyonLayout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jLabel_Move)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_NavigasyonLayout.setVerticalGroup(
            jPanel_NavigasyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(jLabel_Minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_Move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_KullaniciIkon.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_UserIkon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_UserIkon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_KullaniciIkonLayout = new javax.swing.GroupLayout(jPanel_KullaniciIkon);
        jPanel_KullaniciIkon.setLayout(jPanel_KullaniciIkonLayout);
        jPanel_KullaniciIkonLayout.setHorizontalGroup(
            jPanel_KullaniciIkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_UserIkon, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel_KullaniciIkonLayout.setVerticalGroup(
            jPanel_KullaniciIkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KullaniciIkonLayout.createSequentialGroup()
                .addComponent(jLabel_UserIkon, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLabel_KurtarmaMesaji.setForeground(new java.awt.Color(32, 188, 233));
        jLabel_KurtarmaMesaji.setText("Kurtarma Kodu Giriniz");

        jLabel_Sayac.setForeground(new java.awt.Color(32, 188, 233));
        jLabel_Sayac.setText("120");

        jPanel_GirisAlanlari.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_KullaniciAdi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField_KullaniciAdi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kullanıcı Adı", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jPasswordField_Sifre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Şifre", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jTextField_KurtarmaKodu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kurtarma Kodu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel_SifremiUnuttum.setForeground(new java.awt.Color(0, 51, 255));
        jLabel_SifremiUnuttum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SifremiUnuttum.setText("Şifremi Unuttum");
        jLabel_SifremiUnuttum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SifremiUnuttumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_SifremiUnuttumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_SifremiUnuttumMouseExited(evt);
            }
        });

        jButton_GirisYap.setBackground(new java.awt.Color(255, 255, 255));
        jButton_GirisYap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_GirisYap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login.png"))); // NOI18N
        jButton_GirisYap.setText("Giriş");

        javax.swing.GroupLayout jPanel_GirisAlanlariLayout = new javax.swing.GroupLayout(jPanel_GirisAlanlari);
        jPanel_GirisAlanlari.setLayout(jPanel_GirisAlanlariLayout);
        jPanel_GirisAlanlariLayout.setHorizontalGroup(
            jPanel_GirisAlanlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GirisAlanlariLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_GirisAlanlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel_SifremiUnuttum, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_KurtarmaKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_GirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel_GirisAlanlariLayout.setVerticalGroup(
            jPanel_GirisAlanlariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GirisAlanlariLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_KurtarmaKodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_SifremiUnuttum)
                .addGap(18, 18, 18)
                .addComponent(jButton_GirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_GirisParametreleriLayout = new javax.swing.GroupLayout(jPanel_GirisParametreleri);
        jPanel_GirisParametreleri.setLayout(jPanel_GirisParametreleriLayout);
        jPanel_GirisParametreleriLayout.setHorizontalGroup(
            jPanel_GirisParametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_KullaniciIkon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_GirisAlanlari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_GirisParametreleriLayout.createSequentialGroup()
                .addGroup(jPanel_GirisParametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Navigasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_GirisParametreleriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_KurtarmaMesaji, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel_Sayac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_GirisParametreleriLayout.setVerticalGroup(
            jPanel_GirisParametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GirisParametreleriLayout.createSequentialGroup()
                .addComponent(jPanel_Navigasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_KullaniciIkon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_GirisParametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_KurtarmaMesaji)
                    .addComponent(jLabel_Sayac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_GirisAlanlari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel_AnaPanelLayout = new javax.swing.GroupLayout(jPanel_AnaPanel);
        jPanel_AnaPanel.setLayout(jPanel_AnaPanelLayout);
        jPanel_AnaPanelLayout.setHorizontalGroup(
            jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaPanelLayout.createSequentialGroup()
                .addComponent(jPanel_GirisIkon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_GirisParametreleri, javax.swing.GroupLayout.PREFERRED_SIZE, 346, Short.MAX_VALUE))
        );
        jPanel_AnaPanelLayout.setVerticalGroup(
            jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AnaPanelLayout.createSequentialGroup()
                .addGroup(jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_GirisIkon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                    .addComponent(jPanel_GirisParametreleri, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseEntered
        jLabel_Minimize.setIcon(renkVeIconlar.getMinimize2());
    }//GEN-LAST:event_jLabel_MinimizeMouseEntered

    private void jLabel_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseExited
        jLabel_Minimize.setIcon(renkVeIconlar.getMinimize());
    }//GEN-LAST:event_jLabel_MinimizeMouseExited

    private void jLabel_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseEntered
        jLabel_Close.setIcon(renkVeIconlar.getCancel());
    }//GEN-LAST:event_jLabel_CloseMouseEntered

    private void jLabel_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseExited
        jLabel_Close.setIcon(renkVeIconlar.getCancel2());
    }//GEN-LAST:event_jLabel_CloseMouseExited

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jLabel_SifremiUnuttumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SifremiUnuttumMouseEntered
        jLabel_SifremiUnuttum.setForeground(Color.BLACK);
        jLabel_SifremiUnuttum.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel_SifremiUnuttumMouseEntered

    private void jLabel_SifremiUnuttumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SifremiUnuttumMouseExited
        jLabel_SifremiUnuttum.setForeground(renkVeIconlar.getMavi());
    }//GEN-LAST:event_jLabel_SifremiUnuttumMouseExited

    private void jLabel_SifremiUnuttumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SifremiUnuttumMouseClicked

        String kullaniciAdi = jTextField_KullaniciAdi.getText();
        kullaniciAdi = kullaniciAdi.replace(" ", "");
        jTextField_KullaniciAdi.setText(kullaniciAdi);

        if (!kullaniciAdi.equals("")) {
            int dialogButton = JOptionPane.showConfirmDialog(this, "Kurtarma Kodu Mailiniz Gönderilsin mi?", "Uyarı", JOptionPane.YES_NO_OPTION);
            if (dialogButton == 0) {
                System.out.println("Kurtarma Kodu Mailinize Gönderiliyor");
                initComponentsGiris(true);
                
                SwingWorker<Boolean, Integer> swingWorker = new SwingWorker<Boolean, Integer>() {

                    @Override
                    protected Boolean doInBackground() throws Exception {
                        for (int i = 120; i >= 0; i--) {
                            jLabel_Sayac.setText(String.valueOf(i));
                            Thread.sleep(100);
                        }
                        return true;
                    }

                    @Override
                    protected void done() {
                        System.out.println("Süreniz Bitti");
                        initComponentsGiris(false);
                    }
                };
                swingWorker.execute();
            }
        } else {
            JOptionPane.showConfirmDialog(this, "Kullanıcı Adı Girmediniz");
        }
    }//GEN-LAST:event_jLabel_SifremiUnuttumMouseClicked

    private void jLabel_MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MoveMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jLabel_MoveMousePressed

    private void jLabel_MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MoveMouseDragged
        this.setLocation(evt.getXOnScreen() - posX - 591, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jLabel_MoveMouseDragged

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GirisYap;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_GirisIkon;
    private javax.swing.JLabel jLabel_KurtarmaMesaji;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JLabel jLabel_Move;
    private javax.swing.JLabel jLabel_Sayac;
    private javax.swing.JLabel jLabel_SifremiUnuttum;
    private javax.swing.JLabel jLabel_UserIkon;
    private javax.swing.JPanel jPanel_AnaPanel;
    private javax.swing.JPanel jPanel_GirisAlanlari;
    private javax.swing.JPanel jPanel_GirisIkon;
    private javax.swing.JPanel jPanel_GirisParametreleri;
    private javax.swing.JPanel jPanel_KullaniciIkon;
    private javax.swing.JPanel jPanel_Navigasyon;
    private javax.swing.JPasswordField jPasswordField_Sifre;
    private javax.swing.JTextField jTextField_KullaniciAdi;
    private javax.swing.JTextField jTextField_KurtarmaKodu;
    // End of variables declaration//GEN-END:variables
}
