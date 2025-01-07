/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author 91626
 */
public class Fibonaci {
    
   public static void usingForloop(int n){
   System.out.println("using for loop");
       int i=1,temp;
       int j=0;
        System.out.println(j+"\n "+i);
       for(int k=1;k<=n;++k){
          temp=i+j;
             j=i;
          i=temp;
          //j=i;
           //System.out.println("0");
          System.out.println(temp);
       }
    }
       public static int usingrecursion(int n){
          // System.out.println("using  recursion");
           if(n<=1){
               return n;
                }
           return usingrecursion(n-1)+usingrecursion(n-2);
       }
        public static void main(String[]args){
        int n=5;
        usingForloop(n);
        for(int i=0;i<n;i++){
            System.out.println( usingrecursion(i));
        }
       // System.out.print( usingrecursion(n));
    }
}


