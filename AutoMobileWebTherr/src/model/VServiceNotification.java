package model;


/**
 * VServiceNotification entity. @author MyEclipse Persistence Tools
 */

public class VServiceNotification implements java.io.Serializable {

	// Fields


	private Integer serviceid;
	private Integer repmaiid;
	private String servicecontent;
	private String servicetime;
	private String userid;
	private String realname;
	private Double carmileage;
	private String brandname;
	private String typename;
	private String configname;
	private String carnum;
	private String repmainordertime;

	// Constructors

	/** default constructor */
	public VServiceNotification() {
	}

	/** minimal constructor */
	public VServiceNotification(Integer serviceid, String servicetime) {
		this.serviceid = serviceid;
		this.servicetime = servicetime;
	}

	/** full constructor */
	public VServiceNotification(Integer serviceid, Integer repmaiid, String servicecontent, String servicetime,
			String userid, String realname, Double carmileage, String brandname, String typename, String configname,
			String carnum, String repmainordertime) {
		this.serviceid = serviceid;
		this.repmaiid = repmaiid;
		this.servicecontent = servicecontent;
		this.servicetime = servicetime;
		this.userid = userid;
		this.realname = realname;
		this.carmileage = carmileage;
		this.brandname = brandname;
		this.typename = typename;
		this.configname = configname;
		this.carnum = carnum;
		this.repmainordertime = repmainordertime;
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

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Double getCarmileage() {
		return this.carmileage;
	}

	public void setCarmileage(Double carmileage) {
		this.carmileage = carmileage;
	}

	public String getBrandname() {
		return this.brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getConfigname() {
		return this.configname;
	}

	public void setConfigname(String configname) {
		this.configname = configname;
	}

	public String getCarnum() {
		return this.carnum;
	}

	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}

	public String getRepmainordertime() {
		return this.repmainordertime;
	}

	public void setRepmainordertime(String repmainordertime) {
		this.repmainordertime = repmainordertime;
	}
}