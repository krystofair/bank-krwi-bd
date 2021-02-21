package bdstudia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author krystofair
 */
public class OsobyZnalezioneModel extends DefaultListModel<String> {
    List<Integer> IdOsobNaLiscie;
    public OsobyZnalezioneModel() {
        IdOsobNaLiscie = new ArrayList<>();
    }
    
    public void dodajOsoby(List<Osoba> osoby) {
        if(!this.isEmpty()) {
            this.clear();
            IdOsobNaLiscie.clear();
        }
        osoby.forEach(e->{
            addElement(e.getImie() + " "
                    + e.getNazwisko() + " "
                    + e.getPesel()+ " "
                    + e.getAdres());
            IdOsobNaLiscie.add(e.getIdosoby());
        });
    }
    
    public Integer getIdOsoby(int index) {
        if(index < 0) throw new NullPointerException("indeks w Modelu listy jest ujemny");
        return IdOsobNaLiscie.get(index);
    }
}
