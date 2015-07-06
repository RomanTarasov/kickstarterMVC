package ua.goit.web.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class HQuote {

	private String quote;
	private int ID;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id")
	public int getID() {
		return ID;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public void setID(int iD) {
		ID = iD;
	}
	@Column(name="quote")
	public String getQuote() {
		return quote;
	}
}