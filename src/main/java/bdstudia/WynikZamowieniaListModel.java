/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author makma
 */
public class WynikZamowieniaListModel extends  DefaultListModel<String> {
    List<Integer> IdZamowienNaLiscie;
    
    public WynikZamowieniaListModel() {
        IdZamowienNaLiscie = new ArrayList<>();
    }
    
    public void dodajZamowienia(List<WynikZamowienia> wz){
        if(!this.isEmpty()){
            this.clear();
            IdZamowienNaLiscie.clear();
        }
        wz.forEach(e->{
            addElement(e.getImie() + " "
                    + e.getNazwisko()+ " " 
                    + e.getRodzaj() + " "
                    + e.getWskaznikRh() + " "
                    + e.getTyp() + " "
                    + e.getIlosc() + " "
                    + e.getData_zamowienia() + " "
                    + e.getIdzamowienia());
            IdZamowienNaLiscie.add(e.getIdzamowienia());
        });
    }
    public Integer getIdWynikuZamowienia(int index) {
        if(index < 0) throw new NullPointerException("indeks w Modelu listy jest ujemny");
        return IdZamowienNaLiscie.get(index);
    }
        
}
