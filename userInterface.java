import java.util.Scanner;

public class userInterface extends FlashcardSet{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      FlashcardSet set1 = new FlashcardSet();
      
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
            set1 = FlashcardSet.setCreator();
            
            System.out.println("SET CREATED");
         }  
         else if (rtn == 2){
            //edits set
            userInterface UI = new userInterface();
            UI.setEditMenu();
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
            System.out.println(set1.toString());
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



   public void setEditMenu(){
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
            cardCreator();
            System.out.println("Card added");
         }
         else if(rtn == 4){
            System.out.println("Which card do you want to remove?");
            for (int x=0; x < numCards; x++){
               int i = x+1;
               System.out.println("Card: " + i);
               System.out.println(cards.get(x));
               System.out.println("");
            }
            int i = keyboard.nextInt();
            cards.remove(i-1);   
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
}
