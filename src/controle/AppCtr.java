package controle;

import modele.RegistreCommercial;
import ui.FenFlouAliments;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author houas
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistreCommercial listing = new RegistreCommercial();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenFlouAliments(listing).setVisible(true);
            }
        });

    }

}
