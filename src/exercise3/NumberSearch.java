package exercise3;
import java.util.Scanner;

public class NumberSearch {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    int number = 0;
    int count = 0;

    for(; number<=1000; number++){
      if (number%5==0 && number%6==0){
        System.out.print(number + " ");
        count++;

        if(count!=10){
          System.out.print(number +" ");

          
        }else{
          System.out.println(number);
          count = 0;
        }
      }
    }
  }
}