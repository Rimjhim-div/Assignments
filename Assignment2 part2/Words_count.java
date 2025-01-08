/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 91626
 */
public class Words_count {
    public static void main(String[]args) throws FileNotFoundException{
       
       FileInputStream fis=new FileInputStream("C:\\Users\\91626\\OneDrive\\Desktop\\New Folder\\java.txt");
            Scanner sc=new Scanner(fis);
       ArrayList<String> words=new ArrayList<>();
        ArrayList<Integer> occurences=new ArrayList<>();
        //Scanner sc=new Scanner(fis);
        while(sc.hasNext()){
            String word=sc.next();
            if(words.contains(word)){
                int i=words.indexOf(word);
                occurences.set(i, occurences.get(i)+1);
            }
            else{
                words.add(word);
                occurences.add(1);
            }
        }
        for(int a=0;a<words.size();a++){
            System.out.println(words.get(a)+":"+occurences.get(a));
        }
    }
}
