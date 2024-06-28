package studyopedia;

public class Foreachloop {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		//foreach loop is used  to separate array element to normal format
		for(int i:a) {
             System.out.println(i);
		}
		char ch[]= {'a','b','c','d'};
		for(char c:ch) {
			 System.out.println(c);
		}
		String s1[]= {"java","programming","learning"};
		for(String s:s1) {
			 System.out.println(s);
		}
	}

}
