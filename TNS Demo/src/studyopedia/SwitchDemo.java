package studyopedia;

public class SwitchDemo {

	public static void main(String[] args) {
		char x='p';
		switch(x) {
		case'l':
		case'L':
		 System.out.println(x+"is a leader");
		break;
		case'd':
		case'D':
		 System.out.println(x+"is a digital");
		break;
		case'w':
		case'W':
		 System.out.println(x+"is a Woker");
		break;
		case's':
		case'S':
		 System.out.println(x+"is a shubhangi");
		break;
		default:
		
		 System.out.println("you choice wrong letter");
		break;
		}

	}

}
