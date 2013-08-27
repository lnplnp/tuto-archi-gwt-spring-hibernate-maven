package fr.manuelpayet.gwt.server;

import javax.servlet.ServletException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.manuelpayet.gwt.client.rpc.ArticleServiceRPC;
import fr.manuelpayet.gwt.core.Article;
import fr.manuelpayet.gwt.service.IArticleService;

@SuppressWarnings("serial")
public class ArticleServiceRPCImpl extends RemoteServiceServlet implements ArticleServiceRPC {

  // fields
  /** service auth */
  private IArticleService service;
  /** contexte spring */
  protected ClassPathXmlApplicationContext beanFactory;

  // method
  @Override
  public void init() throws ServletException {
    super.init();
    beanFactory = new ClassPathXmlApplicationContext("application-context.xml");
    service = (IArticleService) beanFactory.getBean("articleService");
  }

  public Article mergeArticle(Article article) throws Exception {
    return service.mergeArticle(article);
  }
}
