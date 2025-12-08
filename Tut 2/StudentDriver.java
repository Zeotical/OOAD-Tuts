/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Basmala Mohammed Ali Elimam 
 */
import java.util.Scanner;


public class StudentDriver {
    public static void main(String[] args){  
        
    Scanner input = new Scanner(System.in);
    int choice = 0;
            //String subCode = input.nextLine();
        //char grade = input.next().toUpperCase().charAt(0);

    Student s1 = new Student("AK", "dog");
        
  while (choice!=4) {
  System.out.println("Choose an option to continue: ");
  System.out.println("[1] Enter new subject " + "[2] Remove Subject ") ; //use format l8tr
  System.out.println("[3] Show results " + "[4] Quit ") ;
  choice = input.nextInt();
  
  switch(choice){
      case 1: {
        System.out.println("Enter subject code: ");
        String subCode = input.next();
        System.out.print("Enter result obtained: ");
        char grade = input.next().toUpperCase().charAt(0);
        
        s1.addSubject(subCode,grade);
       break;
  }
      case 2: {
           System.out.println("Enter subject code to remove: ");

          String subCode = input.next();
          s1.remSubject(subCode);
          break;
  }
      case 3: {
        System.out.println(s1);
        s1.printTranscript();
        break;
  }
       case 4: {
        break;
  }

      default: {
    System.out.println("Invalid choice, please try again.");
  }
  }
    }//while loop
   }// main
}//class
