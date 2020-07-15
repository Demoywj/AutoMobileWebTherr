package model;

/**
 * TSubscribeContent entity. @author MyEclipse Persistence Tools
 */

public class TSubscribeContent implements java.io.Serializable {

	// Fields

	private Integer subid;
	private Integer subscribeid;
	private String projectname;
	private String procolumnname;
	private String procontentname;
	private Double proprice;
	private Double pronumprice;
	private Integer number;
	private String remark;

	// Constructors

	/** default constructor */
	public TSubscribeContent() {
	}

	/** full constructor */
	public TSubscribeContent(Integer subscribeid, String projectname, String procolumnname, String procontentname,
			Double proprice, Double pronumprice, Integer number, String remark) {
		this.subscribeid = subscribeid;
		this.projectname = projectname;
		this.procolumnname = procolumnname;
		this.procontentname = procontentname;
		this.proprice = proprice;
		this.pronumprice = pronumprice;
		this.number = number;
		this.remark = remark;
	}

	// Property accessors

	public Integer getSubid() {
		return this.subid;
	}

	public void setSubid(Integer subid) {
		this.subid = subid;
	}

	public Integer getSubscribeid() {
		return this.subscribeid;
	}

	public void setSubscribeid(Integer subscribeid) {
		this.subscribeid = subscribeid;
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

	public Double getPronumprice() {
		return this.pronumprice;
	}

	public void setPronumprice(Double pronumprice) {
		this.pronumprice = pronumprice;
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