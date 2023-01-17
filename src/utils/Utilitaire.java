/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author houas
 */
public class Utilitaire {

    public static Double CalculeDepense(double FraixTranport, double FraixRepas, double FraixVoyage, double FraixHebergement) {
        double fraixTotals;
        fraixTotals = FraixTranport + FraixRepas + FraixVoyage + FraixHebergement;
        return fraixTotals;

    }

}
