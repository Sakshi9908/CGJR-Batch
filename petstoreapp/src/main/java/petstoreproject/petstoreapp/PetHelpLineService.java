package petstoreproject.petstoreapp;

public class PetHelpLineService {
	private String pethelplineNumber;
	
	private PetHelpLineService() {
		this.pethelplineNumber="+918479403855";
	}

	public String getPethelplineNumber() {
		return pethelplineNumber;
	}
	
	
	private static PetHelpLineService helpline = new PetHelpLineService();
	
	public static PetHelpLineService petInstance() {
		return helpline;	
	}
	
}
