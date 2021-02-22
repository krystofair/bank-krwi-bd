/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdstudia;

import java.util.Comparator;

/**
 *
 * @author makma
 */
public class WynikZamowieniaComparator implements Comparator<WynikZamowienia> {

    public WynikZamowieniaComparator(){        
    }
    
    @Override
    public int compare(WynikZamowienia arg0, WynikZamowienia arg1) {
        return arg0.getData_zamowienia().compareTo(arg1.getData_zamowienia());
    }
    
}
