package model;

/**
 * TProContent entity. @author MyEclipse Persistence Tools
 */

public class TProContent implements java.io.Serializable {

	// Fields

	private Integer procontentid;
	private Integer procolumnid;
	private String procontentname;
	private Double proprice;
	private Double prohour;
	private Double pronumprice;
	private String remark;

	// Constructors

	/** default constructor */
	public TProContent() {
	}

	/** full constructor */
	public TProContent(Integer procolumnid, String procontentname, Double proprice, Double prohour, Double pronumprice,
			String remark) {
		this.procolumnid = procolumnid;
		this.procontentname = procontentname;
		this.proprice = proprice;
		this.prohour = prohour;
		this.pronumprice = pronumprice;
		this.remark = remark;
	}

	// Property accessors

	public Integer getProcontentid() {
		return this.procontentid;
	}

	public void setProcontentid(Integer procontentid) {
		this.procontentid = procontentid;
	}

	public Integer getProcolumnid() {
		return this.procolumnid;
	}

	public void setProcolumnid(Integer procolumnid) {
		this.procolumnid = procolumnid;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}