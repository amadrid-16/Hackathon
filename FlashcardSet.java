import java.util.ArrayList;
import java.util.Scanner;

public class FlashcardSet{
   String setName;
   int numCards;
   ArrayList<Flashcard> cards;
   public FlashcardSet(String setName){
      this.setName = setName;
      cards = new ArrayList<Flashcard>();      
   }
   public FlashcardSet(){
      this("Sample Set");
   }
   public static void setEditMenu(){
      Scanner keyboard = new Scanner(System.in);
      int rtn;
      while(true){
         System.out.println("Set Edit Menu\n1. Edit Set Name\n2. Edit Card\n3. Add Card\n4. Remove Card\n5. Back to Main Menu");
         rtn = keyboard.nextInt();
         if(rtn == 1){
            System.out.println("Set name edited");
         }
         else if(rtn == 2){
            System.out.println("Card Edited");
         }
         else if(rtn == 3){
            
            System.out.println("Card added");
         }
         else if(rtn == 4){
            System.out.println("Card Removed");
         }
         else if(rtn == 5){
            System.out.println("Goodbye");
            break;
         }
         else{
            System.out.println("That's not a valid selection");
         }
         
      }
      
   }
   public void newCard(String word, String definition){
      this.cards.add(new Flashcard(word, definition));
      numCards++;
   }
   public void newCard(){
      this.cards.add(new Flashcard());
      numCards++;
   }
   public String toString(){
      String rtn = this.setName;
      rtn += "\nNumber of Cards: " + numCards;
      for(Flashcard curr: cards){
         rtn += "\n" + curr.toString();
      } 
      return rtn;
   }
}