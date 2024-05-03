package pr1;

public class stringmethod {
public static void main(String[] args) {
	 
	String str="hello world";
	int length= str.length();
	System.out.println("1.length of string:"+length);
	
	String uppercasestr=str.toUpperCase();
    System.out.println("2.uppercase string:"+uppercasestr);
    
    String lowercasestr=str.toLowerCase();
    System.out.println("3.lowercase string:"+ lowercasestr);
    
    boolean StartsWithhello=str.startsWith("hello");
    System.out.println("4.starts with hello:"+StartsWithhello);
    
    boolean EndsWithworld=str.endsWith("world");
    System.out.println("4.ends with hello:"+EndsWithworld);
    
    String SubString=str.substring(7);
    System.out.println("6.subString from index7:"+SubString);
    
    String replacedstr=str.replace("world","universe");
    System.out.println("7."+replacedstr);
    
    String anotherstr="how are u?";
    String concatenatedstr=str.concat(anotherstr);
    System.out.println("8.concatenated string:"+concatenatedstr);
    
    String strWithWhitespace=" Trim me!";
    String trimedstr=strWithWhitespace.trim();
    System.out.println("9.Trimmed string:"+trimedstr);
    
    boolean containshello=str.contains("hello");	
}	
}
