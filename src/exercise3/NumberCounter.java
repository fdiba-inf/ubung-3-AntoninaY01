package exercise3;

import java.util.Scanner;
public class NumberCounter {

  public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  int number = input.nextInt();

  int positiveCount = 0;
  int negativeCount = 0;
  int sum = 0;
  int average = 0;
  while (number!=0){
   
   if (number>0){
     positiveCount++;
   } else{
     negativeCount++;
   }
   sum = sum + number;
  average = sum/(positiveCount + negativeCount);
   number = input.nextInt();
  } 
  System.out.println("Positive numbers: " + positiveCount);
  System.out.println("Negative numbers: " + negativeCount);
  System.out.println("Sum: " + sum);
  System.out.println("Average: " + average);

  
  }
}