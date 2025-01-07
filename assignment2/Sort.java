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
public class Sort {
static void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
       // return nums;
    }
 
int partition (int a[], int start, int end)  
{  
    int pivot = a[start]; 
    int i = start ;  
    int j=end;
  
    while(i<j){
    while(a[i]<pivot && i<end){
        i++;
    }
    while(a[j]>pivot && j>start){
        j++;
    }
    if(i<j){
       swap(a,i,j);
    }
    }  
   
    return (j);  
}  
  

void quick(int a[], int start, int end) 
{  
    if (start < end)  
    {  
        int p = partition(a, start, end); 
        quick(a, start, p - 1);  
        quick(a, p + 1, end);  
    }  
}  
  

void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i <= n; i++)  
        System.out.print(a[i] + " ");  
}  
    public static void main(String[] args) {  
    int a[] = { 13, 18, 27, 2, 19, 25 };  
    int n = a.length;  
    System.out.println("\nBefore sorting array elements are - ");  
    Sort q1 = new Sort();  
    q1.printArr(a, n);  
    q1.quick(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are - ");  
    q1.printArr(a, n);  
    System.out.println();  
    }  
}  

