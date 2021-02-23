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
public class WynikPobrania implements Serializable{
    private Integer idpobrania;
    private String grupakrwi;
    private String wskaznikRh;
    private Date datapobrania;

    public WynikPobrania(Object[] a){
        this.idpobrania = (Integer) a[0];
        this.grupakrwi = (String) a[1];
        this.wskaznikRh = a[2].toString();
        this.datapobrania = (Date) a[3];
    }
    
    public Integer getIdpobrania() {
        return idpobrania;
    }

    public void setIdpobrania(Integer idpobrania) {
        this.idpobrania = idpobrania;
    }

    public String getGrupakrwi() {
        return grupakrwi;
    }

    public void setGrupakrwi(String grupakrwi) {
        this.grupakrwi = grupakrwi;
    }

    public String getWskaznikRh() {
        return wskaznikRh;
    }

    public void setWskaznikRh(String wskaznikRh) {
        this.wskaznikRh = wskaznikRh;
    }

    public Date getDatapobrania() {
        return datapobrania;
    }

    public void setDatapobrania(Date datapobrania) {
        this.datapobrania = datapobrania;
    }
    
    @Override
    public String toString(){
        return this.getIdpobrania().toString() + ", " +
                this.getGrupakrwi() +
                this.getWskaznikRh() + ", " +
                this.getDatapobrania().toString();                
    }
    
    
}
