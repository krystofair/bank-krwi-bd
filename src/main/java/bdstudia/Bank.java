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
 * @author krystofair
 */
@Entity (name = "banki")
public class Bank implements Serializable {
    
    @Id
    private int idbanku;
    private String nazwa, adres, miasto, kodpocztowy, kraj;

    public void setIdbanku(int idbanku) {
        this.idbanku = idbanku;
    }

    public void setNazwa(String nazwa) {
        if(this.nazwa == null) this.nazwa = "";
        this.nazwa = nazwa;
    }

    public void setAdres(String adres) {
        if(this.adres == null) this.adres = "";
        this.adres = adres;
    }

    public void setMiasto(String miasto) {
        if(this.miasto == null) this.miasto = "";
        this.miasto = miasto;
    }

    public void setKodpocztowy(String kodpocztowy) {
        if(this.kodpocztowy == null) this.kodpocztowy = "";
        this.kodpocztowy = kodpocztowy;
    }

    public void setKraj(String kraj) {
        if(this.kraj == null) this.kraj = "";
        this.kraj = kraj;
    }

    public int getIdbanku() {
        return idbanku;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getKodpocztowy() {
        return kodpocztowy;
    }

    public String getKraj() {
        return kraj;
    }
    
    public boolean validate() {
        int i=0;
        boolean r = true;
        while(true) {
            try {
                switch(i) {
                    case 0:
                        i+=1;
                        if(this.nazwa.isBlank()) r=false;
                    case 1:
                        i+=1;
                        if( this.adres.isBlank())r=false;
                    case 2:
                        i+=1;
                        if( this.miasto.isBlank())r=false;
                    case 3:
                        i+=1;
                        if(this.kraj.isBlank())r=false;
                    case 4:
                        i+=1;
                        if( this.kodpocztowy.isBlank())r=false;
                }
                break;
            }
            catch (NullPointerException npe) {
            }
        }
        return r;
    }
}
