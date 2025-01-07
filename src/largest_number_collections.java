/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class largest_number_collections {
    public static void main(String[]args){
        List<Integer>l=Arrays.asList(10,20,20,30);
        int maxvalue=Collections.max(l);
        System.out.print(maxvalue);
    }
}
