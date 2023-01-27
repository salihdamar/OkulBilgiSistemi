/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArayuzIslemleri;

import Kullanicilar.Kullanici;
import Paneller.PanelAtama;
import Paneller.PanelKullanici;
import Paneller.PanelOkul;
import Paneller.PanelSinav;
import Paneller.PanelSinif;
import javax.swing.JToggleButton;

/**
 *
 * @author Elif Eftelya
 */
public class OBSEkranIslemleri {

    private PanelKullanici panelKullanici;
    private PanelAtama panelAtama;
    private PanelSinav panelSinav;
    private PanelSinif panelSinif;
    private PanelOkul panelOkul;
    private Kullanici kullanici;

    public OBSEkranIslemleri(PanelKullanici panelKullanici, PanelAtama panelAtama, PanelSinav panelSinav, PanelSinif panelSinif, PanelOkul panelOkul, Kullanici kullanici) {
        this.panelKullanici = panelKullanici;
        this.panelAtama = panelAtama;
        this.panelSinav = panelSinav;
        this.panelSinif = panelSinif;
        this.panelOkul = panelOkul;
        this.kullanici = kullanici;
    }

  

    public void initComponet_UI() {
        panelKullanici.getjToggleButton().setSelected(true);
        panelAtama.getjToggleButton().setSelected(false);
        panelOkul.getjToggleButton().setSelected(false);
        panelSinav.getjToggleButton().setSelected(false);
        panelSinif.getjToggleButton().setSelected(false);

        panelKullanici.getjPanel().setVisible(true);
        panelAtama.getjPanel().setVisible(false);
        panelOkul.getjPanel().setVisible(false);
        panelSinav.getjPanel().setVisible(false);
        panelSinif.getjPanel().setVisible(false);
    }

    public void btnItemStateChanged(JToggleButton jToggleButton) {
        if (jToggleButton == panelKullanici.getjToggleButton()) {
            if (panelKullanici.getjToggleButton().isSelected() && !panelKullanici.isBtnSeciliMi()) {
                ekran_Kullanici();
            }

            if (panelKullanici.isBtnSeciliMi()) {
                panelKullanici.getjToggleButton().setSelected(true);
            }

        } else if (jToggleButton == panelAtama.getjToggleButton()) {
            if (panelAtama.getjToggleButton().isSelected() && !panelAtama.isBtnSeciliMi()) {
                ekran_Atama();
            }

            if (panelAtama.isBtnSeciliMi()) {
                panelAtama.getjToggleButton().setSelected(true);
            }

        } else if (jToggleButton == panelSinav.getjToggleButton()) {
            if (panelSinav.getjToggleButton().isSelected() && !panelSinav.isBtnSeciliMi()) {
                ekran_Sinav();
            }

            if (panelSinav.isBtnSeciliMi()) {
                panelSinav.getjToggleButton().setSelected(true);
            }

        } else if (jToggleButton == panelSinif.getjToggleButton()) {
            if (panelSinif.getjToggleButton().isSelected() && !panelSinif.isBtnSeciliMi()) {
                ekran_Sinif();
            }

            if (panelSinif.isBtnSeciliMi()) {
                panelSinif.getjToggleButton().setSelected(true);
            }

        } else if (jToggleButton == panelOkul.getjToggleButton()) {
            if (panelOkul.getjToggleButton().isSelected() && !panelOkul.isBtnSeciliMi()) {
                ekran_Okul();
            }

            if (panelOkul.isBtnSeciliMi()) {
                panelOkul.getjToggleButton().setSelected(true);
            }
        }
    }

    protected void ekran_Kullanici() {
        panelKullanici.setBtnSeciliMi(true);
        panelAtama.setBtnSeciliMi(false);
        panelSinav.setBtnSeciliMi(false);
        panelOkul.setBtnSeciliMi(false);
        panelSinif.setBtnSeciliMi(false);

        panelKullanici.getjToggleButton().setSelected(true);
        panelAtama.getjToggleButton().setSelected(false);
        panelSinav.getjToggleButton().setSelected(false);
        panelOkul.getjToggleButton().setSelected(false);
        panelSinif.getjToggleButton().setSelected(false);

        panelKullanici.getjPanel().setVisible(true);
        panelAtama.getjPanel().setVisible(false);
        panelSinav.getjPanel().setVisible(false);
        panelOkul.getjPanel().setVisible(false);
        panelSinif.getjPanel().setVisible(false);
    }

    protected void ekran_Atama() {
        panelKullanici.setBtnSeciliMi(false);
        panelAtama.setBtnSeciliMi(true);
        panelSinav.setBtnSeciliMi(false);
        panelOkul.setBtnSeciliMi(false);
        panelSinif.setBtnSeciliMi(false);

        panelKullanici.getjToggleButton().setSelected(false);
        panelAtama.getjToggleButton().setSelected(true);
        panelSinav.getjToggleButton().setSelected(false);
        panelOkul.getjToggleButton().setSelected(false);
        panelSinif.getjToggleButton().setSelected(false);

        panelKullanici.getjPanel().setVisible(false);
        panelAtama.getjPanel().setVisible(true);
        panelSinav.getjPanel().setVisible(false);
        panelOkul.getjPanel().setVisible(false);
        panelSinif.getjPanel().setVisible(false);
    }

    protected void ekran_Sinav() {
        panelKullanici.setBtnSeciliMi(false);
        panelAtama.setBtnSeciliMi(false);
        panelSinav.setBtnSeciliMi(true);
        panelOkul.setBtnSeciliMi(false);
        panelSinif.setBtnSeciliMi(false);

        panelKullanici.getjToggleButton().setSelected(false);
        panelAtama.getjToggleButton().setSelected(false);
        panelSinav.getjToggleButton().setSelected(true);
        panelOkul.getjToggleButton().setSelected(false);
        panelSinif.getjToggleButton().setSelected(false);

        panelKullanici.getjPanel().setVisible(false);
        panelAtama.getjPanel().setVisible(false);
        panelSinav.getjPanel().setVisible(true);
        panelOkul.getjPanel().setVisible(false);
        panelSinif.getjPanel().setVisible(false);
    }

    protected void ekran_Okul() {
        panelKullanici.setBtnSeciliMi(false);
        panelAtama.setBtnSeciliMi(false);
        panelSinav.setBtnSeciliMi(false);
        panelOkul.setBtnSeciliMi(true);
        panelSinif.setBtnSeciliMi(false);

        panelKullanici.getjToggleButton().setSelected(false);
        panelAtama.getjToggleButton().setSelected(false);
        panelSinav.getjToggleButton().setSelected(false);
        panelOkul.getjToggleButton().setSelected(true);
        panelSinif.getjToggleButton().setSelected(false);

        panelKullanici.getjPanel().setVisible(false);
        panelAtama.getjPanel().setVisible(false);
        panelSinav.getjPanel().setVisible(false);
        panelOkul.getjPanel().setVisible(true);
        panelSinif.getjPanel().setVisible(false);
    }

    protected void ekran_Sinif() {
        panelKullanici.setBtnSeciliMi(false);
        panelAtama.setBtnSeciliMi(false);
        panelSinav.setBtnSeciliMi(false);
        panelOkul.setBtnSeciliMi(false);
        panelSinif.setBtnSeciliMi(true);

        panelKullanici.getjToggleButton().setSelected(false);
        panelAtama.getjToggleButton().setSelected(false);
        panelSinav.getjToggleButton().setSelected(false);
        panelOkul.getjToggleButton().setSelected(false);
        panelSinif.getjToggleButton().setSelected(true);

        panelKullanici.getjPanel().setVisible(false);
        panelAtama.getjPanel().setVisible(false);
        panelSinav.getjPanel().setVisible(false);
        panelOkul.getjPanel().setVisible(false);
        panelSinif.getjPanel().setVisible(true);
    }
}
