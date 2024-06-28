package studyopedia;

public class IdentifiesDemo {

	public static void main(String[] args) {
		// Invalid variable declaration
		 int for =13;  //error because kayword cnnot be identifier
		int num 1=12; // error cause of space
	  int @num3=13; // error cause identifier cannot start with spcial symbol
	  
 //valid variable declration
	  
	  int $num1=13;
	  System.out.println("values of no.variable is"+$num1);
	  String studentName="rakhee";
	  System.out.println("the value is :"+studentName); 
	  
	  //assining single character literal
	  
	  char ch='a';
	  System.out.println(ch);
	  //assigning num to char
	  char ch1=65;
	  System.out.println(ch1);
	  //assigning unicode to char
	  char var1='\u00A7';
	  System.out.println(var1);
	  //unicode representation
	  char v2='\u20AC';
	  System.out.println(v2);
	  
	  
	}

}
