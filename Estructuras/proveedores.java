/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author carda
 */
public class proveedores {
    private String nitProPadre, nom, dir, tel, contac, correo;
    private boolean estado;

    public String getNitProPadre() {
        return nitProPadre;
    }

    public void setNitProPadre(String nitProPadre) {
        this.nitProPadre = nitProPadre;
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

    public String getContac() {
        return contac;
    }

    public void setContac(String contac) {
        this.contac = contac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
