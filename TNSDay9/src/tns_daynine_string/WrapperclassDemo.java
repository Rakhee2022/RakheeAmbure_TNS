package tns_daynine_string;

public class WrapperclassDemo {

	public static void main(String[] args) {
		//unboxing(unwrap) wrapper class
		
		Integer i=new Integer(10);
		System.out.println(i);
		
		int b=i.intValue();
		System.out.println(b);
		
		//without using intvalue()
		int c=i;
		System.out.println(c);
		
     // Autoboxing 
		
		int a=100;
		Integer i1=a;
		System.out.println(i1);
		
		
		
		
		
		
	}

}
