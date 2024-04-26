import java.util.Scanner;
public class factorial
{
public static void main(String[] args){
 Scanner scan=new Scanner(System.in);

int n=scan.nextInt();
int i=1;
int f=1;
for(;i<=n;i++){

f=f*i;
}
System.out.println(f);
}
}

