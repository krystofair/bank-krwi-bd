/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import java.util.Comparator;

/**
 *
 * @author krystofair
 */
public class OsobaComparator implements Comparator<Osoba> {
    
    
    public OsobaComparator(){
    }

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.getNazwisko().compareTo(o2.getNazwisko());
    }
    
}
