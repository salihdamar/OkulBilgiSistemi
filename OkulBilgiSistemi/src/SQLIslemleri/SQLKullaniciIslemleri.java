/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLIslemleri;

import MailConfig.MailIslemleri;
import javax.mail.MessagingException;

/**
 *
 * @author Elif Eftelya
 */
public class SQLKullaniciIslemleri {

    //Değişkenler
    private String mailAtilacakAdres = "";
    private String unutulanSifre = "";

    //Classlar
    MailIslemleri mailIslemleri;

    public SQLKullaniciIslemleri(MailIslemleri mailIslemleri) {
        this.mailIslemleri = mailIslemleri;
    }
    
    public void kullaniciBul(String kullaniciAdi) {
        //bu bilgiler db gelecek
        this.mailAtilacakAdres = "udemyjframe@gmail.com";
        this.unutulanSifre = "123456";

    }

    public void sifremiUnuttum(String kullaniciAdi) throws MessagingException {
        kullaniciBul(kullaniciAdi);

        if (!mailAtilacakAdres.equals("")) {
            System.out.println("Mail Gönderme İşlemleri Devam edilecek.");
            mailIslemleri.mailGonder(mailAtilacakAdres);

        } else {
            System.out.println("Kullanıcı Maili Bulunamadı");
        }

    }

}
