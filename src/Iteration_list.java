/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Iteration_list {
    public static void main(String[]args){
        List<Integer>l=new ArrayList<>();
        l.add(1);
         l.add(11);
         l.add(12);
         l.add(13);
         //using for loop
      /*  for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }*/
      //using iterator
//          Iterator<Integer> it=l.iterator();
//          while(it.hasNext()){
//              System.out.println(it.next());
//          }
//using for each loop
l.forEach((numbers)->{System.out.println(numbers);});
                
    }
}
