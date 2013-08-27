package fr.manuelpayet.gwt.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

import fr.manuelpayet.gwt.core.Article;

public interface ArticleServiceRPCAsync {
  public void mergeArticle(Article article, AsyncCallback<Article> callback);
}
