package petstoreproject.petstoreapp;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springbeans.xml","customerconfig.xml"});
        /*PetStore store = (PetStore) context.getBean("petStore",PetStore.class);
        System.out.println(store.getStoreName());
        System.out.println(store.getAddress());
        System.out.println("-----------------------------------------------------------------------");
        
        Customer customer = context.getBean("ncustomer",Customer.class);
        System.out.println(customer.getCustName());
        System.out.println(customer.getCustAddress());
        System.out.println(customer.getPhoneno());
        System.out.println("-----------------------------------------------------------------------");
    
        Pet pet=context.getBean("pet",Pet.class);
        System.out.println(pet.getPetName());
        System.out.println(pet.getAge());
        System.out.println(pet.getGender());
        System.out.println("-----------------------------------------------------------------------");
        
        PetServiceReference pservice=context.getBean("petservice",PetServiceReference.class);
        System.out.println(pservice.getpStore().getStoreName());
        System.out.println(pservice.getpStore().getAddress());
        System.out.println("-----------------------------------------------------------------------");
        
        PetHelpLineService petservice = context.getBean("pethelpline",PetHelpLineService.class);
        System.out.println(petservice.getPethelplineNumber());
        System.out.println("-----------------------------------------------------------------------");
        
        PetFood petfood =context.getBean("petfood",PetFood.class);
        System.out.println(petfood.getFoodtype());
        System.out.println(petfood.getCalories());
        System.out.println(petfood.getQuantity());
        System.out.println("-----------------------------------------------------------------------");
    
        CustomerService cservice = context.getBean("customerservice",CustomerService.class);
        System.out.println(cservice.getServiceHelplineNumber());
        System.out.println(cservice.getCouncellorName());
        
        List<Pet> petList = pservice.getpStore().getPetList();
        for(Pet pets:petList) {
        	 System.out.println("-----------------------------------------------------------------------");
        	 System.out.println(pets.getPetName());
        	 System.out.println(pets.getAge());
        	 System.out.println(pets.getGender());
        }
        */
        PetServiceReference pservice=context.getBean("petservice",PetServiceReference.class);
        List<RescueChamp> rescuechamp=pservice.getRescuechamp();
        for(RescueChamp r: rescuechamp) {
        	System.out.println("-----------------------------------------------------------------------");
        	System.out.println(r.getChampName());
        	System.out.println(r.getAnimalsRescued());
        }
        Customer customer = context.getBean("ncustomer",Customer.class);
        System.out.println(customer.getCustName());
        System.out.println(customer.getCustAddress());
        System.out.println(customer.getPhoneno());
    }
}
