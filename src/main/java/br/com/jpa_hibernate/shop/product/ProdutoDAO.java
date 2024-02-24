package br.com.jpa_hibernate.shop.product;

import javax.persistence.EntityManager;

public class ProdutoDAO {

  private final EntityManager em;

  public ProdutoDAO(EntityManager em) {
    this.em = em;
  }

  public void cadastrar(Produto produto) {
    this.em.persist(produto);
  }

  public void atualizar(Produto produto) {
    this.em.merge(produto);
  }
}
