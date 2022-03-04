/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class Exercise12_07 {
    public static void main(String[] args){
        try{
            System.out.println(bin2Dec("10001"));
            System.out.println(bin2Dec("141111111"));
        
        
        }
        catch (InputMismatchException ex){
            System.out.println("Try again. (Incorrect input:"
                    + " it can only contain 0 or 1.");
        
        }
    
    
    }
    
    /*Trying to create a class with method that takes in string of binary digits, 
    contains a method that converts the binary digit string to decimal number if the string
    is binary otherwise, throws NumberFormatException */
    
    
public static int bin2Dec(String binaryString){
    double decNumber=0;
    int lenOfString = binaryString.length();
    for (int i = binaryString.length() ; i >=0 ;i--){
        if ((Integer.valueOf(binaryString.charAt(i-1)) != 0 )|| (Integer.valueOf(binaryString.charAt(i-1)) != 1)){
            throw new InputMismatchException ("Binary digit only contains 0 and 1");
   
        }
        else {
            decNumber = decNumber + (Integer.valueOf(binaryString.charAt(i-1))
                    * Math.pow(2,lenOfString));
            
            lenOfString--;
            
        }
    }

return (int)(decNumber);
}    
    
}