package model;


/**
 * TRepMaiOrder entity. @author MyEclipse Persistence Tools
 */

public class TRepMaiOrder implements java.io.Serializable {

	// Fields

	private Integer repmaiid;
	private String userid;
	private String adiminid;
	private Integer carid;
	private String repmainordertime;
	private Double carmileage;
	private Double inventoryprice;
	private Integer count;
	private String remark;

	// Constructors

	/** default constructor */
	public TRepMaiOrder() {
	}

	/** full constructor */
	public TRepMaiOrder(String userid, String adiminid, Integer carid, String repmainordertime, Double carmileage,
			Double inventoryprice, Integer count, String remark) {
		this.userid = userid;
		this.adiminid = adiminid;
		this.carid = carid;
		this.repmainordertime = repmainordertime;
		this.carmileage = carmileage;
		this.inventoryprice = inventoryprice;
		this.count = count;
		this.remark = remark;
	}

	// Property accessors

	public Integer getRepmaiid() {
		return this.repmaiid;
	}

	public void setRepmaiid(Integer repmaiid) {
		this.repmaiid = repmaiid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAdiminid() {
		return this.adiminid;
	}

	public void setAdiminid(String adiminid) {
		this.adiminid = adiminid;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}