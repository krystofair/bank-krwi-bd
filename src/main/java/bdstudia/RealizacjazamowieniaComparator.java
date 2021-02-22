package bdstudia;

import java.util.Comparator;

/**
 *
 * @author makma
 */
public class RealizacjazamowieniaComparator implements Comparator<Realizacjazamowienia> {

    public RealizacjazamowieniaComparator() {
    }

    @Override
    public int compare(Realizacjazamowienia arg0, Realizacjazamowienia arg1) {
        return Integer.compare(arg0.getIdrealizacji(),arg1.getIdrealizacji());
    }
}
