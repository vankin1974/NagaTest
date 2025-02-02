/**
 * 
 */
package com.naga.start;

/**
 * @author naga
 *
 */
public class HelloWorld {

	/**
	 * @param <Int>
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int sum =0;
		for (int i : numbers) {
			sum += i;
		}
		System.out.println("Sum is:" +sum);
	}
	

}
