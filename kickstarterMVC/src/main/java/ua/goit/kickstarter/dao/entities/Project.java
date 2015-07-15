package ua.goit.kickstarter.dao.entities;

public class Project {

	private Long id;
	private Long categoryId;
	private String name;
	private String description;
	private String shortDescription;
	private String history;
	private Double goal;
	private Double pledged;
	private Integer theEndDay;
	private String link;
	private Integer status;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public double getGoal() {
		return goal;
	}

	public void setGoal(Double goal) {
		this.goal = goal;
	}

	public double getPledged() {
		return pledged;
	}

	public void setPledged(Double pledged) {
		this.pledged = pledged;
	}

	public int getTheEndDay() {
		return theEndDay;
	}

	public void setTheEndDay(Integer theEndDay) {
		this.theEndDay = theEndDay;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
