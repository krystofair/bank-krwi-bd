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
