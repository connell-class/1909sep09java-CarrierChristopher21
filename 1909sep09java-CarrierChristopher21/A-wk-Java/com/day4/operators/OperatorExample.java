package com.day4.operators;

public class OperatorExample {

	public static void main(String[] args) {
		/*
		 * Unary, Binary, and Ternary
		 * Unary operates on one operand
		 * Binary operates on two operands
		 * Ternary operates on three operands
		 * 
		 * Unary
		 *  x++		post increment
		 *  ++x		pre increment
		 *  x--		post decrement
		 *  --x		pre decrement
		 *  !		not (negation)
		 *  ~		bitwise complement (something wierd)
		 * Binary
		 * +	addition
		 * -	subtraction
		 * *	multiplication
		 *  /	division
		 *  %	modulus
		 *  >	greater than
		 *  <	less than
		 *  >=	greater than or equal to
		 *  <=	less than or equal to
		 *  >>	shift
		 *  <<	shift
		 *  >>>	shift
		 *  ==	comparison
		 *  &	logical and (bitwise operator)
		 *  |	logical or (bitwise operator)
		 *  ^	exclusive or (bitwise operator)
		 *  &&	logical and (short circuit operator)
		 *  ||	logical or (short circuit operator)
		 *  instanceof	checked if the object is instance of a class
		 *  +=	addition assignment
		 *  -=	subtraction assignment
		 *  *=	multiplication assignment
		 *  /=	division assignment
		 *  %=	modulus assignment
		 *  =	assignment
		 * 
		 * Ternary
		 * ? :	
		 */
		
//		System.out.println(1+1);
		int x =5;
//		System.out.println(x-1);
//		System.out.println(x/2);
//		System.out.println(x+1);
//		System.out.println(x);
//		x=x+1;
//		System.out.println(x);
//		x+=1;
//		x++;
		//x+=2 
//		System.out.println(++x);	->6
//		System.out.println(x++);	->5
//		System.out.println(x);		->6
		
//		boolean b = true;
//		System.out.println(b);
//		System.out.println(!b);
//		System.out.println(x);
//		System.out.println(~x);
//		int y =-10;
//		System.out.println(~y);
		int z = (x<4)? x : 4;
		System.out.println(z);
//		int x1 = (x<4)?(x>2)?2:1:3; hot mess dont do it
//		System.out.println(x1);
		
		
	}
}
