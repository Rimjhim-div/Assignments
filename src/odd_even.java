/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
public class odd_even {
    
    static void odd_even(int n){
        if(n%2!=0){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }
    public static void main(String[]args){
        int n=20;
        odd_even(n);
    }
}

