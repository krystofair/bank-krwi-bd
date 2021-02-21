package bdstudia;

import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author krystofair
 */
public class OsobyZnalezioneModel extends DefaultListModel<String> {

    public OsobyZnalezioneModel() {
    }
    
    public void dodajOsoby(List<Osoba> osoby) {
        if(!this.isEmpty()) this.clear();
        osoby.forEach(e->{
            addElement(e.getImie() + " "
                    + e.getNazwisko() + " "
                    + e.getPesel()+ " "
                    + e.getAdres());
        });
    }
}
