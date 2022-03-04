package petstoreproject.petstoreapp;

public class Customer {
	private String custName;
	private String custAddress;
	private String phoneno;
	
	public Customer() {
		
	}

	public Customer(String custName, String custAddress, String phoneno) {
		super();
		this.custName = custName;
		this.custAddress = custAddress;
		this.phoneno = phoneno;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
}
