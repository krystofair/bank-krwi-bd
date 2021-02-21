package bdstudia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author krystofair
 */
public class BankiZnalezioneListModel extends DefaultListModel<String> {
    
    List<Integer> IdBankowNaLiscie;

    public BankiZnalezioneListModel() {
        IdBankowNaLiscie = new ArrayList<>();
    }
    
    public void dodajBanki(List<Bank> banki) {
        if(!this.isEmpty()){
            this.clear();
            IdBankowNaLiscie.clear();
        }
        banki.forEach(e->{
            addElement(e.getNazwa() + " "
                    + e.getAdres()+ " " 
                    + ((e.getKodpocztowy() != null) ? e.getKodpocztowy() : "")  + ", "
                    + e.getMiasto()+ " "
                    + e.getKraj());
            IdBankowNaLiscie.add(e.getIdbanku());
        });
    }
    
    public Integer getIdBanku(int index) {
        if(index < 0) throw new NullPointerException("indeks w Modelu listy jest ujemny");
        return IdBankowNaLiscie.get(index);
    }
}
