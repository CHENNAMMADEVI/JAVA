package pr1;
import java.util.Scanner;
public class stringacpitalise{
	public static void main(String[] args) {
	
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
		
		for (String word: words) {
		String capitalisedword=word.substring(0,1).toUpperCase()+word.substring(1);
		 output+= capitalisedword+" ";
		}
      
		return output.trim();
		
		
	}

}
