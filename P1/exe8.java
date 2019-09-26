import java.lang.*; 
import java.io.*; 
import java.util.*;
public class exe8
{ 
    public static void main(String[] args) 
    { 
        String input = "himanshu"; 
        byte [] arr = input.getBytes(); 
        byte [] result =  new byte [arr.length]; 
        // Store result in reverse order into the result byte[] 
        for (int i = 0; i<arr.length; i++) 
            result[i] =  
            arr[arr.length-i-1]; 
        System.out.println(new String(result)); 
    } 
} 