/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
public class vowelscount {
    public static void main(String[]args){
        String s="hello";
        int count=0;
        s=s.toLowerCase();
      //  char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.print(count);
        
        
    }
}
