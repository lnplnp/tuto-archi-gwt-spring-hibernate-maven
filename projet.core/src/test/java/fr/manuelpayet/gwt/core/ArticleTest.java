/**
 * 
 */
package fr.manuelpayet.gwt.core;

import junit.framework.TestCase;

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

  protected ClassPathXmlApplicationContext applicationContext;
  protected SessionFactory sessionFactory;

  public ArticleTest() {
    applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
    
  }

  /*
   * (non-Javadoc)
   * 
   * @see junit.framework.TestCase#setUp()
   */
  @Before
  protected void setUp() throws Exception {
    super.setUp();
  }

  /*
   * (non-Javadoc)
   * 
   * @see junit.framework.TestCase#tearDown()
   */
  @After
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  @Test
  public void test() {
    fail("Not yet implemented");
  }

}
