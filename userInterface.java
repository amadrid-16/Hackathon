import java.util.Scanner;

public class userInterface{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Welcome to the Flashcard Maker");
      while (true){
      System.out.println("Menu");//menu
      System.out.println("1. Create New Set");//create new set
      System.out.println("2. Edit Set");//edit set
         //add card
         //remove card
      System.out.println("3. Play Definitions");//play definition game
         //select set
      System.out.println("4. Play Word Game");
         //select set
      System.out.println("5. View Set");
      System.out.println("6. Exit");
      //menu
      //create new set
      //back to main
      //edit set
         //edit set name
         //edit card
         //add card
         //remove card
         //back to main
      //play definition game
         //select set
         //back to main
      //play word game
         //select set
         //back to main
         
      int rtn = keyboard.nextInt();//gets from the user
      
         if (rtn == 1){
            //creates set
            FlashCardMaker.setCreator();
            System.out.println("SET CREATED");
         }  
         else if (rtn == 2){
            //edits set
            FlashcardSet.setEditMenu();
            System.out.println("SET EDITED");
         }   
         else if (rtn == 3){
            //ends run
            System.out.println("PLAY DEFINTIONS");
         }
         else if (rtn == 4){
            //word game
            System.out.println("PLAY WORD GAME");
         }
         else if(rtn == 5){
            //print set
            //set1.toString();
         }
         else if (rtn == 6){
            //exit
            System.out.println("GoodBye");
            break;
         }
         else {
            System.out.println("That's not one of the choices buddy");
         }
       }  
   }
}