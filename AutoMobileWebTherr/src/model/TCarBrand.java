package model;

/**
 * TCarBrand entity. @author MyEclipse Persistence Tools
 */

public class TCarBrand implements java.io.Serializable {

	// Fields

	private Integer brandid;
	private String brandname;
	private String brandpicture;
	private String remark;

	// Constructors

	/** default constructor */
	public TCarBrand() {
	}

	/** full constructor */
	public TCarBrand(String brandname, String brandpicture, String remark) {
		this.brandname = brandname;
		this.brandpicture = brandpicture;
		this.remark = remark;
	}

	// Property accessors

	public Integer getBrandid() {
		return this.brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

	public String getBrandname() {
		return this.brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getBrandpicture() {
		return this.brandpicture;
	}

	public void setBrandpicture(String brandpicture) {
		this.brandpicture = brandpicture;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}