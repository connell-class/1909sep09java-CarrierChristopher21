package com.day2.review;

public class StringMutationsExample {

	public static void main(String[] args) {
		//string is immutable, when we call methods on it
		//	it does not change the string it holds
		//	best use case, if not changing string a lot, no matter the 
		//		amount of threads
		String s = "this string";
		String s1 = s;
		s = "this is a new string in the pool";
//		System.out.println(s + " and then "+ s1);
		String s2 = new String(s);
		s2.equals(s);
		String s3 = s2.toUpperCase();
//		System.out.println(s3);
		char[] c = {'d','f',233,'r'};
//		System.out.println(new String(c));
		
		//String buffer is mutable, we can call methods on it
		//	that change the value it holds
		//	best use if changing string alot in a multi-threaded env.
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
//		sb.append(false);
//		System.out.println(sb);
//		sb.insert(3, "this strng");
//		System.out.println(sb);

		//StringBuilder does the same thing as StringBuffer, but faster
		//	best use if changing a string alot, but not multi-threaded
		StringBuilder sbd = new StringBuilder(s);
		sbd.delete(4, 6);
		System.out.println(sbd);
	}
}
