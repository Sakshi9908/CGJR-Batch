package GradleSpringDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import GradleSpringDemo.PetServiceReference;
import GradleSpringDemo.RescueChamp;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springbeans.xml","PetStore.xml"});
		
		Pet pet=context.getBean("pet",Pet.class);
        System.out.println(pet.getPetName());
        System.out.println(pet.getAge());
        System.out.println(pet.getGender());
        System.out.println("==================================================================");
        
        PetHelpLineService petservice = context.getBean("pethelpline",PetHelpLineService.class);
        System.out.println(petservice.getPethelplineNumber());
        System.out.println("==================================================================");
        
        PetServiceReference pservice=context.getBean("petservice",PetServiceReference.class);
        System.out.println(pservice.getpStore().getStoreName());
        System.out.println(pservice.getpStore().getAddress());
        System.out.println("==================================================================");
        
		PetStore store = (PetStore) context.getBean("petStore",PetStore.class);
        System.out.println(store.getStoreName());
        System.out.println(store.getAddress());
        System.out.println("==================================================================");
        
        PetServiceReference pservice1=context.getBean("petservice",PetServiceReference.class);
        List<RescueChamp> rescuechamp=pservice1.getRescuechamp();
        for(RescueChamp r: rescuechamp) {
        	System.out.println("==================================================================");
        	System.out.println(r.getChampName());
        	System.out.println(r.getAnimalsRescued());
        }
	}

}
