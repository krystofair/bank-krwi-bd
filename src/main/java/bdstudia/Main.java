/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bdstudia;



import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
    
public class Main {    
public static void main(String[] args) {    
        
    //Create typesafe ServiceRegistry object    
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
          
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  

    SessionFactory factory = meta.getSessionFactoryBuilder().build();
    Session session = factory.openSession();
    Transaction t = session.beginTransaction();    
    Bank b0 = new Bank();
    try{    
        
        b0.setNazwa("nazwa9");
        b0.setAdres("adres7");
        b0.setMiasto("Zabrze" + "");
        b0.setKodpocztowy("DUPA");
        b0.setKraj("Niemcy");
        session.save(b0); 
        
        t.commit();     
        System.out.println("successfully saved blood bank");
        
        //factory.close();        
        session.close();   
    }
    catch(Exception e) {
        System.out.println("failed blood bank");
    }
    
    //factory = meta.getSessionFactoryBuilder().build();
//    session = factory.openSession();  
//    t = session.beginTransaction();
    GrupaKrwi gk0 = new GrupaKrwi();
//    try{  
//        
        gk0.setIdgrupykrwi(1);
        gk0.setRodzaj("AB");
        gk0.setWskaznikrh("-");
//        session.save(gk0); 
//        
//        t.commit();     
//        System.out.println("successfully saved blood type");
//        
//        //factory.close();        
//        session.close();   
//    }
//    catch(Exception e) {
//        System.out.println("failed blood type");
//    }
    
    //factory = meta.getSessionFactoryBuilder().build();
    session = factory.openSession();  
    t = session.beginTransaction();
    Osoba os0 = new Osoba();
    try{  
        
        os0.setPesel("95033012354");
        os0.setImie("Andrzej");
        os0.setNazwisko("Kowalski");
        os0.setIdgrupykrwi(gk0.getIdgrupykrwi());
        os0.setAdres(b0.getMiasto()+", Hutnicza 1");        
        os0.setTelefon(new String(os0.getPesel().toCharArray(),1,9));
        os0.setDataurodzenia(new Date(95,3,0));
        session.save(os0); 
        
        t.commit();     
        System.out.println("successfully saved person");
        
        //factory.close();        
        session.close();   
    }
    catch(Exception e) {
        System.out.println("failed person");
    }
    
    //factory = meta.getSessionFactoryBuilder().build();
    session = factory.openSession();  
    t = session.beginTransaction();
    Produkt pd0 = new Produkt();
    try{  
        
        pd0.setTyp("Krew Pelna");
        pd0.setOkresprzydatnosci(60);
        session.save(pd0);
        
        t.commit();     
        System.out.println("successfully saved product");
        
        //factory.close();        
        session.close();   
    }
    catch(Exception e) {
        System.out.println("failed product");
    }
    
    //factory = meta.getSessionFactoryBuilder().build();
    session = factory.openSession();  
    t = session.beginTransaction();
    Pobranie po0 = new Pobranie();
    try{  
       
        po0.setIdosoby(os0.getIdosoby());
        po0.setIdbanku(b0.getIdbanku());
        po0.setIdproduktu(pd0.getIdproduktu());
        po0.setDatapobrania(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        
        session.save(po0);
        
        t.commit();     
        System.out.println("successfully saved collection");
        
        //factory.close();        
        session.close();   
    }
    catch(Exception e) {
        System.out.println("failed collection");
    }
    
    //factory = meta.getSessionFactoryBuilder().build();
    session = factory.openSession();  
    t = session.beginTransaction();
    Zamowienie za0 = new Zamowienie();
    try{  
        
        za0.setIdosoby(os0.getIdosoby());
        za0.setIdproduktu(pd0.getIdproduktu());
        za0.setIlosc(1);
        za0.setDatazamowienia(po0.getDatapobrania());
        
        session.save(za0);
        
        t.commit();     
        System.out.println("successfully saved order");
        
        //factory.close();        
        session.close();   
    }
    catch(Exception e) {
        System.out.println("failed order");
    }
    
    //factory = meta.getSessionFactoryBuilder().build();
    session = factory.openSession();  
    t = session.beginTransaction();
    Realizacjazamowienia rz0 = new Realizacjazamowienia();
    try{  
               
        rz0.setIdpobrania(po0.getIdpobrania());
        rz0.setIdzamowienia(za0.getIdzamowienia()); 
        session.save(rz0);
        
        t.commit();     
        System.out.println("successfully saved realization");
        
        factory.close();        
        session.close();   
    }
    catch(Exception e) {
        System.out.println("failed realization");
    }
}    
}   