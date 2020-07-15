package model;



/**
 * VRepmaiOrder entity. @author MyEclipse Persistence Tools
 */

public class VRepmaiOrder implements java.io.Serializable {

	// Fields

		private Integer repmaiid;
		private String userid;
		private Integer carid;
		private String repmainordertime;
		private Double carmileage;
		private Double inventoryprice;
		private Integer count;
		private String projectname;
		private String procolumnname;
		private String procontentname;
		private Double proprice;
		private Double prohour;
		private Double pronumprice;
		private Double discount;
		private Integer number;
		private Double mileage;
		private String purchasedate;
		private String carphoto;
		private String brandname;
		private String typename;
		private String configname;
		private String carnum;
		private String username;
		private String userphone;
		private Integer inventoryid;
		private String remark;
		private String adiminid;
		private String realname;

		// Constructors

		/** default constructor */
		public VRepmaiOrder() {
		}

		/** minimal constructor */
		public VRepmaiOrder(Integer repmaiid, Integer inventoryid, String realname) {
			this.repmaiid = repmaiid;
			this.inventoryid = inventoryid;
			this.realname = realname;
		}

		/** full constructor */
		public VRepmaiOrder(Integer repmaiid, String userid, Integer carid, String repmainordertime, Double carmileage,
				Double inventoryprice, Integer count, String projectname, String procolumnname, String procontentname,
				Double proprice, Double prohour, Double pronumprice, Double discount, Integer number, Double mileage,
				String purchasedate, String carphoto, String brandname, String typename, String configname,
				String carnum, String username, String userphone, Integer inventoryid, String remark, String adiminid,
				String realname) {
			this.repmaiid = repmaiid;
			this.userid = userid;
			this.carid = carid;
			this.repmainordertime = repmainordertime;
			this.carmileage = carmileage;
			this.inventoryprice = inventoryprice;
			this.count = count;
			this.projectname = projectname;
			this.procolumnname = procolumnname;
			this.procontentname = procontentname;
			this.proprice = proprice;
			this.prohour = prohour;
			this.pronumprice = pronumprice;
			this.discount = discount;
			this.number = number;
			this.mileage = mileage;
			this.purchasedate = purchasedate;
			this.carphoto = carphoto;
			this.brandname = brandname;
			this.typename = typename;
			this.configname = configname;
			this.carnum = carnum;
			this.username = username;
			this.userphone = userphone;
			this.inventoryid = inventoryid;
			this.remark = remark;
			this.adiminid = adiminid;
			this.realname = realname;
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

		public Double getDiscount() {
			return this.discount;
		}

		public void setDiscount(Double discount) {
			this.discount = discount;
		}

		public Integer getNumber() {
			return this.number;
		}

		public void setNumber(Integer number) {
			this.number = number;
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

		public String getCarnum() {
			return this.carnum;
		}

		public void setCarnum(String carnum) {
			this.carnum = carnum;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getUserphone() {
			return this.userphone;
		}

		public void setUserphone(String userphone) {
			this.userphone = userphone;
		}

		public Integer getInventoryid() {
			return this.inventoryid;
		}

		public void setInventoryid(Integer inventoryid) {
			this.inventoryid = inventoryid;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getAdiminid() {
			return this.adiminid;
		}

		public void setAdiminid(String adiminid) {
			this.adiminid = adiminid;
		}

		public String getRealname() {
			return this.realname;
		}

		public void setRealname(String realname) {
			this.realname = realname;
		}


}