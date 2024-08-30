package com.app.code;

public class Swapping2Numbers {

	public static void main(String[] args) {
 
		int a=10, b=20;
		System.out.println("before swapping values are..."+a+" "+b);

		// logic 1 using temp variable ie third variable
		/*	
    	int temp =a;
		a=b;
		b=temp;
		
		System.out.println("after swapping values are..."+a+" "+b);
        */
		
       //	logic2  + & - without using third variable
	/*	a=a+b;   //10+20=30
		b=a-b;   //30-20=10
		a=a-b;   //30-10=20
	
		System.out.println("after swapping values are..."+a+" "+b);
 */
	
		//  logic3  * /    values should not be zero
	/*	a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swapping values are..."+a+" "+b);
*/
		
		
		//logic4  bitwise xor  ie convert it in binary internally
		 // 1010=10
         // 20=10100
	/*	a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swapping values are..."+a+" "+b);
*/
		
		//logic5  in single line
		b=a+b-(a=b);
		System.out.println("after swapping values are..."+a+" "+b);

	}

}
