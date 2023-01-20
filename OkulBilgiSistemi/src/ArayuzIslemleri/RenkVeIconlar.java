/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArayuzIslemleri;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Elif Eftelya
 */
public class RenkVeIconlar {
//    İconlar

    private Icon cancel = new ImageIcon(getClass().getResource("/Image/cancel.png"));
    private Icon cancel2 = new ImageIcon(getClass().getResource("/Image/cancel2.png"));
    private Icon minimize = new ImageIcon(getClass().getResource("/Image/minimize.png"));
    private Icon minimize2 = new ImageIcon(getClass().getResource("/Image/minimize2.png"));
    private Icon user = new ImageIcon(getClass().getResource("/Image/user.png"));
    private Icon userWarning = new ImageIcon(getClass().getResource("/Image/userWarning.png"));

//    Renkler
    private Color mavi = new Color(43, 81, 154);

    public Icon getCancel() {
        return cancel;
    }

    public Icon getCancel2() {
        return cancel2;
    }

    public Icon getMinimize() {
        return minimize;
    }

    public Icon getMinimize2() {
        return minimize2;
    }

    public Color getMavi() {
        return mavi;
    }

    public Icon getUser() {
        return user;
    }

    public Icon getUserWarning() {
        return userWarning;
    }
    

}
