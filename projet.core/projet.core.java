fr.manuelpayet.gwt.service

public interface IArticleService {
    public Article mergeArticle(Article article);
}

public class ArticleServiceImpl implements IArticleService {

    //field
    /** dao pour l objet article */
    private ArticleDao articleDao;

        public  ArticleServiceImpl(){

    }

    public ArticleServiceImpl(ArticleDao articleDao){
        this.articleDao = articleDao;
    }

    //method
    @Override
    public Article mergeArticle(Article article) {
        return articleDao.mergeArticle(article);
    }

    //getter
    public ArticleDao getArticleDao() {
        return articleDao;
    }

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }
}