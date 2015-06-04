import java.util.ArrayList;
import java.util.Scanner;
public class Definitions{
     ArrayList<Flashcard> tempSet = new ArrayList();
     FlashcardSet set = new FlashcardSet();
     Scanner input = new Scanner(System.in);
     public int counter = 0;
     /*import set
     *ask if theyd like to view word first or definition 
     have two different methods to run for both
     *make a duplicate arraylist that we can remove elements from
     loop through each object in the set to print one side of the card and ask for the other side
     test if input is same as other side of flashcard
     if yes add to counter and print how many correct after each question
     remove each one correct from arraylist
     after loop through ask if they want to go through all again or incorrect again
     choose looping through all or looping through incorrect
     */
     public void definitions(FlashcardSet set){
         this.set = set;
         for(int x = 0; x < set.cards.size(); x++){
            tempSet.add(set.cards.get(x));
         }
         
         System.out.println("Welcome to the Definitions Game!");
         System.out.println("A word from your flashcardset will be printed. Enter the definition. Good Luck!");
         wordFirst(set);
         System.out.println("You got " + counter);
            
         
         
     }
    
     
     
     public void wordFirst(FlashcardSet set){
       this.set = set;
       for(int x = 0; x < set.cards.size(); x++){ 
         System.out.println(set.cards.get(x).getWord());
         String answer = input.nextLine();
         if(answer.equalsIgnoreCase(set.cards.get(x).getWord())){
            System.out.println("Correct");
            set.cards.remove(x);
            counter ++;
         }
         else{
            System.out.println("Incorrect");
         }
       }  
     }
     
}

     
     
















