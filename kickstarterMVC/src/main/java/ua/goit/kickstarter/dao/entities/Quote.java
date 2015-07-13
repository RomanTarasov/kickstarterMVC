package ua.goit.kickstarter.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Table;


@Entity
@Table(appliesTo = "quotes")
public class Quote {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "text")
	private String text;
	
	@Column(name = "author")
	private String author;

	public Quote() {
	
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}