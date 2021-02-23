package bdstudia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
/**
 *
 * @author makma
 */
public class RealizacjazamowieniaListModel extends DefaultListModel<String>  {
    List<Integer> IdRealizacjiNaLiscie;
    public RealizacjazamowieniaListModel(){
        IdRealizacjiNaLiscie = new ArrayList<Integer>();
    }
    
    public void dodajRealizacjeZamowien(List<Realizacjazamowienia> rz){
        
        if(!this.isEmpty()){            
            this.clear();            
            IdRealizacjiNaLiscie.clear();            
        }
        
        rz.stream().map(r -> {            
            return r;
        }).map(r -> {
            this.addElement("[  ID realizacji :"+r.getIdrealizacji()
                    +"   |   ID zamowienia: "+ r.getIdzamowienia() 
                    +"   |   ID pobrania:"+r.getIdpobrania()+"   ]");
            return r;
        }).forEachOrdered(r -> {
            IdRealizacjiNaLiscie.add(r.getIdrealizacji());
        });
    }
}
