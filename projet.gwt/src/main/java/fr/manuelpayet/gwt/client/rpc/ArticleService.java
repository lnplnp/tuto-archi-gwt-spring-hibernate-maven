package fr.manuelpayet.gwt.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import fr.manuelpayet.gwt.core.model.Article;

@RemoteServiceRelativePath("article")
public interface ArticleService extends RemoteService {

  Article mergeArticle(Article article) throws Exception;

}
