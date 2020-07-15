package model;



/**
 * TAnnouncement entity. @author MyEclipse Persistence Tools
 */

public class TAnnouncement implements java.io.Serializable {

	// Fields

	private Integer antid;
	private String antitle;
	private String ancontent;
	private String antime;
	private String remark;

	// Constructors

	/** default constructor */
	public TAnnouncement() {
	}

	/** full constructor */
	public TAnnouncement(String antitle, String ancontent, String antime, String remark) {
		this.antitle = antitle;
		this.ancontent = ancontent;
		this.antime = antime;
		this.remark = remark;
	}

	// Property accessors

	public Integer getAntid() {
		return this.antid;
	}

	public void setAntid(Integer antid) {
		this.antid = antid;
	}

	public String getAntitle() {
		return this.antitle;
	}

	public void setAntitle(String antitle) {
		this.antitle = antitle;
	}

	public String getAncontent() {
		return this.ancontent;
	}

	public void setAncontent(String ancontent) {
		this.ancontent = ancontent;
	}

	public String getAntime() {
		return this.antime;
	}

	public void setAntime(String antime) {
		this.antime = antime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}