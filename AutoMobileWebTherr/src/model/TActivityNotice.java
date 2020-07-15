package model;



/**
 * TActivtyNotice entity. @author MyEclipse Persistence Tools
 */

public class TActivityNotice implements java.io.Serializable {

	// Fields

	private Integer activityid;
	private String activitytitle;
	private String activitycontent;
	private String activitytime;
	private String activityphoto;
	private String remark;

	// Constructors

	/** default constructor */
	public TActivityNotice() {
	}

	/** full constructor */
	public TActivityNotice(String activitytitle, String activitycontent, String activitytime, String activityphoto,
			String remark) {
		this.activitytitle = activitytitle;
		this.activitycontent = activitycontent;
		this.activitytime = activitytime;
		this.activityphoto = activityphoto;
		this.remark = remark;
	}

	// Property accessors

	public Integer getActivityid() {
		return this.activityid;
	}

	public void setActivityid(Integer activityid) {
		this.activityid = activityid;
	}

	public String getActivitytitle() {
		return this.activitytitle;
	}

	public void setActivitytitle(String activitytitle) {
		this.activitytitle = activitytitle;
	}

	public String getActivitycontent() {
		return this.activitycontent;
	}

	public void setActivitycontent(String activitycontent) {
		this.activitycontent = activitycontent;
	}

	public String getActivitytime() {
		return this.activitytime;
	}

	public void setActivitytime(String activitytime) {
		this.activitytime = activitytime;
	}

	public String getActivityphoto() {
		return this.activityphoto;
	}

	public void setActivityphoto(String activityphoto) {
		this.activityphoto = activityphoto;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}