/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author makma
 */
public class WynikZamowienia  implements Serializable{
    
    private String imie,nazwisko,rodzaj,typ;
    private Integer ilosc;
    private Date data_zamowienia;
    private String wskaznikRh;
    private Integer Idzamowienia;
    
    public WynikZamowienia(Object[] a){
        this.imie = (String) a[0];
        this.nazwisko = (String) a[1];
        this.rodzaj = (String) a[2];
        this.wskaznikRh = a[3].toString();
        this.typ = (String) a[4];
        this.ilosc = (Integer) a[5];
        this.data_zamowienia = (Date) a[6];
        this.Idzamowienia = (Integer) a[7];
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Integer getIlosc() {
        return ilosc;
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }

    public Date getData_zamowienia() {
        return data_zamowienia;
    }

    public void setData_zamowienia(Date data_zamowienia) {
        this.data_zamowienia = data_zamowienia;
    }

    public String getWskaznikRh() {
        return wskaznikRh;
    }
       

    public void setWskaznikRh(String wskaznikRh) {
        this.wskaznikRh = wskaznikRh;
    }

    public void setWskaznikRh(char wskaznikRh){
        this.wskaznikRh = String.valueOf(wskaznikRh);
    }

    public Integer getIdzamowienia() {
        return Idzamowienia;
    }

    public void setIdzamowienia(Integer Idzamowienia) {
        this.Idzamowienia = Idzamowienia;
    }
    
    
    
}
