package model;

/**
 * VReview entity. @author MyEclipse Persistence Tools
 */

public class VReview implements java.io.Serializable {

	// Fields
	private Integer reviewid;
	private String articletitle;
	private String articlecontent;
	private String articlephoto;
	private String articletime;
	private Integer comments;
	private Integer browsenumber;
	private Integer pointratio;
	private String userid;
	private String reviewcontent;
	private String createtime;
	private String realname;

	// Constructors

	/** default constructor */
	public VReview() {
	}

	/** minimal constructor */
	public VReview(Integer reviewid, String articletime, Integer comments, Integer browsenumber,
			Integer pointratio, String createtime) {
		this.reviewid = reviewid;
		this.articletime = articletime;
		this.comments = comments;
		this.browsenumber = browsenumber;
		this.pointratio = pointratio;
		this.createtime = createtime;
	}

	/** full constructor */
	public VReview(Integer reviewid, String articletitle, String articlecontent, String articlephoto,
			String articletime, Integer comments, Integer browsenumber, Integer pointratio, String userid,
			String reviewcontent, String createtime, String realname) {
		this.reviewid = reviewid;
		this.articletitle = articletitle;
		this.articlecontent = articlecontent;
		this.articlephoto = articlephoto;
		this.articletime = articletime;
		this.comments = comments;
		this.browsenumber = browsenumber;
		this.pointratio = pointratio;
		this.userid = userid;
		this.reviewcontent = reviewcontent;
		this.createtime = createtime;
		this.realname = realname;
	}

	// Property accessors

	public Integer getReviewid() {
		return this.reviewid;
	}

	public void setReviewid(Integer reviewid) {
		this.reviewid = reviewid;
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

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getReviewcontent() {
		return this.reviewcontent;
	}

	public void setReviewcontent(String reviewcontent) {
		this.reviewcontent = reviewcontent;
	}

	public String getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

}