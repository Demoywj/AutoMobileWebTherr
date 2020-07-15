package model;

/**
 * VVehice entity. @author MyEclipse Persistence Tools
 */

public class VVehice implements java.io.Serializable {

	// Fields

		private Integer partid;
		private String partname;
		private String specification;
		private Double partprice;
		private String partphoto;
		private Integer configid;
		private String configname;
		private Integer typeid;
		private String typename;
		private Integer brandid;
		private String brandname;
		private String brandpicture;
		private Integer expr1;

		// Constructors

		/** default constructor */
		public VVehice() {
		}

		/** minimal constructor */
		public VVehice(Integer partid, Integer configid, Integer typeid, Integer brandid) {
			this.partid = partid;
			this.configid = configid;
			this.typeid = typeid;
			this.brandid = brandid;
		}

		/** full constructor */
		public VVehice(Integer partid, String partname, String specification, Double partprice, String partphoto,
				Integer configid, String configname, Integer typeid, String typename, Integer brandid, String brandname,
				String brandpicture, Integer expr1) {
			this.partid = partid;
			this.partname = partname;
			this.specification = specification;
			this.partprice = partprice;
			this.partphoto = partphoto;
			this.configid = configid;
			this.configname = configname;
			this.typeid = typeid;
			this.typename = typename;
			this.brandid = brandid;
			this.brandname = brandname;
			this.brandpicture = brandpicture;
			this.expr1 = expr1;
		}

		// Property accessors

		public Integer getPartid() {
			return this.partid;
		}

		public void setPartid(Integer partid) {
			this.partid = partid;
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

		public Integer getConfigid() {
			return this.configid;
		}

		public void setConfigid(Integer configid) {
			this.configid = configid;
		}

		public String getConfigname() {
			return this.configname;
		}

		public void setConfigname(String configname) {
			this.configname = configname;
		}

		public Integer getTypeid() {
			return this.typeid;
		}

		public void setTypeid(Integer typeid) {
			this.typeid = typeid;
		}

		public String getTypename() {
			return this.typename;
		}

		public void setTypename(String typename) {
			this.typename = typename;
		}

		public Integer getBrandid() {
			return this.brandid;
		}

		public void setBrandid(Integer brandid) {
			this.brandid = brandid;
		}

		public String getBrandname() {
			return this.brandname;
		}

		public void setBrandname(String brandname) {
			this.brandname = brandname;
		}

		public String getBrandpicture() {
			return this.brandpicture;
		}

		public void setBrandpicture(String brandpicture) {
			this.brandpicture = brandpicture;
		}

		public Integer getExpr1() {
			return this.expr1;
		}

		public void setExpr1(Integer expr1) {
			this.expr1 = expr1;
		}
}