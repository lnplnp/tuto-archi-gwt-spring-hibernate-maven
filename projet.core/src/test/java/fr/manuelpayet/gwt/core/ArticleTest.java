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
    currentSession.beginTransaction();
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
    currentSession.getTransaction().commit();
    sessionFactory.close();
  }

  /**
   * 
   */
  @Test
  public void testHashCode() {
    assertNull("Not yet implemented", null);
  }

  /**
   * 
   */
  @Test
  public void testArticle() {

    String libelle = "libelle de l'article";

    Article article = new Article(libelle);
    Integer idArticle = article.getIdArticle();

    assertNotNull(article);
    assertNotNull(idArticle);
    assertEquals(libelle, article.getLibelleArticle());
  }

  /**
   * 
   */
  @Test
  public void testArticleString() {
    assertNull("Not yet implemented", null);
  }

  /**
   * 
   */
  @Test
  public void testArticleIntegerString() {
    assertNull("Not yet implemented", null);
  }

  /**
   * 
   */
  @Test
  public void testEqualsObject() {
    assertNull("Not yet implemented", null);
  }

  /**
   * 
   */
  @Test
  public void testGetIdArticle() {
    assertNull("Not yet implemented", null);
  }

  /**
   * 
   */
  @Test
  public void testSetIdArticle() {
    assertNull("Not yet implemented", null);
  }

  /**
   * 
   */
  @Test
  public void testGetLibelleArticle() {
    assertNull("Not yet implemented", null);
  }

  /**
   * 
   */
  @Test
  public void testSetLibelleArticle() {
    assertNull("Not yet implemented", null);
  }

}
