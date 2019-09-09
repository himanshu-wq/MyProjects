
import java.util.Scanner;
public class exe1{
    public static void  main(String []args) {

        int n;     
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      
        int rev_num = 0 ; int num=n; int s=0; int sum=0;
        while (num > 0) { s=num%10;
            rev_num = rev_num * 10 + s; 
            num = num/ 10; 
             if(s%2==0)
             sum=sum +s  ;
             
        } 
     
        
        if (rev_num == n && sum>25) 
           System.out.println("a Palindrome number and sum greater than 25");  
        else if (rev_num == n && sum<25) 
           System.out.println("a Palindrome number and sum less than 25"); 
        else
            System.out.println("not a Palindrome number");  
    } 
}
 
