package com.app.code;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String arr[]= {"java","c","c++","c","java",".net"};
		
		// Approach1
	/*	boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate elements : "+arr[i]);
                    flag=true;
				}
			}
		}
         if(flag==false)
	
	{
		System.out.println("duplicate elements not found");

	}
	*/
         // Approch2  HashSet
         HashSet<String>langs=new HashSet<String>();
         
   /*   System.out.println(langs.add("java"));
      System.out.println(langs.add("python"));
      System.out.println(langs.add("python"));
     */
 		boolean flag1=false;
         for(String l:arr)
         {
        	//System.out.println(langs.add(l));
        	if(langs.add(l)==false)
        	{
        		System.out.println("duplicate elements found : "+l);
	             flag1=true;
        	}
        	 if(flag1==false)
        			
        		{
        			System.out.println("duplicate elements not found");

        		}
         }
         
	}
}
