/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author houas
 */
public class ListeFacture {

    private Set<Facture> listfacture;

    public ListeFacture() {
        listfacture = new TreeSet();

    }

    public Set<Facture> getListfacture() {
        return listfacture;
    }

    public void setListfacture(Set<Facture> listfacture) {
        this.listfacture = listfacture;
    }

    public void afficherFacture() {
        for (Facture tmp : listfacture) {
            System.out.println(tmp);
        }
    }

    public void ajouterFacture(Facture f) {

        listfacture.add(f);

    }

}
