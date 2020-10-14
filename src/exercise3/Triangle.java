package exercise3;

import java.util.Scanner;
public class Triangle {

  public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   int number = input.nextInt();

   do{

   double a = input.nextDouble();
   double b= input.nextDouble();
   double c= input.nextDouble();

   if(!a>0 || !b>0 || !c>0){
   System.out.println("Values are not correct!");
   break;
   }
   else if(!a+b>c || !a+c>b || !b+c>a){
     System.out.println("Values are not correct!");
     break;
   } 
    double area;
    area = Math.sqrt s(s-a)*(s-b)*(s-c);
    System.out.println("Area: " + area);
    


   

   

   } while
  }
}