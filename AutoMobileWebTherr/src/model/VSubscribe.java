package model;



/**
 * VSubscribe entity. @author MyEclipse Persistence Tools
 */

public class VSubscribe implements java.io.Serializable {

	// Fields

		private Integer subscribeid;
		private String userid;
		private Integer carid;
		private String subscribetime;
		private Double mileage;
		private String reply;
		private String remark;
		private String realname;
		private String userphone;
		private String carnum;
		private String brandname;
		private String typename;
		private String configname;
		private String subscribestate;
		private Double subprice;

		// Constructors

		/** default constructor */
		public VSubscribe() {
		}

		/** minimal constructor */
		public VSubscribe(Integer subscribeid) {
			this.subscribeid = subscribeid;
		}

		/** full constructor */
		public VSubscribe(Integer subscribeid, String userid, Integer carid, String subscribetime, Double mileage,
				String reply, String remark, String realname, String userphone, String carnum, String brandname,
				String typename, String configname, String subscribestate, Double subprice) {
			this.subscribeid = subscribeid;
			this.userid = userid;
			this.carid = carid;
			this.subscribetime = subscribetime;
			this.mileage = mileage;
			this.reply = reply;
			this.remark = remark;
			this.realname = realname;
			this.userphone = userphone;
			this.carnum = carnum;
			this.brandname = brandname;
			this.typename = typename;
			this.configname = configname;
			this.subscribestate = subscribestate;
			this.subprice = subprice;
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

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getRealname() {
			return this.realname;
		}

		public void setRealname(String realname) {
			this.realname = realname;
		}

		public String getUserphone() {
			return this.userphone;
		}

		public void setUserphone(String userphone) {
			this.userphone = userphone;
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

		public String getSubscribestate() {
			return this.subscribestate;
		}

		public void setSubscribestate(String subscribestate) {
			this.subscribestate = subscribestate;
		}

		public Double getSubprice() {
			return this.subprice;
		}

		public void setSubprice(Double subprice) {
			this.subprice = subprice;
		}

}