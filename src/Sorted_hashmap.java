/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91626
 */
//public class Sorted_hashmap {
    import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sorted_hashmap {
  public static void main(String[] args) {

   
    Map<String, String> languages = new HashMap<>();
    languages.put("pos3", "JS");
    languages.put("pos1", "Java");
    languages.put("pos2", "Python");
    System.out.println("Map: " + languages);

   
    TreeMap<String, String> sortedNumbers = new TreeMap<>(languages);
    System.out.println("Map with sorted Key" + sortedNumbers);

  }
}

