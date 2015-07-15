package ua.goit.kickstarter.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {
	public Comment() {
	}

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "text")
	private String text;

	@Column(name = "status")
	private int status;
	
	@Column(name = "project_id")
	private Long projectId;
	
	@Column(name = "user_id")
	private Long userId;

}
