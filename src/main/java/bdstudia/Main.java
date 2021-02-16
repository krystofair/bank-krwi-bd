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

//Transaction t = session.beginTransaction();

    try{
        // pobieranie listy rekordów :V
        var f = session.getEntityManagerFactory();
        var em = f.createEntityManager();
        var lista_gk = em.createQuery(
                "from grupykrwi ", GrupaKrwi.class
        ).getResultList();
        for(var gk : lista_gk) {
            System.out.print("Signle row: ");
            System.out.print(gk.getIdgrupykrwi());
            System.out.print(gk.getRodzaj());
            System.out.println(gk.getWskaznikrh());
        }
//        t.commit();   
    }
    catch(Exception e) {
        System.out.println(e.getMessage());
    }
    finally {
        factory.close();
        session.close();
    }
}    
}   