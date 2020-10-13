package exercise3;

import java.util.Scanner;
public class AngleCalculation {

  public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   double a;
   char t;

   do{
    double a = input.nextInt();
   char t = input.next().charAt(0);
    if (t=='r'){
      double result = a*Math.PI/180;
      System.out.print(result + "d");
      
    }else if(t=='d') {
      double result = a*180/Math.PI;
      System.out.print(result + "r");
    }while (t=='r' || t=='d');
  }
 }
}
