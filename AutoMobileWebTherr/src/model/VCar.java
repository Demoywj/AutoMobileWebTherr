package model;



/**
 * VCar entity. @author MyEclipse Persistence Tools
 */

public class VCar implements java.io.Serializable {

	// Fields

		private Integer carid;
		private String realname;
		private String userphone;
		private String gender;
		private String carnum;
		private String userid;
		private Double mileage;
		private String purchasedate;
		private String carphoto;
		private String brandname;
		private String typename;
		private String configname;
		private String remark;

		// Constructors

		/** default constructor */
		public VCar() {
		}

		/** minimal constructor */
		public VCar(Integer carid) {
			this.carid = carid;
		}

		/** full constructor */
		public VCar(Integer carid, String realname, String userphone, String gender, String carnum, String userid,
				Double mileage, String purchasedate, String carphoto, String brandname, String typename,
				String configname, String remark) {
			this.carid = carid;
			this.realname = realname;
			this.userphone = userphone;
			this.gender = gender;
			this.carnum = carnum;
			this.userid = userid;
			this.mileage = mileage;
			this.purchasedate = purchasedate;
			this.carphoto = carphoto;
			this.brandname = brandname;
			this.typename = typename;
			this.configname = configname;
			this.remark = remark;
		}

		// Property accessors

		public Integer getCarid() {
			return this.carid;
		}

		public void setCarid(Integer carid) {
			this.carid = carid;
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

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCarnum() {
			return this.carnum;
		}

		public void setCarnum(String carnum) {
			this.carnum = carnum;
		}

		public String getUserid() {
			return this.userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public Double getMileage() {
			return this.mileage;
		}

		public void setMileage(Double mileage) {
			this.mileage = mileage;
		}

		public String getPurchasedate() {
			return this.purchasedate;
		}

		public void setPurchasedate(String purchasedate) {
			this.purchasedate = purchasedate;
		}

		public String getCarphoto() {
			return this.carphoto;
		}

		public void setCarphoto(String carphoto) {
			this.carphoto = carphoto;
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

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

}