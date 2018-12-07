/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Daniel Marcucci
 */
public class clientes {
    private String nitCliPadre;
    private String nom;
    private String dir;
    private String tel;
    private boolean estado;

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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
