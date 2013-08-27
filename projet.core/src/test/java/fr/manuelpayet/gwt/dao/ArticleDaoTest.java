package fr.manuelpayet.gwt.dao;

import junit.framework.TestCase;

import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import fr.manuelpayet.gwt.core.Article;

public class ArticleDaoTest extends TestCase {

  protected ClassPathXmlApplicationContext beanFactory;
  protected SessionFactory sessionFactory;
  protected HibernateTemplate hibernateTemplate;
  private ArticleDao dao;

  public ArticleDaoTest() {
    beanFactory = new ClassPathXmlApplicationContext("application-context.xml");
    sessionFactory = (SessionFactory) beanFactory.getBean("sessionFactory");
    hibernateTemplate = new HibernateTemplate(sessionFactory);
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    dao = (ArticleDao) beanFactory.getBean("articleDao");
    dao.setSessionFactory(sessionFactory);
  }

  public void testMergeArticle() {

    String label = "libelle article";

    Article expected = new Article(label);
    Article result = dao.mergeArticle(expected);

    // test
    assertNotNull(result);
    assertNotNull(result.getIdArticle());
    assertEquals(label, result.getLibelleArticle());
  }

}
