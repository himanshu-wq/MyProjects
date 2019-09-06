import java.lang.*; 
import java.io.*; 
import java.util.*;
public class exe10{
    public static void main(String[] args)
    {
        System.out.println("Enter string :");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        Scanner read1 = new Scanner(System.in);
        String number = read1.nextLine();
	    int str1 = Integer.parseInt(number);
        String str2 = "";
        for (int j=0; j!=str1; j++ )
        {
            for(int i = str.length() - 1-str1 ; i!=str.length()-1; i++)
                {    str2 = str2 + str.charAt(i);
                }
        }
        

        System.out.println(str +str2);
        
    }
}