package exercise3;


public class NumberSearch {
  public static void main (String[] args){
    
    int number = 100;
    int count = 0;

    for(; number<1000; number++){
      if (number%5==0 && number%6==0){
        System.out.print(number + " ");
        count++;

        if(count==10){
          System.out.println();
          count=0;
        }
      }
    }
  }
}