package br.com.jpa_hibernate.shop;

import br.com.jpa_hibernate.shop.product.Categoria;
import br.com.jpa_hibernate.shop.product.CategoriaDAO;
import br.com.jpa_hibernate.shop.product.Produto;
import br.com.jpa_hibernate.shop.product.ProdutoDAO;
import br.com.jpa_hibernate.shop.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProdutoTests {

  public static void main(String[] args) {
    Produto celular = new Produto();
    Categoria celulares = new Categoria("CELULARES");

    celular.setNome("Iphone 11");
    celular.setDescricao("Apple");
    celular.setPreco(new BigDecimal("3000"));
    celular.setCategoria(celulares);

    EntityManager em = JPAUtil.getEntityManager();
    ProdutoDAO pDao = new ProdutoDAO(em);
    CategoriaDAO cDao = new CategoriaDAO(em);

    em.getTransaction().begin();

    cDao.cadastrar(celulares);
    pDao.cadastrar(celular);

    em.getTransaction().commit();
    em.close();
  }
}
