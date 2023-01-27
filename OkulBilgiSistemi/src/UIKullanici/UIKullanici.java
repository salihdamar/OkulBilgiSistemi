/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UIKullanici;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Elif Eftelya
 */
public class UIKullanici {

    private JTextField jTextField_EMail;
    private JTextField jTextField_Isim;
    private JTextField jTextField_KullaniciAdi;
    private JTextField jTextField_KullaniciSifre;
    private JTextField jTextField_SoyIsim;
    private JButton jButton_Yenile;
    private JButton jButton_Kayit;
    private JComboBox jComboBox_Role;
    private JSpinner jSpinner_Yas;
    private JPanel jPanel_OgrenciEkBilgiler;
    private JPanel jPanel_OgretmenlikEkBilgiler;
    private JComboBox jComboBox_OgretmenlikBaslamaYili;
    private JSpinner jSpinner_AtamaPuan;
    private JComboBox jComboBox_Brans;
    private JComboBox jComboBox_MudurlukBaslamaYılı;
    private JComboBox jComboBox_OgrencilikBalamaYili;
    private JPanel jPanel_DosyaOku;

    public UIKullanici(JTextField jTextField_EMail, JTextField jTextField_Isim, JTextField jTextField_KullaniciAdi, JTextField jTextField_KullaniciSifre, JTextField jTextField_SoyIsim, JButton jButton_Yenile, JButton jButton_Kayit, JComboBox jComboBox_Role, JSpinner jSpinner_Yas, JPanel jPanel_OgrenciEkBilgiler, JPanel jPanel_OgretmenlikEkBilgiler, JComboBox jComboBox_OgretmenlikBaslamaYili, JSpinner jSpinner_AtamaPuan, JComboBox jComboBox_Brans, JComboBox jComboBox_MudurlukBaslamaYılı, JComboBox jComboBox_OgrencilikBalamaYili, JPanel jPanel_DosyaOku) {
        this.jTextField_EMail = jTextField_EMail;
        this.jTextField_Isim = jTextField_Isim;
        this.jTextField_KullaniciAdi = jTextField_KullaniciAdi;
        this.jTextField_KullaniciSifre = jTextField_KullaniciSifre;
        this.jTextField_SoyIsim = jTextField_SoyIsim;
        this.jButton_Yenile = jButton_Yenile;
        this.jButton_Kayit = jButton_Kayit;
        this.jComboBox_Role = jComboBox_Role;
        this.jSpinner_Yas = jSpinner_Yas;
        this.jPanel_OgrenciEkBilgiler = jPanel_OgrenciEkBilgiler;
        this.jPanel_OgretmenlikEkBilgiler = jPanel_OgretmenlikEkBilgiler;
        this.jComboBox_OgretmenlikBaslamaYili = jComboBox_OgretmenlikBaslamaYili;
        this.jSpinner_AtamaPuan = jSpinner_AtamaPuan;
        this.jComboBox_Brans = jComboBox_Brans;
        this.jComboBox_MudurlukBaslamaYılı = jComboBox_MudurlukBaslamaYılı;
        this.jComboBox_OgrencilikBalamaYili = jComboBox_OgrencilikBalamaYili;
        this.jPanel_DosyaOku = jPanel_DosyaOku;
    }

    public JTextField getjTextField_EMail() {
        return jTextField_EMail;
    }

    public JTextField getjTextField_Isim() {
        return jTextField_Isim;
    }

    public JTextField getjTextField_KullaniciAdi() {
        return jTextField_KullaniciAdi;
    }

    public JTextField getjTextField_KullaniciSifre() {
        return jTextField_KullaniciSifre;
    }

    public JTextField getjTextField_SoyIsim() {
        return jTextField_SoyIsim;
    }

    public JButton getjButton_Yenile() {
        return jButton_Yenile;
    }

    public JButton getjButton_Kayit() {
        return jButton_Kayit;
    }

    public JComboBox getjComboBox_Role() {
        return jComboBox_Role;
    }

    public JSpinner getjSpinner_Yas() {
        return jSpinner_Yas;
    }

    public JPanel getjPanel_OgrenciEkBilgiler() {
        return jPanel_OgrenciEkBilgiler;
    }

    public JPanel getjPanel_OgretmenlikEkBilgiler() {
        return jPanel_OgretmenlikEkBilgiler;
    }

    public JComboBox getjComboBox_OgretmenlikBaslamaYili() {
        return jComboBox_OgretmenlikBaslamaYili;
    }

    public JSpinner getjSpinner_AtamaPuan() {
        return jSpinner_AtamaPuan;
    }

    public JComboBox getjComboBox_Brans() {
        return jComboBox_Brans;
    }

    public JComboBox getjComboBox_MudurlukBaslamaYılı() {
        return jComboBox_MudurlukBaslamaYılı;
    }

    public JComboBox getjComboBox_OgrencilikBalamaYili() {
        return jComboBox_OgrencilikBalamaYili;
    }

    public JPanel getjPanel_DosyaOku() {
        return jPanel_DosyaOku;
    }
}
