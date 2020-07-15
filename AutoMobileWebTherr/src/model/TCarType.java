package model;

/**
 * TCarType entity. @author MyEclipse Persistence Tools
 */

public class TCarType implements java.io.Serializable {

	// Fields

	private Integer typeid;
	private Integer brandid;
	private String typename;
	private String remark;

	// Constructors

	/** default constructor */
	public TCarType() {
	}

	/** full constructor */
	public TCarType(Integer brandid, String typename, String remark) {
		this.brandid = brandid;
		this.typename = typename;
		this.remark = remark;
	}

	// Property accessors

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public Integer getBrandid() {
		return this.brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}