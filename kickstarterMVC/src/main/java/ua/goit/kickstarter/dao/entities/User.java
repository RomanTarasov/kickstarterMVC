package ua.goit.kickstarter.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	User() {
	}

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
}
