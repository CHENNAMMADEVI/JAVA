package pr1;

import java.util.Scanner;

public class seasonchecker {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
        System.out.println("enter the month");
		int a= scanner.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("january"+"\n it is winter");
			break;
			
		case 2:
			System.out.println("feb"+"\nit is winter");
			break;
		case 3:
			System.out.println("march"+"\nit is spring");
			break;
		case 4:
			System.out.println("april"+"\nit is spring");
			break;
		case 5:
			System.out.println("may"+"\nit is spring");
			break;
		case 6:
			System.out.println("june"+"\nit is summer");
			break;
		case 7:
			System.out.println("july"+"\nit is summer");
			break;
		case 8:
			System.out.println("aug"+"\nit is summer");
			break;
		case 9:
			System.out.println("sep"+"\nit is fall");
			break;
		case 10:
			System.out.println("oct"+"\nit is fall");
			break;
		case 11:
			System.out.println("nov"+"\nit is fall");
			break;
		case 12:
			System.out.println("dec"+"\nit is winter");
			break;
			
			default:
				System.out.println("invalid month");
				
		scanner.close();	
	   
		}
	}

}
