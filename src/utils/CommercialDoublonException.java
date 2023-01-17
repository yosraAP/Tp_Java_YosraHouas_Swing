/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import modele.Commercial;

/**
 *
 * @author houas
 */
public class CommercialDoublonException extends Exception {

    private Commercial com;

    public CommercialDoublonException(Commercial com, String message) {
        super(message);
        this.com = com;
    }

    public Commercial getCom() {
        return com;
    }

    public void setCom(Commercial com) {
        this.com = com;
    }

    @Override
    public String toString() {
        return "CommercialDoublonException{" + "com=" + com + '}';
    }

}
