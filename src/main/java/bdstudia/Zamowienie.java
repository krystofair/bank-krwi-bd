/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author makma
 */

@Entity (name="zamowienia")
public class Zamowienie implements Serializable {
    
    @Id
    private int idzamowienia;
    
    @JoinColumn(name = "IDZamowienia")
    
    private int idosoby, idproduktu, ilosc;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date datazamowienia;

    public int getIdzamowienia() {
        return idzamowienia;
    }

    public void setIdzamowienia(int idzamowienia) {
        this.idzamowienia = idzamowienia;
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
