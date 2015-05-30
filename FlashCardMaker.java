import java.util.Scanner;

public class FlashCardMaker{
   
   public static FlashcardSet setCreator(){
      String setName;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("What would you like to name your set?");
      setName = keyboard.nextLine();
      FlashcardSet set1 = new FlashcardSet(setName);
      FlashcardSet.setEditMenu();
      System.out.println(set1.toString());
      return set1;
   }   
}