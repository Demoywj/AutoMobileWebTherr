package model;



/**
 * TServiceNotification entity. @author MyEclipse Persistence Tools
 */

public class TServiceNotification implements java.io.Serializable {

	// Fields

	private Integer serviceid;
	private Integer repmaiid;
	private String servicecontent;
	private String servicetime;
	private String remark;

	// Constructors

	/** default constructor */
	public TServiceNotification() {
	}

	/** full constructor */
	public TServiceNotification(Integer repmaiid, String servicecontent, String servicetime, String remark) {
		this.repmaiid = repmaiid;
		this.servicecontent = servicecontent;
		this.servicetime = servicetime;
		this.remark = remark;
	}

	// Property accessors

	public Integer getServiceid() {
		return this.serviceid;
	}

	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}

	public Integer getRepmaiid() {
		return this.repmaiid;
	}

	public void setRepmaiid(Integer repmaiid) {
		this.repmaiid = repmaiid;
	}

	public String getServicecontent() {
		return this.servicecontent;
	}

	public void setServicecontent(String servicecontent) {
		this.servicecontent = servicecontent;
	}

	public String getServicetime() {
		return this.servicetime;
	}

	public void setServicetime(String servicetime) {
		this.servicetime = servicetime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}