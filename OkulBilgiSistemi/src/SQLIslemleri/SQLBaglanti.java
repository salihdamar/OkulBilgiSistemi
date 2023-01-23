/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLIslemleri;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elif Eftelya
 */
public class SQLBaglanti {

    final String KULLANICI_ADI = "root";
    final String PAROLA = "root";
    final String HOST = "localhost";
    final String JDBC = "jdbc:mysql://";
    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    final Integer PORT = 3306;

    String DBIsim;
    String baglantiURL;
    Connection baglanti = null;
    PreparedStatement komutTamamlayici;

    public SQLBaglanti(String DBIsim) {
        this.DBIsim = DBIsim;
        DBBaglantiKur();
    }

    public void DBBaglantiKur() {

        try {
            Class.forName(DRIVER);
            baglantiURL = JDBC + HOST + ":" + PORT + "/" + DBIsim;
            baglanti = (Connection)DriverManager.getConnection(baglantiURL, KULLANICI_ADI, PAROLA);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLBaglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
