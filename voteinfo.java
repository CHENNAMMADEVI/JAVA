import java.util.*;
public class voteinfo{
 public static void main(String[]args){
  Scanner v = new Scanner(System.in);

  System.out.println("enter your name:");
  String name=v.nextLine();

  System.out.println("enter your age:");
  int age=v.nextInt();

  v.nextLine();
  System.out.println("enter your place:");
  String place=v.nextLine();
  

  if (name=="devi"){
  System.out.println("correct name");

     if (place=="chennai"){
     System.out.println("correct place");

     if (age>=18){
     System.out.println("you are eligible to vote");
    }
  else{
  System.out.println("you are not eligible to vote");
  }
  }
  }
 else{
 System.out.println("your name is incorrect");
}
}
}
