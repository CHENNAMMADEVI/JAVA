package pr1;

public class stringmethod2 {
	public static void main(String[] args) {
		
		String str="Hello,World!";
		
		int indexofcomma=str.indexOf(",");
		System.out.println("11.index of comma:"+indexofcomma);
		
		int lastindexofL=str.lastIndexOf("L");
		System.out.println("12.lastindex of L:"+lastindexofL);
		
		boolean isempty=str.isEmpty();
		System.out.println("13. is the string empty?:"+isempty);
		
		char charAt5=str.charAt(5);
		System.out.println("14.char at index 5:"+ charAt5);
		
		String[]parts=str.split(",");
		System.out.println("15.split:");
		for(String part:parts) {
			System.out.println(" "+part);}
		
		String str2="Hello";
		int compareresult=str.compareTo(str2);
		System.out.println("16.compare to Hello;"+compareresult);
		
		boolean isequal=str.equals(str2);
		System.out.println("17.Are the string equals?:"+isequal);
		
		boolean isequalignorecase=str.equalsIgnoreCase("Hello,World");
		System.out.println("18.Are the strings equal:"+isequalignorecase);
		
		char[] charArray=str.toCharArray();
		System.out.println("19.character array:");
		for (char c: charArray) {
			System.out.println(""+c);		}
		
		String replaceall=str.replaceAll("l","L");
		System.out.println(" "+replaceall);
		
		}
		
		
	}


