/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArayuzIslemleri;

import java.util.Objects;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Elif Eftelya
 */
public class GirisEkranIslemleri {

    private JTextField jTextField_KullaniciAdi;
    private JTextField jTextField_KurtarmaKodu;
    private JPasswordField jPasswordField_Sifre;

    private String girilenKullaniciAdi;
    private String girilenSifre;
    private String girilenKurtarmaKodu;

    private String sonucMesaj;
    private String sonucKurtarma_BosAlan;
    private String sonucKurtarma_Mesaj;

    public GirisEkranIslemleri(JTextField jTextField_KullaniciAdi, JTextField jTextField_KurtarmaKodu, JPasswordField jPasswordField_Sifre) {
        this.jTextField_KullaniciAdi = jTextField_KullaniciAdi;
        this.jTextField_KurtarmaKodu = jTextField_KurtarmaKodu;
        this.jPasswordField_Sifre = jPasswordField_Sifre;

        this.girilenKullaniciAdi = jTextField_KullaniciAdi.getText();
        this.girilenSifre = new String(jPasswordField_Sifre.getPassword());
        this.girilenKurtarmaKodu = jTextField_KurtarmaKodu.getText();
    }

    public boolean bosGirisKontrol() {

        if (girilenKullaniciAdi.equals("") && girilenSifre.equals("")) {
            this.sonucMesaj = "Kullanıcı Adını ve Şifresini Giriniz";
            return false;

        } else if (girilenKullaniciAdi.equals("")) {
            this.sonucMesaj = "Kullanıcı Adını  Giriniz";
            return false;
        } else if (girilenSifre.equals("")) {
            this.sonucMesaj = "Kullanıcı  Şifresini Giriniz";
            return false;
        } else {
            this.sonucMesaj = "Başarılı";
            return true;
        }
    }


    public boolean sifreKurtar(String kurtarmaKodu) {
        boolean bosAlanKontrol = bosKurtarmaKoduKontrol();
        boolean alanKontrol = kurtarmaKoduKontrol(kurtarmaKodu);

        if (!bosAlanKontrol) {
            this.sonucMesaj = this.sonucKurtarma_BosAlan;
            return false;
        } else if (!alanKontrol) {
            this.sonucMesaj = this.sonucKurtarma_Mesaj;
            return false;
        } else {
            this.sonucMesaj = "Başarılı";
            return true;
        }
    }

    protected boolean bosKurtarmaKoduKontrol() {

        if (!girilenKurtarmaKodu.equals("")) {
            this.sonucKurtarma_BosAlan = "Başarılı";
            return true;
        } else {
            this.sonucKurtarma_BosAlan = "Kurtarma Kodu Girmediniz";
            return false;
        }
    }

    protected boolean kurtarmaKoduKontrol(String kurtarmaKodu) {

        if (girilenKurtarmaKodu.equals(kurtarmaKodu)) {
            this.sonucKurtarma_Mesaj = "Başarılı";
            return true;
        } else {
            this.sonucKurtarma_Mesaj = "Kurtarma Kodu Eşleşmedi";
            return false;
        }
    }

    public String getSonucMesaj() {
        return sonucMesaj;
    }

}
