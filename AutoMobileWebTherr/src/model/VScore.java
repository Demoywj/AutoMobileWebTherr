package model;


/**
 * VScore entity. @author MyEclipse Persistence Tools
 */

public class VScore implements java.io.Serializable {


	private Integer scoreid;
	private Double scorestar;
	private String scorecontent;
	private String scoretime;
	private Integer repmaiid;
	private String userid;
	private String realname;
	private String adiminid;
	private Integer carid;
	private String brandname;
	private String typename;
	private String configname;

	// Constructors

	/** default constructor */
	public VScore() {
	}

	/** minimal constructor */
	public VScore(Integer scoreid, Double scorestar, String scoretime) {
		this.scoreid = scoreid;
		this.scorestar = scorestar;
		this.scoretime = scoretime;
	}

	/** full constructor */
	public VScore(Integer scoreid, Double scorestar, String scorecontent, String scoretime, Integer repmaiid,
			String userid, String realname, String adiminid, Integer carid, String brandname, String typename,
			String configname) {
		this.scoreid = scoreid;
		this.scorestar = scorestar;
		this.scorecontent = scorecontent;
		this.scoretime = scoretime;
		this.repmaiid = repmaiid;
		this.userid = userid;
		this.realname = realname;
		this.adiminid = adiminid;
		this.carid = carid;
		this.brandname = brandname;
		this.typename = typename;
		this.configname = configname;
	}

	// Property accessors

	public Integer getScoreid() {
		return this.scoreid;
	}

	public void setScoreid(Integer scoreid) {
		this.scoreid = scoreid;
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

	public Integer getRepmaiid() {
		return this.repmaiid;
	}

	public void setRepmaiid(Integer repmaiid) {
		this.repmaiid = repmaiid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getAdiminid() {
		return this.adiminid;
	}

	public void setAdiminid(String adiminid) {
		this.adiminid = adiminid;
	}

	public Integer getCarid() {
		return this.carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

	public String getBrandname() {
		return this.brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getConfigname() {
		return this.configname;
	}

	public void setConfigname(String configname) {
		this.configname = configname;
	}

}