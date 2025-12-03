/**
 *
 * @author zeotical (Basmala Mohammed Ali Elimam)
 */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) { 

// Create a Scanner object 

Scanner input = new Scanner(System.in); 

// Prompt the user to enter a number within the specified range 
int i = 0;
int x = 0;
int counter = 1;
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
    while(x!=num){
        if (i<num-1 && i!=0){ // rows that are empty within
            if(x!=0 && x<num-1){
            System.out.print("  ");
            }
            else if(x==0){
            System.out.print(i+1); //starting number of row
            }
            else{
            System.out.print(" ");
            System.out.print(counter-i-1); // ending number of row
            }
        }
        else if (i==0){  // print the first row
        System.out.print(counter+" "); 
        counter++;
        }
        else if (i==num-1){   // print the last row
        counter--;
        System.out.print(counter+" ");
        }
    x++;
    }
i++;
x = 0;
System.out.print("\n");

}
} // end main 

}
