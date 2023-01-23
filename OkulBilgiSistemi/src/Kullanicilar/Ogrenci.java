/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kullanicilar;

/**
 *
 * @author Elif Eftelya
 */
public class Ogrenci extends Kullanici{
    private Integer okulaBaslamaTarihi;
    private Integer kayitliOlduguOkul;
    private Integer sinavPuani;

    public Ogrenci(Integer okulaBaslamaTarihi, Integer kayitliOlduguOkul, Integer sinavPuani, Integer id, Integer yas, String isim, String soyIsim, String kullaniciAdi, String kullaniciSifre, String role, String EMail) {
        super(id, yas, isim, soyIsim, kullaniciAdi, kullaniciSifre, role, EMail);
        this.okulaBaslamaTarihi = okulaBaslamaTarihi;
        this.kayitliOlduguOkul = kayitliOlduguOkul;
        this.sinavPuani = sinavPuani;
    }

    public Integer getOkulaBaslamaTarihi() {
        return okulaBaslamaTarihi;
    }

    public Integer getKayitliOlduguOkul() {
        return kayitliOlduguOkul;
    }

    public Integer getSinavPuani() {
        return sinavPuani;
    }
    
    
}
