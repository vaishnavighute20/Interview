package com.app.code;

public class LinearSearch {

	public static void main(String[] args) {
        int a[]= {10,20,40,50,30};//5
        boolean flag=false;
        int search_ele=50;
        for(int i=0;i<a.length;i++)
        {
        	//System.out.println(a[i]);
        	if(search_ele==a[i])
        	{
        		System.out.println("element found at : "+i + " position "+a[i]);
        		flag=true;
        		break;
        	}
        	
        }
        
		if(flag==false)
		{
			System.out.println("element is not found");
		}
	}

}
