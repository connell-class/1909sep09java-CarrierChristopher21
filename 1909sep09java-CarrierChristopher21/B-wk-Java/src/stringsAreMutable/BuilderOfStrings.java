package stringsAreMutable;
/*
 * Strings are immutable.
 * StringBuilder is a class that contains mutable strings
 * StringBuffer is alot like StringBuilder, however StringBuffer
 * 		is synchronized. This makes it slower but thread safe.
 * Get to know the methods of each class, they can be
 * 		deceptive.
 */


public class BuilderOfStrings {

	public static void main(String[] args) {
		String str = "Can we build it";
		StringBuilder sb = new StringBuilder("yes we can");
//		System.out.println(str);
//		System.out.println(sb);
		StringBuilder sb2 = new StringBuilder(str+"frank");
//		String s=str.substring(5);
//		sb2.substring(5);
		str.concat("here");
		sb2.append("kat attack");
		
		System.out.println(sb2);
		System.out.println(str);
	}
}
