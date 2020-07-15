package model;

import java.util.List;

public class ArticleReview {
	private TArticle article;
	private List<TReview> listreview;
	public TArticle getArticle() {
		return article;
	}
	public void setArticle(TArticle article) {
		this.article = article;
	}
	public List<TReview> getListreview() {
		return listreview;
	}
	public void setListreview(List<TReview> listreview) {
		this.listreview = listreview;
	}
}
