/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import modele.Commercial;
import modele.Facture;
import modele.ListeFacture;
import modele.RegistreCommercial;

/**
 *
 * @author houas
 */
public class ManipulationFichier {

    public static void ecritureIOCommerciaux(RegistreCommercial rc) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file save !");
        int userSection = fileChooser.showSaveDialog(null);
        if (userSection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter(fileToSave);
                bw = new BufferedWriter(fw);
                //ecriture
                for (Commercial com : rc.getRegistre()) {
                    //ecrire une ligne
                    bw.write(formerLigne(com));
                    bw.newLine();
                }

            } catch (IOException ex) {
                Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (bw != null) {
                    try {
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

    }

    private static String formerLigne(Commercial com) {
        return com.getId_commercial() + " " + com.getNom() + " " + com.getPrenom() + " " + com.getEmail() + " " + com.getTel() + " " + com.getCategories();
    }

    public static void ecrireDetailsFacture(String nomFichier, ListeFacture listFacture) {
        File file = new File(nomFichier);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            //ecriture
            for (Facture f : listFacture.getListfacture()) {
                //ecrire une ligne
                bw.write(formerLigne(f));
                bw.newLine();
            }

        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManipulationFichier.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private static String formerLigne(Facture f) {
        return "Id_Commercial : " + f.getId_Commercial() + "\n" + "Fraix transport : " + f.getFraixTransport() + "\n" + "Frais Repas : " + f.getFraixRepas() + "\n" + "Frais Voyage : " + f.getFraisVoyage() + "\n"
                + "Frais Hebergement : " + f.getFraisHebergement() + "\n" + "Frais Totals : " + f.getFraisTotal();
    }

}
