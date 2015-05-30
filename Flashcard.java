/*Hackathon Project
Period 1 Eno
Angel Madrid*/

/*FLASH CARDS*/

public class Flashcard{
   String word;
   String definition;
   
   public Flashcard(String word, String definition){
      this.word = word;
      this.definition = definition;
   }
   public Flashcard(){
      this("Sample", "A small part or quantity intended to show what the whole is like.");
   }
   public String toString(){
      String rtn;
      rtn = "\tWord: " + this.word + "\n\tDefinition: " + this.definition;
      return rtn;
   }
}