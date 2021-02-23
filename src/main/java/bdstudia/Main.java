/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bdstudia;


import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
  
    
public class Main {    
@SuppressWarnings("null")
public static void main(String[] args) {
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    SessionFactory factory = meta.getSessionFactoryBuilder().build();
    //PobranieForm zjf = new PobranieForm(factory);
    //zjf.pokazFormularz();
  RealizacjaZamowienJFrame zjf = new RealizacjaZamowienJFrame(factory);
  zjf.pokaz_formularz();
    //ZamowieniaJFrame zjf = new ZamowieniaJFrame(factory);
    //zjf.pokaz_formularz();
    //BankJFrame B = new BankJFrame(factory);
    //B.pokaz_formularz();
    /*
     GrupaKrwi g = new GrupaKrwi();
     g.setRodzaj("A");
     g.setWskaznikrh("-");
     Session sesja = factory.openSession();
     Zamowienie z = new Zamowienie();
     z.setIdzamowienia(4);
     EntityManager em = factory.createEntityManager();
     List<Object[]> r_l = em.createNativeQuery(
            "SELECT * "
            + "FROM realizacjezamowien "
            + "WHERE IDZamowienia = " + z.getIdzamowienia()
        ).getResultList();
        for(Object[] o : r_l){
            Realizacjazamowienia r = new Realizacjazamowienia();
            r.setIdrealizacji((Integer) o[0]);
            r.setIdzamowienia((Integer) o[1]);
            r.setIdpobrania((Integer) o[2]);
           
            System.out.println("Id realizacji -- "+r.getIdrealizacji());
        }
        Date data_graniczna_gorna = new Date(System.currentTimeMillis());
        Date data_graniczna_dolna = RealizacjaZamowienJFrame.data_graniczna(data_graniczna_gorna,730);
        String idZ = "2020-02-16 21:59:01",r = "2022-02-16 21:59:01";
        List<Object[]> WynikiOBJ = em.createNativeQuery(
                          " select x.IDPobrania, x.Rodzaj, x.WskaznikRh, x.DataPobrania "
                                  + "from ( "
                                  + "SELECT p.IDPobrania, og.Rodzaj, og.WskaznikRh, p.DataPobrania "
                                  + "FROM ( select pob.IDpobrania, pob.IDOsoby, prd.Typ, pob.DataPobrania "
                                  + "FROM pobrania pob INNER JOIN produkty prd "
                                  + "ON pob.IDProduktu = prd.IDProduktu "
                                  + "WHERE prd.Typ = 'osocze' ) p INNER JOIN ( "
                                  + "select o.IDOsoby, g.Rodzaj, g.WskaznikRh "
                                  + "from osoby o inner join grupykrwi g "
                                  + "ON o.IDGrupyKrwi = g.IDGrupyKrwi "
                                  + "WHERE Rodzaj LIKE '"+g.getRodzaj()+"' "
                                  + "AND WskaznikRh LIKE '"+g.getWskaznikrh()+"' ) og "
                                  + "ON p.IDOsoby = og.IDOsoby "
                                  + "WHERE DataPobrania between '"+data_graniczna_dolna+"' "
                                  + "AND  '2044-03-26 23:59:59.0' ) x "
                                  + "WHERE x.IDPobrania "
                                  + "NOT IN ( SELECT r.IDPobrania "
                                  + "FROM realizacjezamowien r );"
       )
        .getResultList(); 
        System.out.println(data_graniczna_dolna);
        System.out.println(data_graniczna_dolna.toString());
        System.out.println(data_graniczna_gorna);
        System.out.println(data_graniczna_gorna.toString());
        int i=0;
        List<WynikPobrania> WynikLista = new ArrayList<>();
        for(Object[] w : WynikiOBJ){        
           WynikPobrania WZ = new WynikPobrania(w);
           WynikLista.add(WZ);
           System.out.println("Wynik " + (i+1) + ": \n");
           i++;
           System.out.println(WZ.toString());
       }
        for(WynikPobrania w: WynikLista){
            System.out.println(w.toString());
        }

        */
    }
}   