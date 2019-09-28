package com.day1.review;

import java.util.Arrays;
import static java.util.Arrays.sort;

public class VarArgsExample {

	static int[] makeArray(int...r) {
		return r;
	}
	public static void main(String[] args) {
		int[][] r2d2=make2dArr(1,2,3,4,5,6,7,7,8,9,6,5,4,4,6,7,8,5,4,4,66);
		for(int[] i:r2d2) {
			sort(i);
			System.out.println(Arrays.toString(i));
		}
	}
	
	/**
	 * 
	 * @param f this is a var arg <p>this is a thing</p><code>blah blah blah>/code>
	 * @return	returns a 2d array constructed of the varargs put in
	 * @author Robert, thats meee.
	 */
	static int[][] make2dArr(int...f){
		int[][] r = new int [f.length][];
		for(int i=0;i<f.length;i++) {
			r[i]=makeArray(f);
		}
		return r;
	}
}
