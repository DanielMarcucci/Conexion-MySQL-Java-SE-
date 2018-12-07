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
public class articulos {
    private int idArtPadre;
    private String cod;
    private String des;
    private Double preVenta;
    private Double preCosto;
    private boolean estado;

    public int getIdArtPadre() {
        return idArtPadre;
    }

    public void setIdArtPadre(int idArtPadre) {
        this.idArtPadre = idArtPadre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Double getPreVenta() {
        return preVenta;
    }

    public void setPreVenta(Double preVenta) {
        this.preVenta = preVenta;
    }

    public Double getPreCosto() {
        return preCosto;
    }

    public void setPreCosto(Double preCosto) {
        this.preCosto = preCosto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
