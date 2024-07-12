package tns_daynine_string;

public class StringCompariosn {

	public static void main(String[] args) {
		//creating string using literals //pool memory
		String s1="TNSIF";
		String s2="TNSIF";
		
		//create new string operator //heap memory
		String s3=new String("TNSIF");
		String s4=new String("tnsif");
		
		//== : compare object reference vaeriable
		//equals: compare the data  
		
		System.out.println("Case:1"+(s1==s2));//T
		System.out.println("Case:2"+(s1==s3));//F
		System.out.println("Case:3"+(s2.equals(s1)));//T
		System.out.println("Case:4"+(s2.equals(s4)));//T
		System.out.println("Case:5"+(s3==s4));//F
		System.out.println("Case:6"+(s3.equals(s4)));//T
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compareTo s1==TNSIF compare TNSIF
        System.out.println(s1.compareTo("TNSIF"));
        System.out.println(s1.compareToIgnoreCase("tnsif"));
        System.out.println(s1.compareTo(s4));
        
        
        
        
        
	}

}
