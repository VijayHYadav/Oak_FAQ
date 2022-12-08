package com.basicsstrong.fundamentals.flowcontrol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loop {

	public static void main(String[] args) {
		
		/*
		 * for (int i = 0; true ; i++) { System.out.println(i); }
		 */
		/*
		 * for (int i = 0; ;i++) { System.out.println(i); }
		 */
		/*
		 * for (int i = 0; i < 10; ) { System.out.println(i); }
		 */ 
		
		/*
		 * int i = 1; while (i <= 5) { System.out.println(i); i++; }
		 */
		
		/*
		 * int i = 1; do { System.out.println("hello"); i++; } while (i <= 5);
		 */
		
		/*
		 * We can iterate any object with this loop, which implements the Iterable interface.
		 * 
		 * String[] strArray = {"Apple", "Banana", "Papaya"}; 
		 * for (String item : strArray) { System.out.println(item); }
		 * 
		 */
		
		/*
		 * Foreach method is introduced in java 8, in the interface iterator as default
		 * method. We can iterate over any collection by passing the Lambda expression
		 * as argument.
		 */
		/*
		 * List<Integer> list = Arrays.asList(1,2,3,4,5,6,7); list.stream().forEach(ele
		 * -> System.out.println(ele));
		 */
		
		/*
		 * for (int i = 0; i < 10; i++) { if (i == 3) { continue; }
		 * System.out.println(i); }
		 */
		
		/*
		 * for (int i = 0; i < 10; i++) { if (i == 3) { break; } System.out.println(i);
		 * }
		 */		
		
	}

}
