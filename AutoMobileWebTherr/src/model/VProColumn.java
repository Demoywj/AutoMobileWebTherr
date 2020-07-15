package model;

/**
 * VProColumn entity. @author MyEclipse Persistence Tools
 */

public class VProColumn implements java.io.Serializable {

	// Fields

		private Integer procolumnid;
		private Integer projectid;
		private String procolumnname;
		private String procolumnpicture;
		private String projectname;

		// Constructors

		/** default constructor */
		public VProColumn() {
		}

		/** minimal constructor */
		public VProColumn(Integer procolumnid) {
			this.procolumnid = procolumnid;
		}

		/** full constructor */
		public VProColumn(Integer procolumnid, Integer projectid, String procolumnname, String procolumnpicture,
				String projectname) {
			this.procolumnid = procolumnid;
			this.projectid = projectid;
			this.procolumnname = procolumnname;
			this.procolumnpicture = procolumnpicture;
			this.projectname = projectname;
		}

		// Property accessors

		public Integer getProcolumnid() {
			return this.procolumnid;
		}

		public void setProcolumnid(Integer procolumnid) {
			this.procolumnid = procolumnid;
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