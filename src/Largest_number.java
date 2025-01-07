/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
public class Largest_number {
    public static void main(String[]args){
        int a[]={12,13,14,54,45};
        int large=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>large){
                large=a[i];
            }
        }
        System.out.print(large);
    }
}
