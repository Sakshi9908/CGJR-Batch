package petstoreproject.petstoreapp;

public class CustomerService {
	private String serviceHelplineNumber;
	private String councellorName;
	public CustomerService() {
		// TODO Auto-generated constructor stub
		this.serviceHelplineNumber="+917885575744";
		this.councellorName="Sakshi Shah";
	}
	public String getServiceHelplineNumber() {
		return serviceHelplineNumber;
	}

	public String getCouncellorName() {
		return councellorName;
	}

	private static CustomerService cservice = new CustomerService();

	public static CustomerService customerInstance() {
		return cservice;	
	}
}
