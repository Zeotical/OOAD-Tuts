/**
 *
 * @author zeotical (Basmala Mohammed Ali Elimam)
 */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) { 

// Create a Scanner object 

Scanner input = new Scanner(System.in); 

// Prompt the user to enter a number within the specified range 
int i = 0;
int x = 0;
int counter = 0;
System.out.print("Enter an integer >0 and <21: ");
System.out.print("\n");
int num = input.nextInt(); 


while(num<0 || num>21){
System.out.print("Wrong number range"); 
System.out.print("\n");
System.out.print("Enter an integer >0 and <21: "); 
System.out.print("\n");

num = input.nextInt(); 
}

//Print the shape based on user input
while(i!=num){
        System.out.print(i+1);
        counter = i+1;
    while(x!=num){
         if(x!=0){
            counter = counter +(num);
            System.out.print(" ");
            System.out.print(counter);
            }
    x++;
    }
i++;
x = 0;
System.out.print("\n");

}
} // end main 

}
