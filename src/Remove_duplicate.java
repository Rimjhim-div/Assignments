/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class Remove_duplicate {
    static Set<Integer> remove_duplicates(List <Integer> a){
        Set<Integer>s=new LinkedHashSet<>();
        s.addAll(a);
        return s;
    }
    public static void main(String[]args){
        List<Integer>l=new ArrayList<>();
        l.add(12);
          l.add(13);
            l.add(14);
              l.add(14);
        //remove_duplicates(l);
   Set<Integer>s1=new LinkedHashSet<>();
   s1.addAll(remove_duplicates(l));
   Iterator<Integer>it=s1.iterator();
   while(it.hasNext()){
       System.out.println(it.next());
   }
                
    }
}
