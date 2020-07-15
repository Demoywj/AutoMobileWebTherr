package model;

/**
 * VCarConfig entity. @author MyEclipse Persistence Tools
 */

public class VCarConfig implements java.io.Serializable {

	// Fields

		private Integer configid;
		private String configname;
		private Integer typeid;
		private String typename;
		private Integer brandid;
		private String brandname;

		// Constructors

		/** default constructor */
		public VCarConfig() {
		}

		/** minimal constructor */
		public VCarConfig(Integer configid, Integer typeid, Integer brandid) {
			this.configid = configid;
			this.typeid = typeid;
			this.brandid = brandid;
		}

		/** full constructor */
		public VCarConfig(Integer configid, String configname, Integer typeid, String typename, Integer brandid,
				String brandname) {
			this.configid = configid;
			this.configname = configname;
			this.typeid = typeid;
			this.typename = typename;
			this.brandid = brandid;
			this.brandname = brandname;
		}

		// Property accessors

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

}