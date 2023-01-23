/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kullanicilar;

/**
 *
 * @author Elif Eftelya
 */
public class Kullanici {
    private  Integer id;
    private  Integer yas;
    private String isim;
    private String soyIsim;
    private String kullaniciAdi;
    private String kullaniciSifre;
    private String role;
    private String EMail;

    public Kullanici(Integer id, Integer yas, String isim, String soyIsim, String kullaniciAdi, String kullaniciSifre, String role, String EMail) {
        this.id = id;
        this.yas = yas;
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSifre = kullaniciSifre;
        this.role = role;
        this.EMail = EMail;
    }

    public Kullanici() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

    public Integer getYas() {
        return yas;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public String getRole() {
        return role;
    }

    public String getEMail() {
        return EMail;
    }

    
    
}
