package model;


/**
 * TArtice entity. @author MyEclipse Persistence Tools
 */

public class TArticle implements java.io.Serializable {

	// Fields

	private Integer articleid;
	private String articletitle;
	private String articlecontent;
	private String articlephoto;
	private String articletime;
	private String remark;
	private Integer comments;
	private Integer browsenumber;
	private Integer pointratio;

	// Constructors

	/** default constructor */
	public TArticle() {
	}

	/** full constructor */
	public TArticle(String articletitle, String articlecontent, String articlephoto, String articletime,
			String remark, Integer comments, Integer browsenumber, Integer pointratio) {
		this.articletitle = articletitle;
		this.articlecontent = articlecontent;
		this.articlephoto = articlephoto;
		this.articletime = articletime;
		this.remark = remark;
		this.comments = comments;
		this.browsenumber = browsenumber;
		this.pointratio = pointratio;
	}

	// Property accessors

	public Integer getArticleid() {
		return this.articleid;
	}

	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}

	public String getArticletitle() {
		return this.articletitle;
	}

	public void setArticletitle(String articletitle) {
		this.articletitle = articletitle;
	}

	public String getArticlecontent() {
		return this.articlecontent;
	}

	public void setArticlecontent(String articlecontent) {
		this.articlecontent = articlecontent;
	}

	public String getArticlephoto() {
		return this.articlephoto;
	}

	public void setArticlephoto(String articlephoto) {
		this.articlephoto = articlephoto;
	}

	public String getArticletime() {
		return this.articletime;
	}

	public void setArticletime(String articletime) {
		this.articletime = articletime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Integer getBrowsenumber() {
		return this.browsenumber;
	}

	public void setBrowsenumber(Integer browsenumber) {
		this.browsenumber = browsenumber;
	}

	public Integer getPointratio() {
		return this.pointratio;
	}

	public void setPointratio(Integer pointratio) {
		this.pointratio = pointratio;
	}

}