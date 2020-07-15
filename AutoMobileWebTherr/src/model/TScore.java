package model;



/**
 * TScore entity. @author MyEclipse Persistence Tools
 */

public class TScore implements java.io.Serializable {

	// Fields

	private Integer scoreid;
	private Integer repmaiid;
	private Double scorestar;
	private String scorecontent;
	private String scoretime;
	private String remark;

	// Constructors

	/** default constructor */
	public TScore() {
	}

	/** minimal constructor */
	public TScore(Double scorestar, String scoretime) {
		this.scorestar = scorestar;
		this.scoretime = scoretime;
	}

	/** full constructor */
	public TScore(Integer repmaiid, Double scorestar, String scorecontent, String scoretime, String remark) {
		this.repmaiid = repmaiid;
		this.scorestar = scorestar;
		this.scorecontent = scorecontent;
		this.scoretime = scoretime;
		this.remark = remark;
	}

	// Property accessors

	public Integer getScoreid() {
		return this.scoreid;
	}

	public void setScoreid(Integer scoreid) {
		this.scoreid = scoreid;
	}

	public Integer getRepmaiid() {
		return this.repmaiid;
	}

	public void setRepmaiid(Integer repmaiid) {
		this.repmaiid = repmaiid;
	}

	public Double getScorestar() {
		return this.scorestar;
	}

	public void setScorestar(Double scorestar) {
		this.scorestar = scorestar;
	}

	public String getScorecontent() {
		return this.scorecontent;
	}

	public void setScorecontent(String scorecontent) {
		this.scorecontent = scorecontent;
	}

	public String getScoretime() {
		return this.scoretime;
	}

	public void setScoretime(String scoretime) {
		this.scoretime = scoretime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}