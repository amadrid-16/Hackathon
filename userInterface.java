import java.util.Scanner;

public class userInterface{
   //userInterface UI = new userInterface();
   FlashcardSet FCS = new FlashcardSet();
   FlashcardSet set1 = new FlashcardSet();
   Definitions def = new Definitions();

      
   public void mainMenu(){   
      Scanner keyboard = new Scanner(System.in);
      
      
      System.out.println("Welcome to the Flashcard Maker");
      System.out.println("Please make a new set now so we can start adding cards!");
      set1 = set1.setCreator();
      
      while(1==1){      
      System.out.println("Great! Now would you like to add cards? (Y/N) ");
         String temp = keyboard.next();
            if(temp.equalsIgnoreCase("y")){
                  set1.cardCreator();
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
      System.out.println("1. Play Definitions");//edit set
         //add card
         //remove card
      System.out.println("2. Edit Set");//play definition game
         //select set
         //select set
      System.out.println("3. View Set");
      System.out.println("4. Exit");
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
            def.definitions(set1);
            System.out.println("PLAY DEFINTIONS");
         }
       
         else if (rtn == 2){
            //edits set
            
            this.setEditMenu();
            System.out.println("SET EDITED");
         }   
         else if(rtn == 3){
            //print set
            System.out.println(set1.toString());
         }
         else if (rtn == 4){
            //exit
            System.out.println("GoodBye");
            break;
         }
         else {
            System.out.println("That's not one of the choices.");
         }
       }  
   }



   public void setEditMenu(){
   

      Scanner keyboard = new Scanner(System.in);
      int rtn;
      while(true){
         System.out.println("Set Edit Menu\n1. Edit Set Name\n2. Add Card\n3. Remove Card\n4. Back to Main Menu");
         rtn = keyboard.nextInt();
         if(rtn == 1){
            set1.changeName();
            System.out.println("Set name edited");
         }
         else if(rtn == 2){
            set1.cardCreator();
            System.out.println("Card added");
         }
         else if(rtn == 3){
            System.out.println("Card Removed");
         }
         else if(rtn == 4){
            System.out.println("Goodbye");
            break;
         }
         else{
            System.out.println("That's not one of the choices.");
         }
         
      }
      
   }
   }
