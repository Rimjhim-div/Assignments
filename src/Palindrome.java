/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
public class Palindrome {
    public static void main(String[]args){
        int n=152,temp,sum=0,number=n;
        while(n!=0){
            temp=n%10;
            sum=temp+sum*10;
            n=n/10;
            
        }
        if(number==sum){
            System.out.print("number is palindrome");
        }
        else{
             System.out.print("number is not palindrome");
        }
    }
}
