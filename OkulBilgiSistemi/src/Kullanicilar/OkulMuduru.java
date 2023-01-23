/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kullanicilar;

/**
 *
 * @author Elif Eftelya
 */
public class OkulMuduru extends Ogretmen{
    private Integer mudurlukBaslangicTarihi;

    public OkulMuduru(Integer mudurBaslangicYili, Integer atamaPuani, Integer ogretmenlikBaslamaTarihi, String brans, Integer atandigiOkulId, Integer id, Integer yas, String isim, String soyIsim, String kullaniciAdi, String kullaniciSifre, String role, String EMail) {
        super(atamaPuani, ogretmenlikBaslamaTarihi, brans, atandigiOkulId, id, yas, isim, soyIsim, kullaniciAdi, kullaniciSifre, role, EMail);
        this.mudurlukBaslangicTarihi = mudurBaslangicYili;
    }

    public Integer getMudurBaslangicYili() {
        return mudurlukBaslangicTarihi;
    }
    
}
