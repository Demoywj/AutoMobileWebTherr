package model;

/**
 * VCarType entity. @author MyEclipse Persistence Tools
 */

public class VCarType implements java.io.Serializable {

	// Fields

		private Integer typeid;
		private Integer brandid;
		private String typename;
		private String brandname;
		private String brandpicture;

		// Constructors

		/** default constructor */
		public VCarType() {
		}

		/** minimal constructor */
		public VCarType(Integer typeid) {
			this.typeid = typeid;
		}

		/** full constructor */
		public VCarType(Integer typeid, Integer brandid, String typename, String brandname, String brandpicture) {
			this.typeid = typeid;
			this.brandid = brandid;
			this.typename = typename;
			this.brandname = brandname;
			this.brandpicture = brandpicture;
		}

		// Property accessors

		public Integer getTypeid() {
			return this.typeid;
		}

		public void setTypeid(Integer typeid) {
			this.typeid = typeid;
		}

		public Integer getBrandid() {
			return this.brandid;
		}

		public void setBrandid(Integer brandid) {
			this.brandid = brandid;
		}

		public String getTypename() {
			return this.typename;
		}

		public void setTypename(String typename) {
			this.typename = typename;
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

}