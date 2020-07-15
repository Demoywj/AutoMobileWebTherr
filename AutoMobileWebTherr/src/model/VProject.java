package model;

/**
 * VProject entity. @author MyEclipse Persistence Tools
 */

public class VProject implements java.io.Serializable {

	// Fields

		private Integer procontentid;
		private Integer procolumnid;
		private String procontentname;
		private Double proprice;
		private Double prohour;
		private Double pronumprice;
		private Integer projectid;
		private String procolumnname;
		private String procolumnpicture;
		private String projectname;

		// Constructors

		/** default constructor */
		public VProject() {
		}

		/** minimal constructor */
		public VProject(Integer procontentid) {
			this.procontentid = procontentid;
		}

		/** full constructor */
		public VProject(Integer procontentid, Integer procolumnid, String procontentname, Double proprice, Double prohour,
				Double pronumprice, Integer projectid, String procolumnname, String procolumnpicture, String projectname) {
			this.procontentid = procontentid;
			this.procolumnid = procolumnid;
			this.procontentname = procontentname;
			this.proprice = proprice;
			this.prohour = prohour;
			this.pronumprice = pronumprice;
			this.projectid = projectid;
			this.procolumnname = procolumnname;
			this.procolumnpicture = procolumnpicture;
			this.projectname = projectname;
		}

		// Property accessors

		public Integer getProcontentid() {
			return this.procontentid;
		}

		public void setProcontentid(Integer procontentid) {
			this.procontentid = procontentid;
		}

		public Integer getProcolumnid() {
			return this.procolumnid;
		}

		public void setProcolumnid(Integer procolumnid) {
			this.procolumnid = procolumnid;
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

		public Integer getProjectid() {
			return this.projectid;
		}

		public void setProjectid(Integer projectid) {
			this.projectid = projectid;
		}

		public String getProcolumnname() {
			return this.procolumnname;
		}

		public void setProcolumnname(String procolumnname) {
			this.procolumnname = procolumnname;
		}

		public String getProcolumnpicture() {
			return this.procolumnpicture;
		}

		public void setProcolumnpicture(String procolumnpicture) {
			this.procolumnpicture = procolumnpicture;
		}

		public String getProjectname() {
			return this.projectname;
		}

		public void setProjectname(String projectname) {
			this.projectname = projectname;
		}
}