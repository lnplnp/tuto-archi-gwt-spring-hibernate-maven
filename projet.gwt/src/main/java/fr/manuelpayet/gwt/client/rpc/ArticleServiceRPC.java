package fr.manuelpayet.gwt.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import fr.manuelpayet.gwt.core.Article;

@RemoteServiceRelativePath("article")
public interface ArticleServiceRPC extends RemoteService {

  public class Util {
    // fields
    private static ArticleServiceRPCAsync instance;

    private Util() {
    }

    public static ArticleServiceRPCAsync getInstance() {
      if (instance == null)
        instance = (ArticleServiceRPCAsync) GWT.create(ArticleServiceRPC.class);
      return instance;
    }
  }

  Article mergeArticle(Article article) throws Exception;
}
