import java.util.Scanner;

public class userInterface{
      
   public static void main(String[] args){
      userInterface UI = new userInterface();
      FlashcardSet FCS = new FlashcardSet();
      Scanner keyboard = new Scanner(System.in);
      FlashcardSet set1 = new FlashcardSet();
      
      System.out.println("Welcome to the Flashcard Maker");
      System.out.println("Please make a new set now so we can start adding cards!");
      set1 = FCS.setCreator();
      
      while(1==1){      
      System.out.println("Great! Now would you like to add cards? (Y/N) ");
         String temp = keyboard.next();
            if(temp.equalsIgnoreCase("y")){
                  FCS.cardCreator();
                  System.out.println("Card added");
            }      
            else if(temp.equalsIgnoreCase("n")){
                  System.out.println("Ok you can add some later");
                  break;
            }
            else{
                  System.out.println("That was not valid input. Please try again.");                       
            }
      }
      

      
      
      while (true){
      System.out.println("Menu");//menu
      System.out.println("1. Edit Set");//edit set
         //add card
         //remove card
      System.out.println("2. Play Definitions");//play definition game
         //select set
      System.out.println("3. Play Word Game");
         //select set
      System.out.println("4. View Set");
      System.out.println("5. Exit");
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
            //edits set
            
            UI.setEditMenu();
            System.out.println("SET EDITED");
         }   
         else if (rtn == 2){
            //ends run
            System.out.println("PLAY DEFINTIONS");
         }
         else if (rtn == 3){
            //word game
            System.out.println("PLAY WORD GAME");
         }
         else if(rtn == 4){
            //print set
            System.out.println(set1.toString());
         }
         else if (rtn == 5){
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
   userInterface UI = new userInterface();
   FlashcardSet FCS = new FlashcardSet();

      Scanner keyboard = new Scanner(System.in);
      int rtn;
      while(true){
         System.out.println("Set Edit Menu\n1. Edit Set Name\n2. Edit Card\n3. Add Card\n4. Remove Card\n5. Back to Main Menu");
         rtn = keyboard.nextInt();
         if(rtn == 1){
            FCS.changeName();
            System.out.println("Set name edited");
         }
         else if(rtn == 2){
            System.out.println("Card Edited");
         }
         else if(rtn == 3){
            FCS.cardCreator();
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
      

}
