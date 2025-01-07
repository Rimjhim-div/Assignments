/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
public class reverse {
    public static void main(String[]args){
        String s = "hello"; 
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
              
              
            ch = s.charAt(i);
            r = ch + r; 
        }
      
        System.out.println(r);
    }
}
