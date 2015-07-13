package ua.goit.kickstarter.dao.entities;


//@Entity
//@Table(name = "projects")
public class Project {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	@ManyToOne
//	private Category category;

//	@Column(name = "name")
	private String name;

//	@Column(name = "description")
	private String description;

//	@Column(name = "short_description")
	private String shortDescription;

//	@Column(name = "history")
	private String history;

//	@Column(name = "goal")
	private double goal;

//	@Column(name = "pledged")
	private double pledged;

//	@Column(name = "theEndDay")
	private int theEndDay;

//	@Column(name = "link")
	private String link;

//	@Column(name = "invest_options")
	private String[] investmentOptions;

//	@Column(name = "amountsForInvest")
	private Double[] amount;
	
//	@Column(name = "category_id")
	private Long categoryId;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

//	public Category getCategory() {
//		return category;
//	}
//
//	public void setCategory(Category category) {
//		this.category = category;
//	}

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

	public void setGoal(double goal) {
		this.goal = goal;
	}

	public double getPledged() {
		return pledged;
	}

	public void setPledged(double pledged) {
		this.pledged = pledged;
	}

	public int getTheEndDay() {
		return theEndDay;
	}

	public void setTheEndDay(int theEndDay) {
		this.theEndDay = theEndDay;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String[] getInvestmentOptions() {
		return investmentOptions;
	}

	public void setInvestmentOptions(String[] investmentOptions) {
		this.investmentOptions = investmentOptions;
	}

	public Double[] getAmount() {
		return amount;
	}

	public void setAmount(Double[] amount) {
		this.amount = amount;
	}
}
