import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterChanges(String sb) { 
  
    String s = "";
    
    for(int i = 0; i < sb.length(); i++)
    {
        if (String.valueOf((char) sb.charAt(i)).matches("[a-zA-Z]"))
        {
            s += String.valueOf((char)(sb.charAt(i) + 1));
            
        }
        else{
            s += sb.charAt(i);
        }
         
    }
       
    return s.replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U");
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}
