/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paneller;

import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author Elif Eftelya
 */
public class Panel {

    private boolean btnSeciliMi = false;
    private JToggleButton jToggleButton;
    private JPanel jPanel;

    public Panel(JToggleButton jToggleButton, JPanel jPanel) {
        this.jToggleButton = jToggleButton;
        this.jPanel = jPanel;
    }

    public boolean isBtnSeciliMi() {
        return btnSeciliMi;
    }

    public void setBtnSeciliMi(boolean btnSeciliMi) {
        this.btnSeciliMi = btnSeciliMi;
    }

    public JToggleButton getjToggleButton() {
        return jToggleButton;
    }

    public JPanel getjPanel() {
        return jPanel;
    }
}
