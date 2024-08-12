import java.util.Random;
import java.util.Scanner;
public class RockPepperSries_4 {
  public static void  main(String []args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter 0 for rock,1 for pepper,and 2 for seissor");
      
      int userInput = sc.nextInt();
      Random random = new Random();
       
      int computerInput =  random.nextInt(3);

      if(userInput == computerInput){
        System.out.println("draw");
      }
       else if(userInput == 0 && computerInput == 2||
               userInput == 1 && computerInput == 1||
                userInput == 2 && computerInput ==0){
                System.out.println("you win");
                }
              else {
                System.out.println("computer win");
              }  
            
              System.out.println("computer choice:"+computerInput); 
              
  }
}
