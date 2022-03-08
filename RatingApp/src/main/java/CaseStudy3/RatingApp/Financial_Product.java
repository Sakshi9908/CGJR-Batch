package CaseStudy3.RatingApp;

public class Financial_Product {
	private int financial_productid;
	private String financial_productname;
	private String description;
	private int rating;
	private Review review;
	
	public Financial_Product() {
		super();
	}

	public Financial_Product(Review review) {
		super();
		this.review = review;
	}

	public int getFinancial_productid() {
		return financial_productid;
	}

	public void setFinancial_productid(int financial_productid) {
		this.financial_productid = financial_productid;
	}

	public String getFinancial_productname() {
		return financial_productname;
	}

	public void setFinancial_productname(String financial_productname) {
		this.financial_productname = financial_productname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	
}
