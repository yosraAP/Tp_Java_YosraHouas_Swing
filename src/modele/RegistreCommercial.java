/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import utils.CommercialDoublonException;

/**
 *
 * @author houas
 */
public class RegistreCommercial {

    private ArrayList<Commercial> registre;

    public RegistreCommercial() {
        this.registre = new ArrayList<>();

    }

    public ArrayList<Commercial> getRegistre() {
        return registre;
    }

    public void setRegistre(ArrayList<Commercial> registre) {
        this.registre = registre;
    }

    public void ajoutercommerciaux(Commercial com) {
        this.registre.add(com);
    }

    public void ajouterCommercial(Commercial com) throws CommercialDoublonException {
        if (validerCommercial(com)) {
            throw new CommercialDoublonException(com, "Commercial Doubon");
        } else {
            this.registre.add(com);
            JOptionPane.showMessageDialog(null, com.toString(), "Commercial Ajouter avec succes",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void afficherCommercial() {
        for (Commercial tmp : registre) {
            System.out.println(tmp);
        }

    }

    public boolean validerCommercial(Commercial com) {
        for (Commercial tmp : registre) {
            if (tmp.equals(com)) {
                return true;
            }
        }
        return false;

    }

}
