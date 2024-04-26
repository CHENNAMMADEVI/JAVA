import java.util.Scanner;
public class adamno {
	public static void main(String[]args){
	
        Scanner scan=new Scanner(System.in);
	System.out.println("enter the values:");
	
int n=scan.nextInt();
int s=0;
int r=0;
int r1=0;
int s2=0;
        
     for(; n!=0;n/=10)
      {
       s=n*n; 
       r=(r*10)+ s%10;
       
       r1=(r1*10)+ n%10;
       s2=r1*r1;
      }
    
if (r==s2)
{
System.out.println("this is Adam number");
}
else
{
System.out.println("this is Adam number");
}
}
}