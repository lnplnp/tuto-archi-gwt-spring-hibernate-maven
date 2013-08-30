package fr.manuelpayet.gwt.server;

import javax.servlet.ServletException;

import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.manuelpayet.gwt.client.rpc.ArticleService;
import fr.manuelpayet.gwt.core.model.Article;

@SuppressWarnings("serial")
public class ArticleServiceImpl extends RemoteServiceServlet implements ArticleService {

  private ClassPathXmlApplicationContext beanFactory;
  SessionFactory sessionFactory;

  public void init() throws ServletException {
    super.init();
    beanFactory = new ClassPathXmlApplicationContext("application-context.xml");
    sessionFactory = (SessionFactory) beanFactory.getBean("sessionFactory");
  }

  @Override
  public Article mergeArticle(Article article) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

}
