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
                    + e.getNazwisko()+ ", " 
                    + e.getTyp() + " "
                    + e.getRodzaj() + e.getWskaznikRh() + " | "                    
                    + e.getIlosc() + " dawek, "
                    + e.getData_zamowienia() + ", Zamówienie nr: "
                    + e.getIdzamowienia());
            IdZamowienNaLiscie.add(e.getIdzamowienia());
        });
    }
    public Integer getIdWynikuZamowienia(int index) {
        if(index < 0) throw new NullPointerException("indeks w Modelu listy jest ujemny");
        return IdZamowienNaLiscie.get(index);
    }
        
}
