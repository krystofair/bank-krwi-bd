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
@Entity (name = "pobrania")
public class Pobranie implements Serializable {
    
    @Id
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

    @Override
    public String toString() {
        return "Pobranie{" + "idpobrania=" + idpobrania + ", idosoby=" + idosoby + ", idbanku=" + idbanku + ", idproduktu=" + idproduktu + ", datapobrania=" + datapobrania + '}';
    }
    
}
