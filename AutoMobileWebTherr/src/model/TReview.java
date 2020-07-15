package model;



/**
 * TReview entity. @author MyEclipse Persistence Tools
 */

public class TReview implements java.io.Serializable {

	// Fields

	private Integer reviewid;
	private Integer articleid;
	private String userid;
	private String reviewcontent;
	private String createtime;
	private String remark;

	// Constructors

	/** default constructor */
	public TReview() {
	}

	/** full constructor */
	public TReview(Integer articleid, String userid, String reviewcontent, String createtime, String remark) {
		this.articleid = articleid;
		this.userid = userid;
		this.reviewcontent = reviewcontent;
		this.createtime = createtime;
		this.remark = remark;
	}

	// Property accessors

	public Integer getReviewid() {
		return this.reviewid;
	}

	public void setReviewid(Integer reviewid) {
		this.reviewid = reviewid;
	}

	public Integer getArticleid() {
		return this.articleid;
	}

	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}