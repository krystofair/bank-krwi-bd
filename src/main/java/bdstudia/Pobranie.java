/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import java.util.Date;

/**
 *
 * @author makma
 */
public class Pobranie {
    private int idpobrania;
    private int idosoby, idbanku, idproduktu;
    private Date datapobrania;

    public int getIdpobrania() {
        return idpobrania;
    }

    public void setIdpobrania(int idpobrania) {
        this.idpobrania = idpobrania;
    }

    

    public int getIdosoby() {
        return idosoby;
    }

    public void setIdosoby(int idosoby) {
        this.idosoby = idosoby;
    }

    public int getIdbanku() {
        return idbanku;
    }

    public void setIdbanku(int idbanku) {
        this.idbanku = idbanku;
    }

    public int getIdproduktu() {
        return idproduktu;
    }

    public void setIdproduktu(int idproduktu) {
        this.idproduktu = idproduktu;
    }

    public Date getDatapobrania() {
        return datapobrania;
    }

    public void setDatapobrania(Date datapobrania) {
        this.datapobrania = datapobrania;
    }
    
    
}
