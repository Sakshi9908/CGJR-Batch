package GradleSpringDemo;
import java.util.*;
public class PetServiceReference {
	private PetStore pStore;
	List<RescueChamp> rescuechamp;
	
	public PetServiceReference(PetStore pStore) {
		super();
		this.pStore = pStore;
	}

	public PetServiceReference() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PetStore getpStore() {
		return pStore;
	}

	public void setpStore(PetStore pStore) {
		this.pStore = pStore;
	}
	
	public List<RescueChamp> getRescuechamp() {
		return rescuechamp;
	}

	public void setRescuechamp(List<RescueChamp> rescuechamp) {
		this.rescuechamp = rescuechamp;
	}
	
}
