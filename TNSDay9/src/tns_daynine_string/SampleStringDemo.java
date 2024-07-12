package tns_daynine_string;

public class SampleStringDemo {

	public static void main(String[] args) {
		//Initialise string
		char c[]= {'I','N','D','I','A'};
		 String s1=new String(c);
		 System.out.println(s1);
		 String s2=new String (s1);
		 System.out.println(s2);
		 
		 //Concatenetaion to prevent long lines
		 
		 String longstr="This is to show"+"how long senetences"+"can be printed";
		 System.out.println(longstr);

	}

}
