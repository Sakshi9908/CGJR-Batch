package CaseStudy3.RatingApp;

import java.util.List;

public class Review {
	private int reviewid;
	private String product_reviewed;
	private String review_text;
	List<Comment> comments;

	public Review() {
		super();
	}

	public Review(String product_reviewed) {
		super();
		this.product_reviewed = product_reviewed;
	}

	public int getReviewid() {
		return reviewid;
	}

	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}

	public String getProduct_reviewed() {
		return product_reviewed;
	}

	public void setProduct_reviewed(String product_reviewed) {
		this.product_reviewed = product_reviewed;
	}

	public String getReview_text() {
		return review_text;
	}

	public void setReview_text(String review_text) {
		this.review_text = review_text;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
