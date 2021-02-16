/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;


import javax.persistence.*;
import java.io.Serializable;
/**
 *
 * @author makma
 */

@Entity (name="realizacjezamowien")
public class Realizacjazamowienia implements Serializable {
    
    @Id
    private int idrealizacji;
    private int idpobrania,idzamowienia;


    public int getIdrealizacji() {
        return idrealizacji;
    }

    public void setIdrealizacji(int idrealizacji) {
        this.idrealizacji = idrealizacji;
    }

    

    public int getIdpobrania() {
        return idpobrania;
    }

    public void setIdpobrania(int idpobrania) {
        this.idpobrania = idpobrania;
    }

    public int getIdzamowienia() {
        return idzamowienia;
    }

    public void setIdzamowienia(int idzamowienia) {
        this.idzamowienia = idzamowienia;
    }
    
}
