/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GradleSpringDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    
    public static void main(String[] args)
    {
         ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"springbeans.xml","PetStore.xml"});
         /*Person person=(Person) context.getBean("person");
         System.out.println(person.getPersonName());*/
         //ApplicationContext context1 = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
         
         
         System.out.println("==================================================================");
         
         Account account= context.getBean("account",Account.class);
         System.out.println(account.getAccountName());
         System.out.println(account.getPerson().getPersonName());
         System.out.println("==================================================================");
         
         Payment payment = context.getBean("payment",Payment.class);
         System.out.println(payment.getAmount());
         System.out.println(payment.getPhoneno());
         System.out.println(payment.getPerson().getPersonName());
         
         ((AbstractApplicationContext) context).registerShutdownHook();
         System.out.println("==================================================================");
         
         AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
         con.scan("GradleSpringDemo");
         con.refresh();
         Person person=context.getBean("person",Person.class);
         System.out.println(person.getPersonName());
         System.out.println("==================================================================");
         
         
    }
}
