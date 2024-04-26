public class nestediff{
public static void main (String args[])
{
int a=20;
if(a>10)
{
System.out.println("this is greater than 10");

if(a>15){
System.out.println("this is greater than 15");
}
else{
System.out.println("this is inner else");
}
}
else 
{
System.out.println("this is else");
}
}}