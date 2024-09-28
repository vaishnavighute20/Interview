package com.app.string;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
 
		String str="vaishnavi";
		boolean flag=true;
		for(char i: str.toCharArray())//Converts this string to a new character array.
		{
			// if current character is last occurance in the String
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				 System.out.println("First non-repeating character is: "+ i);
            flag = false;
            break;
		}
	
	}
	
	 if(flag)
         System.out.println("There is no non repeating character in input string");
}

}