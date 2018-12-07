/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.Date;


/**
 *
 * @author carda
 */
public class ventas {
    int noFacPadre;
    String nitCliHijo;
    Date fecha;
    float total;
    
    private String nitCliPadre;
    private String nom;
    private String dir;
    private String tel;

    public int getNoFacPadre() {
        return noFacPadre;
    }

    public void setNoFacPadre(int noFacPadre) {
        this.noFacPadre = noFacPadre;
    }

    public String getNitCliHijo() {
        return nitCliHijo;
    }

    public void setNitCliHijo(String nitCliHijo) {
        this.nitCliHijo = nitCliHijo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getNitCliPadre() {
        return nitCliPadre;
    }

    public void setNitCliPadre(String nitCliPadre) {
        this.nitCliPadre = nitCliPadre;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
