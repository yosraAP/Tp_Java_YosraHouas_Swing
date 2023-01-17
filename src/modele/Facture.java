/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author houas
 */
public class Facture implements Comparable<Facture> {

    private int id_Commercial;
    private double fraixTransport, fraixRepas, fraisVoyage, fraisHebergement, fraisTotal;

    public Facture() {
    }

    public Facture(int id_Commercial, double fraixTransport, double fraixRepas, double fraisVoyage, double fraisHebergement, double fraisTotal) {
        this.id_Commercial = id_Commercial;
        this.fraixTransport = fraixTransport;
        this.fraixRepas = fraixRepas;
        this.fraisVoyage = fraisVoyage;
        this.fraisHebergement = fraisHebergement;
        this.fraisTotal = fraisTotal;
    }

    public int getId_Commercial() {
        return id_Commercial;
    }

    public void setId_Commercial(int id_Commercial) {
        this.id_Commercial = id_Commercial;
    }

    public double getFraixTransport() {
        return fraixTransport;
    }

    public void setFraixTransport(double fraixTransport) {
        this.fraixTransport = fraixTransport;
    }

    public double getFraixRepas() {
        return fraixRepas;
    }

    public void setFraixRepas(double fraixRepas) {
        this.fraixRepas = fraixRepas;
    }

    public double getFraisVoyage() {
        return fraisVoyage;
    }

    public void setFraisVoyage(double fraisVoyage) {
        this.fraisVoyage = fraisVoyage;
    }

    public double getFraisHebergement() {
        return fraisHebergement;
    }

    public void setFraisHebergement(double fraisHebergement) {
        this.fraisHebergement = fraisHebergement;
    }

    public double getFraisTotal() {
        return fraisTotal;
    }

    public void setFraisTotal(double fraisTotal) {
        this.fraisTotal = fraisTotal;
    }

    @Override
    public String toString() {
        return "Facture{" + "id_Commercial=" + id_Commercial + ", fraixTransport=" + fraixTransport + ", fraixRepas=" + fraixRepas + ", fraisVoyage=" + fraisVoyage + ", fraisHebergement=" + fraisHebergement + ", fraisTotal=" + fraisTotal + '}';
    }

    @Override
    public int compareTo(Facture o) {
        if (this.getId_Commercial() > o.id_Commercial) {
            return 1;
        } else if (this.getId_Commercial() < o.id_Commercial) {
            return -1;
        } else {
            return 0;
        }
    }

}
