package bdstudia;

import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author krystofair
 */
public class BankiZnalezioneListModel extends DefaultListModel<String> {

    public BankiZnalezioneListModel() {
    }
    
    public void dodajBanki(List<Bank> banki) {
        if(!this.isEmpty()) this.clear();
        banki.forEach(e->{
            addElement(e.getNazwa() + " "
                    + e.getAdres()+ " " 
                    + e.getKodpocztowy() + ", "
                    + e.getMiasto()+ " "
                    + e.getKraj());
        });
    }
}
