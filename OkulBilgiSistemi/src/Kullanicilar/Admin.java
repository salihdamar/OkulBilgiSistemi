/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kullanicilar;

/**
 *
 * @author Elif Eftelya
 */
public class Admin extends Kullanici {

    private Integer adminSifresi;

    public Admin(Integer adminSifresi, Integer id, Integer yas, String isim, String soyIsim, String kullaniciAdi, String kullaniciSifre, String role, String EMail) {
        super(id, yas, isim, soyIsim, kullaniciAdi, kullaniciSifre, role, EMail);
        this.adminSifresi = adminSifresi;
    }

  

    public Integer getAdminSifresi() {
        return adminSifresi;
    }

}
