// class and print their sum
import java.util.Scanner;  
public class exe5
{ 
    public static void main(String[] args) 
    { System.out.println("Enter 0 to end the calculation of summation");
        Scanner sc = new Scanner(System.in); 
  
        // Initialize sum and count of input elements 
        int sum = 0, count = 0;   
        // to check if entered value is integer or not 
        while (sc.hasNextInt()) 
        { 
            // Read an int value 
            int num = sc.nextInt(); 
            sum += num; 
            count++; 
            if (num==0)
            break;
        }    
        if (!sc.hasNextInt())
        System.out.println("enter integers only");
        else
        System.out.println("Sum of numbers is " +" " + (sum))
        ; 
    } 
} 