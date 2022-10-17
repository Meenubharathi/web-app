package methodpackage;

public class OldTask 
{
   private String word;
   private int number;
   public OldTask()
   {
	   
   }
   public OldTask(String word,int number)
   {
	  this.word=word;
	  this.number=number;
   }
   public void setWord(String word)
   {
	   this.word=word;
   }
   public String getWord()
   {
	   return word;
   }
   public void setNumber(int number)
   {
	   this.number=number;
   }
   public int getNumber()
   {
	   return number;
   }
  public String toString()
   {
	   String st=word+" "+number;
	   return st;
   }
}
