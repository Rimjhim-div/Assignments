/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

public class String_Palindromecheck {
     static void checkPalindrome(String str){
         str.toLowerCase();
         str.trim();
        String r = "";
        char ch;
for (int i = 0; i < str.length(); i++) {
             ch = str.charAt(i);
            r = ch + r; 
        }
    if(str.equals(r)){
        System.out.println("String is palindrome");
        }
    else{
        System.out.println("String is not palindrome");
    }

     }
    public static void main(String[] args) {
      String s="Hyy I am Rimjhim";
      checkPalindrome(s);
    }
    
}
