import java.util.Scanner;
public class reverse{
public static void main (String[]args){

Scanner scanner=new Scanner(System.in);
System.out.println("enter the values:");

int n=scanner.nextInt();
int n1=n;
int i =0;
for(;n!=0;n/=10)
{
i=(i*10)+ n%10;
System.out.println(i+" "+n);
}


if (i==n1)
{
System.out.println("It is a palindrome");
}
else 
{
System.out.println("it is not a palindrome");
}
}}
