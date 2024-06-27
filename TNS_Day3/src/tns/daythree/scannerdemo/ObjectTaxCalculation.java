package tns.daythree.scanner;
import java.util.Scanner;
public class personDemo {

	public static void main(String[] args) {
	//scanner object to accept user inputs
        Scanner ob=new Scanner(System.in);
        String name;
        System.out.println("Enter person name");
        name=ob.next();
        System.out.println("Enter age:");
        int age=ob.nextInt();
        System.out.println("Enter gender:");
        String gender=ob.next();
        System.out.println("Enter Income:");
        int income=ob.nextInt();
        
        //person object and initialize values using setter
        Person person=new Person();
        person.setName(name);
        person.setGender(gender);
        person.setAge(age);
        person.setIncome(income);
        
        //display person details using toString()method 
        System.out.println(person);
        TaxCalculation cal=new TaxCalculation();
        cal.calculateTax(person);
        System.out.println("After Calculation tax:");
        System.out.println(person);
        
	}
        
	}
	




