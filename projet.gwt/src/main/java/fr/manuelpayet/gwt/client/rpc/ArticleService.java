package fr.manuelpayet.gwt.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import fr.manuelpayet.gwt.core.model.Article;

@RemoteServiceRelativePath("article")
public interface ArticleService extends RemoteService {

  public class Util {
    // fields
    private static ArticleServiceAsync instance;

    private Util() {
    }

    public static ArticleServiceAsync getInstance() {
      if (instance == null) {
        instance = (ArticleServiceAsync) GWT.create(ArticleService.class);
      }
      return instance;
    }
  }

  Article mergeArticle(Article article) throws Exception;
}
