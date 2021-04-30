package br.com.fiap.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class JPAUtil {
	
	public static EntityManager getEntityManager() {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cpcadastro-persistence-unit");
		EntityManager em = factory.createEntityManager();
		return em;
	
	}
}
