package fr.manuelpayet.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import fr.manuelpayet.gwt.client.rpc.ArticleService;
import fr.manuelpayet.gwt.core.model.Article;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {
  public void onModuleLoad() {
    // composants
    Label label = new Label("libellé de l'article");
    final TextBox textbox = new TextBox();
    Button button = new Button("valider");

    // action sur le bouton
    button.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        final AsyncCallback<Article> callback = new AsyncCallback<Article>() {
          public void onFailure(Throwable err) {
            Window.alert("Failure");
          }

          public void onSuccess(Article result) {
            Window.alert("Success : " + result.getLibelleArticle());
          }
        };
        // creation d'une instance article
        Article article = new Article(textbox.getText());
        // appel rpc
        ArticleService.Util.getInstance().mergeArticle(article, callback);
      }
    });
    // panel
    HorizontalPanel panel = new HorizontalPanel();
    panel.add(label);
    panel.add(textbox);
    panel.add(button);
    RootPanel.get().add(panel);
  }

}
