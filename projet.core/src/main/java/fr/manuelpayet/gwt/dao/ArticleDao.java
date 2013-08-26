package fr.manuelpayet.gwt.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import fr.manuelpayet.gwt.Article;

/**
 * Classe DAOArticle
 */
public class ArticleDao extends HibernateTemplate {

  public ArticleDao() {

  }

  /**
   * sauvegarde ou update un article
   */
  public Article mergeArticle(Article article) {
    return (Article) merge(article);
  }

  /**
   * supprime un article
   */
  public void deleteArticle(Article article) {
    delete(article);
  }

  /**
   * charge une liste d'article
   */
  @SuppressWarnings("unchecked")
  public List<Article> loadAllArticle() {
    return (List<Article>) loadAll(Article.class);
  }

  /**
   * charge un article en fonction d'un id
   */
  public Article loadArticle(int id) {
    return (Article) load(Article.class, id);
  }
}
