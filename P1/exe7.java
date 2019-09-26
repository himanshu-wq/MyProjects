import java.util.*;
import java.util.Arrays; 
import java.util.Collections; 

public class exe7{
    public static void  main(String []args) {
     
    int sum=0;   
    int count=0;
      Scanner in = new Scanner(System.in);
      int x= in.nextInt();
      int num = x;
       int size= 0 ;  int s =0;
           
       while (num>0) { 
           s=num%10;
            num = num/ 10;    
             size++ ;
        } 

        int[] arr=new int[size];
        int t=0; int b= 0;
        while (x>0) { 
           t=x%10;
            x = x/ 10; 
            arr[b]=t;
            b++;             
        } 
      
      for(int i=0; i<size; i++){
          if (arr[i]%2==0)
          {
              sum =sum+arr[i];
          }
      }
       Arrays.sort(arr);
  
     for(int i=(size-1); i>=0; i--)
     {
         System.out.println(arr[i]);
     }
       System.out.println("The sum of the numbers is " + sum);

      if (sum>15)
          System.out.println("True");
      
      else
          System.out.println("False");
    }
             
        }
 
