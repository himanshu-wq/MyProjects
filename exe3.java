import java.util.Scanner;
public class exe3{
    public static void  main(String []args) {     
 Scanner in = new Scanner(System.in); 
        String str = in.nextLine();    
       int n = str.length();
   
       for(int x=0; x!=n; x++)
    { char ch = str.charAt(x); 
        ch=Character.toUpperCase(ch);
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')  
        System.out.println("Vowel ") ;
        else if(Character.isDigit(ch) == false)
        System.out.println("Consonant ") ; 
        else 
        System.out.println("Input not correct ") ; 
        }
           
                
    } 
}
