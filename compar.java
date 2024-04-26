import java.util.*;
public class compar{
public static void main(String[]args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the values:");

int a=scanner.nextInt();
int b=scanner.nextInt();
int c=scanner.nextInt();
int d=scanner.nextInt();
int e=scanner.nextInt();

if(a>b && a>c && a>d && a>e)
 {
System.out.println("a value "+a+" is greater than all");
 } 
else if(b>c && b>d && b>e)
 
 {
 System.out.println("b value "+b+"  is greater than all");
 } 
else if(c>d && c>e)

{
System.out.println("c value "+c+" is greater than all");
 } 
else if(d>e)
{
System.out.println("d value "+d+" is greater than all");
 } 
else
{
System.out.println("e value "+e+" is greater than all");
 } 
}}

