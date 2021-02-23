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
 * @author krystofair
 */

@Entity (name = "osoby")
public class Osoba implements Serializable {
    
    @Id
    private int idosoby;
    
    @JoinColumn(name = "IDOsoby")
    
    private String pesel, imie, nazwisko;
    private int idgrupykrwi;
    private String adres, telefon;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dataurodzenia;
    
    public void setIdosoby(int idosoby) {
        this.idosoby = idosoby;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setIdgrupykrwi(int idgrupykrwi) {
        this.idgrupykrwi = idgrupykrwi;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setDataurodzenia(Date dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }

    public int getIdosoby() {
        return idosoby;
    }

    public String getPesel() {
        return pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getIdgrupykrwi() {
        return idgrupykrwi;
    }

    public String getAdres() {
        return adres;
    }

    public String getTelefon() {
        return telefon;
    }
    
    public Date getDataurodzenia() {
        return dataurodzenia;
    }
 
    
}
