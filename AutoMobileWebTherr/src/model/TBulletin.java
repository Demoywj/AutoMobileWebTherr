package model;

import java.util.Date;

/**
 * TBulletinId entity. @author MyEclipse Persistence Tools
 */

public class TBulletin implements java.io.Serializable {

	// Fields

	private Integer id;
	private String editorialContent;
	private String contentGet;
	private String title;
	private String time;

	// Constructors

	/** default constructor */
	public TBulletin() {
	}

	/** full constructor */
	public TBulletin(Integer id, String editorialContent, String contentGet, String title, String time) {
		this.id = id;
		this.editorialContent = editorialContent;
		this.contentGet = contentGet;
		this.title = title;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEditorialContent() {
		return this.editorialContent;
	}

	public void setEditorialContent(String editorialContent) {
		this.editorialContent = editorialContent;
	}

	public String getContentGet() {
		return this.contentGet;
	}

	public void setContentGet(String contentGet) {
		this.contentGet = contentGet;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TBulletin))
			return false;
		TBulletin castOther = (TBulletin) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getEditorialContent() == castOther.getEditorialContent())
						|| (this.getEditorialContent() != null && castOther.getEditorialContent() != null
								&& this.getEditorialContent().equals(castOther.getEditorialContent())))
				&& ((this.getContentGet() == castOther.getContentGet()) || (this.getContentGet() != null
						&& castOther.getContentGet() != null && this.getContentGet().equals(castOther.getContentGet())))
				&& ((this.getTitle() == castOther.getTitle()) || (this.getTitle() != null
						&& castOther.getTitle() != null && this.getTitle().equals(castOther.getTitle())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null && castOther.getTime() != null
						&& this.getTime().equals(castOther.getTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getEditorialContent() == null ? 0 : this.getEditorialContent().hashCode());
		result = 37 * result + (getContentGet() == null ? 0 : this.getContentGet().hashCode());
		result = 37 * result + (getTitle() == null ? 0 : this.getTitle().hashCode());
		result = 37 * result + (getTime() == null ? 0 : this.getTime().hashCode());
		return result;
	}

}