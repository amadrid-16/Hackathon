import java.util.Scanner;

public class FlashCardMaker{
      
      static FlashcardSet set1;
      static Scanner keyboard = new Scanner(System.in);
   public static FlashcardSet setCreator(){
      
      String setName;
      System.out.println("What would you like to name your set?");
      setName = keyboard.nextLine();
      set1 = new FlashcardSet(setName);
      FlashcardSet.setEditMenu();
      System.out.println(set1.toString());
      return set1;
   }
   public static void AddCard(){
      System.out.println("Which card would you like to ADD?");
      String cardName = keyboard.nextLine();
      System.out.println("What is the definition?");
      String definition = keyboard.nextLine();
      
      set1.newCard(cardName, definition);
   }
   public static void RemoveCard(){
      System.out.println("Which card would you like to remove?");
      int index = keyboard.nextInt();
      set1.removeCard(index);
   }
}