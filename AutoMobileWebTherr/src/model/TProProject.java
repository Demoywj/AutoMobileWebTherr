package model;

/**
 * TProProject entity. @author MyEclipse Persistence Tools
 */

public class TProProject implements java.io.Serializable {

	// Fields

	private Integer projectid;
	private String projectname;
	private String remark;

	// Constructors

	/** default constructor */
	public TProProject() {
	}

	/** full constructor */
	public TProProject(String projectname, String remark) {
		this.projectname = projectname;
		this.remark = remark;
	}

	// Property accessors

	public Integer getProjectid() {
		return this.projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	public String getProjectname() {
		return this.projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}