/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLIslemleri;

import Kullanicilar.Admin;
import Kullanicilar.Kullanici;
import Kullanicilar.Ogrenci;
import Kullanicilar.Ogretmen;
import Kullanicilar.OkulMuduru;
import MailConfig.MailIslemleri;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.mail.MessagingException;

/**
 *
 * @author Elif Eftelya
 */
public class SQLKullaniciIslemleri extends SQLBaglanti {

    private final String KULLANICI_ADI_SIFRE = "SELECT * FROM kullanici WHERE kullaniciAdi=? AND kullaniciSifre=?";
    private final String KULLANICI_ADI = "SELECT * FROM kullanici WHERE kullaniciAdi=?";
    private final String ADMIN_ID = "SELECT * FROM admin WHERE id=?";
    private final String OGRENCI_ID = "SELECT * FROM ogrenci WHERE id=?";
    private final String OGRETMEN_ID = "SELECT * FROM ogretmen WHERE id=?";
    private final String OKULMUDURU_ID = "SELECT * FROM ogretmen INNER JOIN okulMuduru WHERE ogretmen.id=okulMuduru.id AND ogretmen.id=? ";

//Classlar
    MailIslemleri mailIslemleri;

    public SQLKullaniciIslemleri(MailIslemleri mailIslemleri, String DBIsim) {
        super(DBIsim);
        this.mailIslemleri = mailIslemleri;
    }

    public Kullanici kullaniciBul(String girilenKullaniciAdi) throws SQLException {
        Kullanici kullanici = null;
        komutTamamlayici = baglanti.prepareStatement(KULLANICI_ADI);
        komutTamamlayici.setString(1, girilenKullaniciAdi);

        ResultSet resultset = komutTamamlayici.executeQuery();
        while (resultset.next()) {
            kullanici = new Kullanici(
                    resultset.getInt("id"),
                    resultset.getInt("yas"),
                    resultset.getString("isim"),
                    resultset.getString("soyIsim"),
                    resultset.getString("kullaniciAdi"),
                    resultset.getString("KullaniciSifre"),
                    resultset.getString("role"),
                    resultset.getString("email")
            );
        }
        return kullanici;

    }

    public Kullanici KullaniciBul(String girilenKullaniciAdi, String girilenKullaniciSifre) throws SQLException {
        Kullanici kullanici = null;
        String role = "";
        komutTamamlayici = baglanti.prepareStatement(KULLANICI_ADI_SIFRE);
        komutTamamlayici.setString(1, girilenKullaniciAdi);
        komutTamamlayici.setString(2, girilenKullaniciSifre);

        ResultSet resultset = komutTamamlayici.executeQuery();

        while (resultset.next()) {
            role = resultset.getString("role");
            kullanici = switch (role) {
                case "Admin" ->
                    ekBilgilerBul(ADMIN_ID, resultset);
                case "Ogretmen" ->
                    ekBilgilerBul(OGRETMEN_ID, resultset);
                case "Ogrenci" ->
                    ekBilgilerBul(OGRENCI_ID, resultset);
                case "OkulMuduru" ->
                    ekBilgilerBul(OKULMUDURU_ID, resultset);
                default ->
                    null;
            };
        }
        return kullanici;
    }

    protected Kullanici ekBilgilerBul(String SQL, ResultSet resultSet) throws SQLException {
        Kullanici kullanici = null;
        Integer id = resultSet.getInt("id");
        String role = resultSet.getString("role");

        komutTamamlayici = baglanti.prepareStatement(SQL);
        komutTamamlayici.setInt(1, id);

        ResultSet resultset1 = komutTamamlayici.executeQuery();

        while (resultset1.next()) {

            kullanici = switch (role) {
                case "Admin" ->
                    new Admin(
                    resultset1.getInt("adminSifresi"),
                    resultSet.getInt("id"),
                    resultSet.getInt("yas"),
                    resultSet.getString("isim"),
                    resultSet.getString("soyIsim"),
                    resultSet.getString("kullaniciAdi"),
                    resultSet.getString("KullaniciSifre"),
                    resultSet.getString("role"),
                    resultSet.getString("email")
                    );
                case "Ogrenci" ->
                    new Ogrenci(
                    resultset1.getInt("okulaBaslamaTarihi"),
                    resultset1.getInt("kayitliOlduguOkul"),
                    resultset1.getInt("sinavPuani"),
                    resultSet.getInt("id"),
                    resultSet.getInt("yas"),
                    resultSet.getString("isim"),
                    resultSet.getString("soyIsim"),
                    resultSet.getString("kullaniciAdi"),
                    resultSet.getString("KullaniciSifre"),
                    resultSet.getString("role"),
                    resultSet.getString("email")
                    );
                case "Ogretmen" ->
                    new Ogretmen(
                    resultset1.getInt("atamaPuani"),
                    resultset1.getInt("ogretmenlikBaslamaTarihi"),
                    resultset1.getString("brans"),
                    resultset1.getInt("atandigiOkulId"),
                    resultSet.getInt("id"),
                    resultSet.getInt("yas"),
                    resultSet.getString("isim"),
                    resultSet.getString("soyIsim"),
                    resultSet.getString("kullaniciAdi"),
                    resultSet.getString("KullaniciSifre"),
                    resultSet.getString("role"),
                    resultSet.getString("email")
                    );
                default ->
                    new OkulMuduru(
                    resultset1.getInt("mudurlukBaslangicTarihi"),
                    resultset1.getInt("atamaPuani"),
                    resultset1.getInt("ogretmenlikBaslamaTarihi"),
                    resultset1.getString("brans"),
                    resultset1.getInt("atandigiOkulId"),
                    resultSet.getInt("id"),
                    resultSet.getInt("yas"),
                    resultSet.getString("isim"),
                    resultSet.getString("soyIsim"),
                    resultSet.getString("kullaniciAdi"),
                    resultSet.getString("KullaniciSifre"),
                    resultSet.getString("role"),
                    resultSet.getString("email")
                    );
            };

        }

        return kullanici;

    }

    public boolean sifremiUnuttum(Kullanici kullanici) throws MessagingException {

        if (!kullanici.getEMail().equals("")) {
            System.out.println("Mail Gönderme İşlemleri Devam edilecek.");
            mailIslemleri.mailGonder(kullanici.getEMail());
            return true;

        } else {
            System.out.println("Kullanıcı Maili Bulunamadı");
            return false;
        }

    }

}
