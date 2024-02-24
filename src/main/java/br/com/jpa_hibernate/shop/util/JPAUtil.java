package br.com.jpa_hibernate.shop.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

  private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");

  public static EntityManager getEntityManager() {
    return factory.createEntityManager();
  }
}
