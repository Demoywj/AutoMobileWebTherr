package model;

/**
 * TPartifo entity. @author MyEclipse Persistence Tools
 */

public class TPartifo implements java.io.Serializable {

	// Fields

	private Integer partid;
	private Integer configid;
	private String partname;
	private String specification;
	private Double partprice;
	private String partphoto;
	private String remark;

	// Constructors

	/** default constructor */
	public TPartifo() {
	}

	/** full constructor */
	public TPartifo(Integer configid, String partname, String specification, Double partprice, String partphoto,
			String remark) {
		this.configid = configid;
		this.partname = partname;
		this.specification = specification;
		this.partprice = partprice;
		this.partphoto = partphoto;
		this.remark = remark;
	}

	// Property accessors

	public Integer getPartid() {
		return this.partid;
	}

	public void setPartid(Integer partid) {
		this.partid = partid;
	}

	public Integer getConfigid() {
		return this.configid;
	}

	public void setConfigid(Integer configid) {
		this.configid = configid;
	}

	public String getPartname() {
		return this.partname;
	}

	public void setPartname(String partname) {
		this.partname = partname;
	}

	public String getSpecification() {
		return this.specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public Double getPartprice() {
		return this.partprice;
	}

	public void setPartprice(Double partprice) {
		this.partprice = partprice;
	}

	public String getPartphoto() {
		return this.partphoto;
	}

	public void setPartphoto(String partphoto) {
		this.partphoto = partphoto;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}