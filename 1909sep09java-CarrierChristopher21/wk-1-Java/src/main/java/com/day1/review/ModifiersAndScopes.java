package com.day1.review;

public class ModifiersAndScopes {

	/*
	 * modifiers
	 * 	we have two kinds
	 * 		those that change accessibility privileges
	 * 		and those that dont
	 * we have:
	 * 		access modifiers
	 * 		non access modifiers
	 * 
	 * 
	 * 		public, protected, default/package-private (no modifier), 
	 * 				and private
	 * 
	 * 		static, final, transient, synchronized, volatile, native,
	 * 			abstract, default (for interface methods), etc...
	 * 
	 * 		4 scopes of java
	 * 
	 * 		static (class)
	 * 		instance (object)
	 * 		method
	 * 		block (local, loop)
	 * 
	 * 		4 pillars of OOP
	 * 	Abstraction		(interfaces and abstract classes)
	 * 	Polymorphism	(Overloading and overriding)
	 * 	inheritannce	(extending classes)
	 * 	encapsulation	(access modifiers)
	 * 
	 * 
	 * 		Java is pass by value
	 * 		Java is Strongly typed; we need to declare a variables data
	 * 			type upon creation and it can no longer hold any type
	 * 			besides that type.
	 * 
	 */
	
	public static void main(String[] args) {
		int c =6;
		doThis(c);
//		System.out.println(c);
		Object o  =new Object();
		int z = o.hashCode();
		reassign(o);
//		System.out.println(z==o.hashCode());
		
	}
	static void doThis(int x) {
		x++;
		
	}
	static void reassign(Object o) {
		o=new Object();
	}

}
