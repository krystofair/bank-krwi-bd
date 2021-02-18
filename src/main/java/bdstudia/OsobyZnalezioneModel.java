/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        osoby.forEach(e->{
            addElement(e.getImie() + " "
                    + e.getNazwisko() + " "
                    + e.getPesel()+ " "
                    + e.getAdres());
        });
    }
    
    
    
}
