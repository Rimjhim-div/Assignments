/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
import java.util.Arrays;
public class Sorting{
    static void swap(int a[],int i,int j){
              int temp;
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
    }
    static void sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
    }
    public static void main(String[]args){
        int a[]={20,40,50,30};
        sort(a);
       
            System.out.print(Arrays.toString(a)+"");
        
    }
}

