package com.app.code;

public class FindSubString {

	// asked in coupa company coding round
	public static void main(String[] args) {
      String mainString="Hello, this simple example";
      String subString="simple";
      
      // position of subString
      int position =mainString.indexOf(subString);
      
      //check if subString is found
      if(position!=-1)
      {
          System.out.println("Substring '" + subString + "' found at position: " + position);

      }
      else
      {
          System.out.println("Substring '" + subString + "' not found");

      }
	}

}
