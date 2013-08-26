package fr.manuelpayet.gwt;

import java.io.Serializable;

/**
 * Gestion des articles
 * 
 * @author guillaumeleone
 */
@SuppressWarnings("serial")
public class Article implements Serializable {

  // fields
  /** id fonctionnel d'un article */
  private Integer idArticle;
  /** libelle de l article */
  private String libelleArticle;

  // constructor
  public Article() {
  }

  public Article(Integer id, String libelle) {
    this(libelle);
    this.idArticle = id;
  }

  public Article(String libelle) {
    this.libelleArticle = libelle;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (this.getClass() != obj.getClass()) {
      return false;
    }
    Article other = (Article) obj;
    if (this.idArticle == null) {
      if (other.idArticle != null) {
        return false;
      }
    } else if (!this.idArticle.equals(other.idArticle)) {
      return false;
    }
    if (this.libelleArticle == null) {
      if (other.libelleArticle != null) {
        return false;
      }
    } else if (!this.libelleArticle.equals(other.libelleArticle)) {
      return false;
    }
    return true;
  }

  // Accesor
  public Integer getIdArticle() {
    return this.idArticle;
  }

  public String getLibelleArticle() {
    return this.libelleArticle;
  }

  // equals - hascode - compareTo - toString
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (this.idArticle == null ? 0 : this.idArticle.hashCode());
    result = prime * result + (this.libelleArticle == null ? 0 : this.libelleArticle.hashCode());
    return result;
  }

  public void setIdArticle(Integer idArticle) {
    this.idArticle = idArticle;
  }

  public void setLibelleArticle(String libelleArticle) {
    this.libelleArticle = libelleArticle;
  }
}
