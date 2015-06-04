import java.util.Scanner;
import java.util.ArrayList;

public class FlashcardSet{
public Scanner keyboard = new Scanner(System.in);
   
   public String word;
   public String definition;
   
   String setName;
   int numCards;
   public ArrayList<Flashcard> cards;
   public FlashcardSet(String setName){
      this.setName = setName;
      cards = new ArrayList<Flashcard>();      
   }
   public FlashcardSet(){
      this("Sample Set");
   }


   public String toString(){
      String rtn = setName;
      rtn += "\nNumber of Cards: " + cards.size();
      for(Flashcard curr: cards){
         rtn += "\n" + curr.toString();
         System.out.println("");
      } 
      return rtn;
   }

   
   public FlashcardSet setCreator(){
      String setName;
      
      System.out.println("What would you like to name your set?");
      setName = keyboard.nextLine();
      FlashcardSet set1 = new FlashcardSet(setName);
      System.out.println(set1.toString());
      return set1;
   }
     
   public void cardCreator(){
      System.out.println("What would you like the word to be?");
      word = keyboard.nextLine();
      System.out.println("And the definition?");
      definition = keyboard.nextLine();
      newCard(word, definition);
      System.out.println(cards.get(numCards-1));
      System.out.println("Set size: " + numCards);
      
   }
   
   public void newCard(String word, String definition){
      this.word = word;
      this.definition = definition;
      cards.add(new Flashcard(word, definition));
      numCards++;
   }
   
   public void newCard(){
      cards.add(new Flashcard());
      numCards++;
   }   
   
   public void changeName(){
      System.out.println("What would you like to rename your set to?");
      String setName = keyboard.nextLine();
      this.setName = setName;
      
   }   
       
}