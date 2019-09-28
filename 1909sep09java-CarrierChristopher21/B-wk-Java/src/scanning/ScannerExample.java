package scanning;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
//		System.out.println("how many mista?");
//		int x = s.nextInt();
//		System.out.println("you wanted "+x+" many things");
//		String stringy = s.next();
//		stringy=stringy.concat(s.next());
//		System.out.println("you put in "+stringy);
		try {
			mainMenu();
			
		} catch(Exception e) {
			mainMenu();
		}
	}
	public static void mainMenu() {
		Scanner s = new Scanner(System.in);

		System.out.println("pick an option");
		System.out.println("-----1 happy");
		System.out.println("-----2 ok");
		System.out.println("-----3 not ok");
		System.out.println("-----4 bad");
		System.out.println("chris is mean");
		int x = s.nextInt();
		switch(x) {
		case 1:
			System.out.println("im happy for you");
			break;
		case 2:
			System.out.println("at least it is going ok");
			break;
		case 3:
			System.out.println("im sorry");
			break;
		case 4:
			System.out.println("things will get better");
			break;
		default:
			System.out.println("Yes, chris is a butt");
			break;
		}
		s.close();
	}
}
