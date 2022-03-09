package CaseStudy3.RatingApp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
    	
    	User user = context.getBean("user",User.class);
    	System.out.println("User-Name       : " +user.getUsername());
    	System.out.println("Email Id        : "+user.getEmailid());
    	System.out.println("Password        : "+user.getPassword());
    	System.out.println("Mobile Number   : "+user.getMobileno());
    	System.out.println("=================================================================================");
    	
    	Financial_Product fp = context.getBean("financialproduct",Financial_Product.class);
    	System.out.println("Product Id      : " +fp.getFinancial_productid());
    	System.out.println("Product Name    : "+fp.getFinancial_productname());
    	System.out.println("Description     : "+fp.getDescription());
    	System.out.println("Rating          : "+fp.getRating());
    	System.out.println("------------------------------------ REVIEW ------------------------------------");
    	System.out.println("Review Id       : "+fp.getReview().getReviewid());
    	System.out.println("Product Reviewed: " +fp.getReview().getProduct_reviewed().getFinancial_productname());
    	System.out.println("Review Text     : "+fp.getReview().getReview_text());
    	List<Comment> comments = fp.getReview().getComments();
    	System.out.println("----------------------------------- COMMENTS ------------------------------------");
    	for(Comment c:comments) {
    		System.out.println("Comment Id  : "+c.getComment_id());
    		System.out.println("Comment Text: "+c.getComment_text());
    		System.out.println("Likes       : "+c.getLikes());
    		System.out.println("Dislikes    : "+c.getDislikes());
    		System.out.println("Report      : "+c.isReport());
    		System.out.println("-----------------------------------------------------------------------------");
    	}
    	System.out.println("=================================================================================");
    }
}
