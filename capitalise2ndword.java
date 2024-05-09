package pr1;

import java.util.Scanner;

public class capitalise2ndword {
	public static void main(String[] args) 
	{
		
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter the string");
 String input=scan.nextLine();

	String output= capitalisedfirstletter(input);
	System.out.println(output);
	}
	
	public static String capitalisedfirstletter(String input)
	{
	   
		String [] words=input.split(" ");
		String output=" ";
		
		
		String capitalisedword=words[0]+ words[1].toUpperCase()+words[2]+words[3];
		 output+= capitalisedword+"  ";
	
	
	
	
      
		return output;
	}
}
		
		
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
