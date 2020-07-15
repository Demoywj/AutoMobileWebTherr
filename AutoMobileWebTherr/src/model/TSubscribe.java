package model;



/**
 * TSubscribe entity. @author MyEclipse Persistence Tools
 */

public class TSubscribe implements java.io.Serializable {

	// Fields

	private Integer subscribeid;
	private String userid;
	private Integer carid;
	private String subscribetime;
	private String subscribestate;
	private Double mileage;
	private String reply;
	private Double subprice;
	private String remark;

	// Constructors

	/** default constructor */
	public TSubscribe() {
	}

	/** full constructor */
	public TSubscribe(String userid, Integer carid, String subscribetime, String subscribestate, Double mileage,
			String reply, Double subprice, String remark) {
		this.userid = userid;
		this.carid = carid;
		this.subscribetime = subscribetime;
		this.subscribestate = subscribestate;
		this.mileage = mileage;
		this.reply = reply;
		this.subprice = subprice;
		this.remark = remark;
	}

	// Property accessors

	public Integer getSubscribeid() {
		return this.subscribeid;
	}

	public void setSubscribeid(Integer subscribeid) {
		this.subscribeid = subscribeid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Integer getCarid() {
		return this.carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

	public String getSubscribetime() {
		return this.subscribetime;
	}

	public void setSubscribetime(String subscribetime) {
		this.subscribetime = subscribetime;
	}

	public String getSubscribestate() {
		return this.subscribestate;
	}

	public void setSubscribestate(String subscribestate) {
		this.subscribestate = subscribestate;
	}

	public Double getMileage() {
		return this.mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	public String getReply() {
		return this.reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public Double getSubprice() {
		return this.subprice;
	}

	public void setSubprice(Double subprice) {
		this.subprice = subprice;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}