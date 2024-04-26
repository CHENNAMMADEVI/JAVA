import java.util.Scanner;
public class odd{
public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the values:");

int n=scanner.nextInt();
for(int i=0;i<n;i++)
{
if(i%2==0)
{
System.out.println(i+ " is even");
}
else
{
System.out.println(i+ " is odd");
}
}
}}