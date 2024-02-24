package br.com.jpa_hibernate.shop;

import br.com.jpa_hibernate.shop.product.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProdutoTests {

  public static void main(String[] args) {
    Produto celular = new Produto();
    celular.setNome("Iphone 11");
    celular.setDescricao("Apple");
    celular.setPreco(new BigDecimal("3000"));

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
    EntityManager em = factory.createEntityManager();

    em.getTransaction().begin();
    em.persist(celular);
    em.getTransaction().commit();
    em.close();
  }
}
