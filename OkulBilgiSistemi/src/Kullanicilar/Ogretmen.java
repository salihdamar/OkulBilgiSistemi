/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kullanicilar;

/**
 *
 * @author Elif Eftelya
 */
public class Ogretmen extends  Kullanici{
    private Integer atamaPuani;
    private Integer ogretmenlikBaslamaTarihi;
    private String brans;
    private Integer atandigiOkulId;

    public Ogretmen(Integer atamaPuani, Integer ogretmenlikBaslamaTarihi, String brans, Integer atandigiOkulId, Integer id, Integer yas, String isim, String soyIsim, String kullaniciAdi, String kullaniciSifre, String role, String EMail) {
        super(id, yas, isim, soyIsim, kullaniciAdi, kullaniciSifre, role, EMail);
        this.atamaPuani = atamaPuani;
        this.ogretmenlikBaslamaTarihi = ogretmenlikBaslamaTarihi;
        this.brans = brans;
        this.atandigiOkulId = atandigiOkulId;
    }


    public Integer getAtamaPuani() {
        return atamaPuani;
    }

    public Integer getOgretmenlikBaslamaTarihi() {
        return ogretmenlikBaslamaTarihi;
    }

    public String getBrans() {
        return brans;
    }

    public Integer getAtandigiOkulId() {
        return atandigiOkulId;
    }
    
}
