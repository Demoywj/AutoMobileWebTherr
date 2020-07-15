package model;

/**
 * TCarConfig entity. @author MyEclipse Persistence Tools
 */

public class TCarConfig implements java.io.Serializable {

	// Fields

	private Integer configid;
	private Integer typeid;
	private String configname;
	private String remark;

	// Constructors

	/** default constructor */
	public TCarConfig() {
	}

	/** full constructor */
	public TCarConfig(Integer typeid, String configname, String remark) {
		this.typeid = typeid;
		this.configname = configname;
		this.remark = remark;
	}

	// Property accessors

	public Integer getConfigid() {
		return this.configid;
	}

	public void setConfigid(Integer configid) {
		this.configid = configid;
	}

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getConfigname() {
		return this.configname;
	}

	public void setConfigname(String configname) {
		this.configname = configname;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}