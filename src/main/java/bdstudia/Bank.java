/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

/**
 *
 * @author krystofair
 */
public class Bank {
    // properties
    private int idbanku;
    private String nazwa, adres, miasto, kodpocztowy, kraj;

    public void setIdbanku(int idbanku) {
        this.idbanku = idbanku;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public void setKodpocztowy(String kodpocztowy) {
        this.kodpocztowy = kodpocztowy;
    }

    public void setKraj(String kraj) {
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
}
