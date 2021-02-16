/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author makma
 */

@Entity (name="produkty")
public class Produkt implements Serializable{
    
    @Id
    private int idproduktu;
    private String typ;
    private int okresprzydatnosci;

    public int getIdproduktu() {
        return idproduktu;
    }

    public void setIdproduktu(int idproduktu) {
        this.idproduktu = idproduktu;
    }    

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getOkresprzydatnosci() {
        return okresprzydatnosci;
    }

    public void setOkresprzydatnosci(int okresprzydatnosci) {
        this.okresprzydatnosci = okresprzydatnosci;
    }
    
    
}
