package com.example.project;

public class StringManip{
        /** Takes a string str and returns a new string
    * with all spaces removed.
    */
    public static String removeSpaces(String str){ 
            /* implementation not shown */
            return str.replace(" ",""); 
    }


    /** Takes a string str and returns a new string
    * with the characters reversed, as described in part (a).
    */
    public static String reverseString(String str){ 
        /* to be implemented in part (a) */
        String result = "";
        for(int i=0;i<str.length();i++){
            result = str.substring(i,i+1) + result;
        }
        return result; 
    }
    /** Determines whether str is a palindrome and prints a message
    * indicating the result, as described in part (b).
    * Precondition: str contains only lowercase letters and spaces.
    */
    public static void palindromeChecker(String str){ 
            /* to be implemented in part (b) */
            String noSpaceStr = removeSpaces(str);
            if(noSpaceStr.equals(reverseString(noSpaceStr))){
                System.out.println(str + " is a palindrome");
            }else{
                System.out.println(str + " is not a palindrome");
            } 
    }


}