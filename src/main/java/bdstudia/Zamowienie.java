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
public class Zamowienie {
    private int id;
    private int idosoby, idproduktu, ilosc;
    private Date datazamowienia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdosoby() {
        return idosoby;
    }

    public void setIdosoby(int idosoby) {
        this.idosoby = idosoby;
    }

    public int getIdproduktu() {
        return idproduktu;
    }

    public void setIdproduktu(int idproduktu) {
        this.idproduktu = idproduktu;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Date getDatazamowienia() {
        return datazamowienia;
    }

    public void setDatazamowienia(Date datazamowienia) {
        this.datazamowienia = datazamowienia;
    }
    
    
}
