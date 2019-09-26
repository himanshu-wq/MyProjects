
import java.util.Scanner;
public class exe2{
    public static void  main(String []args) {

        int n;     
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
     int x= n%2;
        
        if (x==0 && (n>20&&n<30)) 
           System.out.println("Tom");  
        
        else if (x==1 && (n>20&&n<30)) 
           System.out.println("Jerry");   
    } 
}
 
