package exercise3;

import java.util.Scanner;

public class AngleCalculation {

  public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
   double a;
   char t;

   do{
    double a = input.nextDouble();
   char t = input.next.()charAt(0);
    if (t=='r'){
      double result = 180.0*a/Math.PI;
      System.out.print("Angle: " + result + "d");
      
    }else if(t=='d') {
      double result = a*Math.PI/180.0;
      System.out.print("Angle: " + result + "r");
    }while (t=='r' || t=='d')
  }
 }
}
