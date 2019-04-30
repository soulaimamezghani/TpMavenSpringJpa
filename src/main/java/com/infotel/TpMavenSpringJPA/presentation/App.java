package com.infotel.TpMavenSpringJPA.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;
import com.infotel.TpMavenSpringJPA.service.Iservice;
import com.infotel.TpMavenSpringJPA.service.ServiceImpl;

public class App {
 public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	 Personne p= context.getBean("personne" ,Personne.class);
////	    p.setNom("loulou");
//	    p.setPrenom("Ghada");
//	    p.setAge(28);
//	    
//	    Personne k= context.getBean("personne" ,Personne.class);
//	    k.setNom("chakroun");
//	    k.setPrenom("eya");
//	    k.setAge(8);
//	   
//	  
//	    Personne f= context.getBean("personne" ,Personne.class);
//		    f.setNom("Baccar");
//		    f.setPrenom("ons");
//		    f.setAge(9);
	Iservice service =context.getBean("serviceImpl",ServiceImpl.class);
//    
//  //  service.ajouterPersonne(p);
//    System.out.println( p);
//    
//    	Personne s=	service.affichagePersonne(5);
//		s.setNom("jmal");
//		s.setPrenom("amira");
//		s.setAge(66);
////		service.modifierPersonne(s);
//		
////		service.getPersonne(5);
////        service.supprimerPersonne(service.getPersonne(5));
//        service.findAllPersonnes();
//        System.out.println(service.findAllPersonnes());
//       Adresse a= context.getBean("adresse" ,Adresse.class);
//	   a.setNomRue("avenue des marrons");
//	   a.setNumRue("45");
//	   a.setCp(98777);
//	   a.setVille("Paris");
////	   service.ajouterAdresse(a);
//	   System.out.println(a);
//	   
//	   Adresse a1= context.getBean("adresse" ,Adresse.class);
//	   a1.setNomRue("avenue des loups");
//	   a1.setNumRue("76");
//	   a1.setCp(76555);
//	   a1.setVille("Paris");
////	   service.ajouterAdresse(a1);
//	   System.out.println(a1);
//	   
//	   Adresse a2= context.getBean("adresse" ,Adresse.class);
//	   a2.setNomRue("avenue des toutou");
//	   a2.setNumRue("56");
//	   a2.setCp(99999);
//	   a2.setVille("Palestine");
////	   service.ajouterAdresse(a2);
//	   System.out.println(a2);
////	   service.getAdresse(4);
////	   service.supprimerAdresse( service.getAdresse(4));
//	 Adresse y=  service.affichageAdresse(5);
//	 y.setNomRue("yessamine");
//	 y.setNumRue("7777");
//	 y.setCp(98999);
//	 y.setVille("Tunisie");  
//	 service.modifierAdresse(y);
	 
	 service.findAllAdresses();
	 System.out.println( service.findAllAdresses());
}
}
