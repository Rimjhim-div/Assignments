/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
public class Digits {
    public static void main(String[] args) {
       int n=3504;
       int temp,sum=0;
    while(n!=0){
       temp=n%10;
       sum=temp+sum;
       n=n/10;
  }
  System.out.print(sum);
}
    
}
