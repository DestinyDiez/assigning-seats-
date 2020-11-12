import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] seatnumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    for (int i = 0; i < seatnumbers.length; i++ )
    { 
      System.out.println( seatnumbers[i] );
    } 
    
    String[] names = {"name1","name2","name3","name4","name5","name6","name7","name8","name9","name10","name11","name12","name13","name14","name15" };
    for (int i = 0; i < names.length; i++)
    {  
      System.out.println( names[i] );
    }  

    
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name1 = scan.next();
   
  }
}