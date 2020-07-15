package model;


/**
 * VPoRepmaiOrder entity. @author MyEclipse Persistence Tools
 */

public class VPoRepmaiOrder implements java.io.Serializable {

	private String userid;
	private Integer repmaiid;
	private Integer carid;
	private String repmainordertime;
	private String carnum;
	private String brandname;
	private String typename;
	private String configname;
	private String username;
	private Double carmileage;
	private Double inventoryprice;
	private Integer count;
	private String adminname;
	private String adiminid;
	private String remark;

	// Constructors

	/** default constructor */
	public VPoRepmaiOrder() {
	}

	/** minimal constructor */
	public VPoRepmaiOrder(Integer repmaiid, String adminname) {
		this.repmaiid = repmaiid;
		this.adminname = adminname;
	}

	/** full constructor */
	public VPoRepmaiOrder(String userid, Integer repmaiid, Integer carid, String repmainordertime, String carnum,
			String brandname, String typename, String configname, String username, Double carmileage,
			Double inventoryprice, Integer count, String adminname, String adiminid, String remark) {
		this.userid = userid;
		this.repmaiid = repmaiid;
		this.carid = carid;
		this.repmainordertime = repmainordertime;
		this.carnum = carnum;
		this.brandname = brandname;
		this.typename = typename;
		this.configname = configname;
		this.username = username;
		this.carmileage = carmileage;
		this.inventoryprice = inventoryprice;
		this.count = count;
		this.adminname = adminname;
		this.adiminid = adiminid;
		this.remark = remark;
	}

	// Property accessors

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Integer getRepmaiid() {
		return this.repmaiid;
	}

	public void setRepmaiid(Integer repmaiid) {
		this.repmaiid = repmaiid;
	}

	public Integer getCarid() {
		return this.carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

	public String getRepmainordertime() {
		return this.repmainordertime;
	}

	public void setRepmainordertime(String repmainordertime) {
		this.repmainordertime = repmainordertime;
	}

	public String getCarnum() {
		return this.carnum;
	}

	public void setCarnum(String carnum) {
		this.carnum = carnum;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Double getCarmileage() {
		return this.carmileage;
	}

	public void setCarmileage(Double carmileage) {
		this.carmileage = carmileage;
	}

	public Double getInventoryprice() {
		return this.inventoryprice;
	}

	public void setInventoryprice(Double inventoryprice) {
		this.inventoryprice = inventoryprice;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getAdminname() {
		return this.adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdiminid() {
		return this.adiminid;
	}

	public void setAdiminid(String adiminid) {
		this.adiminid = adiminid;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}