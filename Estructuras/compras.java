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
public class compras {
    int noFacPadre;
    String nitProHijoP;
    Date fecha;
    float total;

    public int getNoFacPadre() {
        return noFacPadre;
    }

    public void setNoFacPadre(int noFacPadre) {
        this.noFacPadre = noFacPadre;
    }

    public String getNitProHijoP() {
        return nitProHijoP;
    }

    public void setNitProHijoP(String nitProHijoP) {
        this.nitProHijoP = nitProHijoP;
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
    
}
