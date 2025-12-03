/**
 *
 * @author zeotical (Basmala Mohammed Ali Elimam)
 */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) { 

// Create a Scanner object 

Scanner input = new Scanner(System.in); 

// Prompt the user to enter a word
int i = 0;
int wordLen;
System.out.print("Enter a word: ");
String word = input.nextLine().toUpperCase(); 
wordLen = word.length();

//Print the word and add the first letter to the end until the last letter is reached
while(i<wordLen){
        System.out.print(word);
        word = word.charAt(1) + word.substring(2,wordLen) + word.charAt(0);
i++;
System.out.print("\n");

}
} // end main 

}
