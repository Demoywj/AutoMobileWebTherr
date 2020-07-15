package model;

/**
 * TInventory entity. @author MyEclipse Persistence Tools
 */

public class TInventory implements java.io.Serializable {

	// Fields

	private Integer inventoryid;
	private Integer repmaiid;
	private String projectname;
	private String procolumnname;
	private String procontentname;
	private Double proprice;
	private Double prohour;
	private Double pronumprice;
	private Double discount;
	private Integer number;
	private String remark;

	// Constructors

	/** default constructor */
	public TInventory() {
	}

	/** full constructor */
	public TInventory(Integer repmaiid, String projectname, String procolumnname, String procontentname,
			Double proprice, Double prohour, Double pronumprice, Double discount, Integer number, String remark) {
		this.repmaiid = repmaiid;
		this.projectname = projectname;
		this.procolumnname = procolumnname;
		this.procontentname = procontentname;
		this.proprice = proprice;
		this.prohour = prohour;
		this.pronumprice = pronumprice;
		this.discount = discount;
		this.number = number;
		this.remark = remark;
	}

	// Property accessors

	public Integer getInventoryid() {
		return this.inventoryid;
	}

	public void setInventoryid(Integer inventoryid) {
		this.inventoryid = inventoryid;
	}

	public Integer getRepmaiid() {
		return this.repmaiid;
	}

	public void setRepmaiid(Integer repmaiid) {
		this.repmaiid = repmaiid;
	}

	public String getProjectname() {
		return this.projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getProcolumnname() {
		return this.procolumnname;
	}

	public void setProcolumnname(String procolumnname) {
		this.procolumnname = procolumnname;
	}

	public String getProcontentname() {
		return this.procontentname;
	}

	public void setProcontentname(String procontentname) {
		this.procontentname = procontentname;
	}

	public Double getProprice() {
		return this.proprice;
	}

	public void setProprice(Double proprice) {
		this.proprice = proprice;
	}

	public Double getProhour() {
		return this.prohour;
	}

	public void setProhour(Double prohour) {
		this.prohour = prohour;
	}

	public Double getPronumprice() {
		return this.pronumprice;
	}

	public void setPronumprice(Double pronumprice) {
		this.pronumprice = pronumprice;
	}

	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}