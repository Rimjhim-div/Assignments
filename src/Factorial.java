/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
public class Factorial {
    static void fact(int n){
          int f=1;
          for(int i=1;i<=n;i++){
            f=f*i;
          }
          System.out.print(f);
   } 
   public static void main(String[] args) {
    int n=6;
    fact(n);
   }
}
