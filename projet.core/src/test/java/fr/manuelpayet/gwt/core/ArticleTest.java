/**
 * 
 */
package fr.manuelpayet.gwt.core;

import junit.framework.TestCase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.manuelpayet.gwt.core.model.Article;

/**
 * @author Manuel
 * 
 */
public class ArticleTest extends TestCase {

  /**
   * 
   */
  protected ClassPathXmlApplicationContext applicationContext;
  /**
   * 
   */
  protected SessionFactory sessionFactory;
  /**
   * 
   */
  protected Session currentSession;

  /**
   * 
   */
  public ArticleTest() {
    applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
  }

  /*
   * (non-Javadoc)
   * 
   * @see junit.framework.TestCase#setUp()
   */
  /**
   * @throws Exception
   */
  @Before
  protected void setUp() throws Exception {
    super.setUp();
    currentSession = sessionFactory.getCurrentSession();
  }

  /*
   * (non-Javadoc)
   * 
   * @see junit.framework.TestCase#tearDown()
   */
  /**
   * @throws Exception
   */
  @After
  protected void tearDown() throws Exception {
    super.tearDown();
    sessionFactory.close();
  }

  /**
   * 
   */
  @Test
  public void testArticle() {
    currentSession.beginTransaction();

    String libelle = "libelle de l'article";

    Article article = new Article(libelle);
    currentSession.save(article);

    currentSession.getTransaction().commit();

    Integer idArticle = article.getIdArticle();

    assertNotNull(article);
    assertNotNull(idArticle);
    assertEquals(libelle, article.getLibelleArticle());
  }

}
