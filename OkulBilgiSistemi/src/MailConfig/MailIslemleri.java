/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MailConfig;

import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Elif Eftelya
 */
public class MailIslemleri {

    //Değişkenler
    private String sifreKurtarmaKodu = "";
    private String mailAdresim = "udemjframe@gmail.com";
    private String mailSifrem = "wsyqofstlkgtwrtu";
    private String mailIcerigi_1 = "Merhaba, \n\nŞifrenizi Öğrenmek İçin Aşağıdaki Kodu Kullanınız;\n\n";
    private String mailIcerigi_2 = "\n\nİyi Günler";
    private String mailBasligi = "OBSUI Şifre Kurtarma Kodu";

    //Classlar
    Properties properties;
    Session session;
    Message message;

    public MailIslemleri() {
        propertiesDegerleriOlustur();
        sessionDegerleriniOluştur();
    }

    protected void propertiesDegerleriOlustur() {

        properties = System.getProperties();
        this.properties.put("mail.smtp.auth", "true");
        this.properties.put("mail.smtp.starttls.enable", "true");
        this.properties.put("mail.smtp.host", "smtp.gmail.com");
        this.properties.put("mail.smtp.port", "587");
        this.properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

    }

    protected void sessionDegerleriniOluştur() {
        session = session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mailAdresim, mailSifrem);
            }
        }
        );
    }

    public void mailGonder(String mailAtilacakAdres) throws AddressException, MessagingException {
        this.sifreKurtarmaKodu = kurtarmaSifresiUret();

        message = new MimeMessage(session);
        message.setFrom(new InternetAddress(mailAdresim));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(mailAtilacakAdres));
        message.setText(mailIcerigi_1 + this.sifreKurtarmaKodu + mailIcerigi_2);
        message.setSubject(mailBasligi);
        Transport.send(message);

    }

    public String kurtarmaSifresiUret() {
        int sifreUzunlugu = 10;
        String buyukharfler = "ABCDEFGHIJKLMNOPRSTWQYZ";
        String kucukHarfler = buyukharfler.toLowerCase();
        String rakamalar = "1234567890";
        String sifrePaterni = buyukharfler + kucukHarfler + rakamalar;

        StringBuilder sifreOlusturucu = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < sifreUzunlugu; i++) {
            sifreOlusturucu.append(sifrePaterni.charAt(random.nextInt(sifrePaterni.length())));
        }
        return sifreOlusturucu.toString();
    }

    public String getSifreKurtarmaKodu() {
        return sifreKurtarmaKodu;
    }
}
