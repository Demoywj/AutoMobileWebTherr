package model;

/**
 * TProColumn entity. @author MyEclipse Persistence Tools
 */

public class TProColumn implements java.io.Serializable {

	// Fields

	private Integer procolumnid;
	private Integer projectid;
	private String procolumnname;
	private String procolumnpicture;
	private String remark;

	// Constructors

	/** default constructor */
	public TProColumn() {
	}

	/** full constructor */
	public TProColumn(Integer projectid, String procolumnname, String procolumnpicture, String remark) {
		this.projectid = projectid;
		this.procolumnname = procolumnname;
		this.procolumnpicture = procolumnpicture;
		this.remark = remark;
	}

	// Property accessors

	public Integer getProcolumnid() {
		return this.procolumnid;
	}

	public void setProcolumnid(Integer procolumnid) {
		this.procolumnid = procolumnid;
	}

	public Integer getProjectid() {
		return this.projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	public String getProcolumnname() {
		return this.procolumnname;
	}

	public void setProcolumnname(String procolumnname) {
		this.procolumnname = procolumnname;
	}

	public String getProcolumnpicture() {
		return this.procolumnpicture;
	}

	public void setProcolumnpicture(String procolumnpicture) {
		this.procolumnpicture = procolumnpicture;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}