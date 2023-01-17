/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.Objects;

/**
 *
 * @author houas
 */
public class Commercial {

    private int id_commercial;
    private String nom, prenom, email, tel, categories;

    public Commercial() {
    }

    public Commercial(int id_commercial, String nom, String prenom, String email, String tel, String categories) {
        this.id_commercial = id_commercial;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.categories = categories;
    }

    public int getId_commercial() {
        return id_commercial;
    }

    public void setId_commercial(int id_commercial) {
        this.id_commercial = id_commercial;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nom);
        hash = 37 * hash + Objects.hashCode(this.prenom);
        hash = 37 * hash + Objects.hashCode(this.categories);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Commercial other = (Commercial) obj;
        if (!Objects.equals(this.nom.toUpperCase(), other.nom.toUpperCase())) {
            return false;
        }
        if (!Objects.equals(this.prenom.toUpperCase(), other.prenom.toUpperCase())) {
            return false;
        }
        return Objects.equals(this.categories.toUpperCase(), other.categories.toUpperCase());
    }

    @Override
    public String toString() {
        return "Commercial{" + "id_commercial=" + id_commercial + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", tel=" + tel + ", categories=" + categories + '}';
    }

}
