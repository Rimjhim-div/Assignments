/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
public class prime {
    static boolean isPrime(int n)
        {
            
            if (n <= 1)
                return false;
    
            
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;
    
            return true;
        }
    public static void main(String[]args){
        int n=3;
       boolean b=isPrime(n);
       if(b){
        System.out.print("prime");
       }
       else{
        System.out.print("not prime");
       }
    }
}
