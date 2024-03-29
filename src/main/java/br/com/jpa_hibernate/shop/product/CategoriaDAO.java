package br.com.jpa_hibernate.shop.product;

import javax.persistence.EntityManager;

public class CategoriaDAO {

  private final EntityManager em;

  public CategoriaDAO(EntityManager em) {
    this.em = em;
  }

  public void cadastrar(Categoria categoria) {
    this.em.persist(categoria);
  }

  public void atualizar(Categoria categoria) {
    this.em.merge(categoria);
  }
}
