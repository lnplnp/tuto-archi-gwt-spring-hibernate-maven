package fr.manuelpayet.gwt.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

import fr.manuelpayet.gwt.core.model.Article;

public interface ArticleServiceAsync {

  public void mergeArticle(Article article, AsyncCallback<Article> callback);

}
