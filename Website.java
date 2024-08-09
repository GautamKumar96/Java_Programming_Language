import java.util.Scanner;
public class Website 
{
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a website!");
  String  website =sc.next();
  if(website.endsWith(".org"))
  {
  System.out.println("this is an orgnaizational website!");
  }
     else if (website.endsWith(".com"))
      {

       System.out.println("this is a commercial website!");
      
     } else if (website.endsWith(".in"))
     {
      
     System.out.println("this is an Indian website!");
     }
      
    
  }  
  }

