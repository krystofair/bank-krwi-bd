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
    
//    Session sesja = factory.openSession();
//    EntityManager em = factory.createEntityManager();
//    List<Object> entities = em.createNativeQuery(
//	"SELECT * " +
//	"FROM Person pr, Partner pt " +
//	"WHERE pr.name = pt.name" )
//    .getResultList();
//    @NamedNativeQuery(
//            name = "OsobyGrupaKrwi",
//            query =
//            "SELECT " +
//                " O.IDOsoby, AS \"OKZ.Imie\", " +
//                " OKZ.Nazwisko, AS \"OKZ.Nazwisko\", " +
//                " OKZ.Rodzaj, AS \"OKZ.Rodzaj\","+
//                " OKZ.WskaznikRh, AS \"OKZ.WskaznikRh\", "+
//                " OKZ.Ilosc, AS \"OKZ.Ilosc\", "+
//                " OKZ.DataZamowienia, AS \"OKZ.DataZamowienia\", "+
//                " P.Typ, AS \"P.Typ\" " +
//                "FROM Produkty P " +
//                "JOIN ( SELECT " +
//                      
//                )\

//        String idZ = "o";
//        List<Object[]> WynikiOBJ = em.createNativeQuery(
//                "SELECT OKZ.Imie, OKZ.Nazwisko, OKZ.Rodzaj, OKZ.WskaznikRh, p.Typ, OKZ.Ilosc, OKZ.DataZamowienia, OKZ.IDZamowienia "
//                + "FROM ( "
//                    + "SELECT OK.Imie, OK.Nazwisko, OK.Rodzaj, OK.WskaznikRh , z.Ilosc, z.IDProduktu, z.DataZamowienia, z.IDZamowienia "
//                    + "FROM ( "
//                        + "SELECT o.IDOsoby, o.Imie, o.Nazwisko, k.Rodzaj, k.WskaznikRh "
//                        + "FROM osoby o INNER JOIN grupykrwi k "
//                        + "ON o.IDGrupyKrwi = k.IDGrupyKrwi "                        
//                    + ") AS OK INNER JOIN zamowienia z "
//                    + "ON OK.IDOsoby = z.IDOsoby "                    
//                + ") AS OKZ INNER JOIN produkty p "
//                + "ON OKZ.IDProduktu = p.IDProduktu "
//                + "WHERE p.Typ LIKE '%"
//                + idZ
//                +"%'"
//        )
//        .getResultList(); 
//        
//        
//        int i=0;
//        List<WynikZamowienia> WynikLista = new ArrayList<WynikZamowienia>();
//        for(Object[] w : WynikiOBJ){        
//            WynikZamowienia WZ = new WynikZamowienia(w);
//            WynikLista.add(WZ);
//            System.out.println("Wynik " + (i+1) + ": \n");
//            i++;
//            System.out.println(
//                WZ.getImie() + " " 
//              + WZ.getNazwisko() + " " 
//              + WZ.getRodzaj() + " " 
//              + WZ.getWskaznikRh() + " " 
//              + WZ.getTyp() + " " 
//              + WZ.getIlosc() + " " 
//              + WZ.getData_zamowienia() + " "
//              + WZ.getIdzamowienia()
//            );   
//        }
    }
}   