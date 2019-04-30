package com.infotel.TpMavenSpringJPA.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;
@Transactional // ca remplace les transactions
@Repository
public class DaoImpl implements Idao{
	@PersistenceContext //bean injecte dans dao
	EntityManager em;

	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		em.persist(p);
		return p.getId();
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		 Personne p = new Personne();
		 p=em.getReference(Personne.class, idPersonne);
		return p;
	}

	@Override
	public Personne affichagePersonne(int idPersonne) {
		Personne p=new Personne();
		p=em.find(Personne.class, idPersonne);
		
		return p ;
	}

	@Override
	public int supprimerPersonne(Personne p) {
		  em.remove(p);
		  return p.getId();
	}

	@Override
	public int modifierPersonne(Personne p) {
		em.merge(p);
		return p.getId();
	}

	@Override
	public List<Personne> findAllPersonnes() {
		Query q=null;
     List<Personne> l=new ArrayList<Personne>();
     q=em.createQuery("Select p From Personne p");
     l=q.getResultList();
     return l;
	}

	@Override
	public int ajouterAdresse(Adresse a) {
		em.persist(a);
		return a.getIdAdresse();
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		Adresse a =new Adresse();
		a=em.getReference(Adresse.class, idAdresse);
		return a;
	}

	@Override
	public Adresse affichageAdresse(int idAdresse) {
		Adresse a =new Adresse();
		a=em.find(Adresse.class, idAdresse);
		return a;
	}

	@Override
	public int supprimerAdresse(Adresse a) {
		em.remove(a);
		return a.getIdAdresse();
	}

	@Override
	public int modifierAdresse(Adresse a) {
		em.merge(a);
		return a.getIdAdresse();
	}

	@Override
	public List<Adresse> findAllAdresses() {
		Query q=null;
	     List<Adresse> l=new ArrayList<Adresse>();
	     q=em.createQuery("Select a From Adresse a");
	     l=q.getResultList();
	     return l;
	}

}
