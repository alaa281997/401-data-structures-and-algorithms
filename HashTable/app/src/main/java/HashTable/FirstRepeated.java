package main.java.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class FirstRepeated {
    public static String findFirstRepeated(String s) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for (String string : s.split(" "))
        {
            if(string.contains(",")){
                string = string.substring(0, string.length()-1);
            }
            int c = hashMap.get(string.toLowerCase(Locale.ROOT)) != null ? hashMap.get(string) : 0;
            if (c == 1){
                return string;
            }
            hashMap.put(string.toLowerCase(Locale.ROOT), c + 1);
        }

        return "Not Repeated";
  }
    public static List<String> leftJoin(HashMap hash1, HashMap hash2){

        List<String> list = new ArrayList<>();
        for(Object o : hash1.keySet()){
            if(hash1.containsKey(o)){
                list.add(o +  ": " + hash1.get(o)+ ", " + hash2.get(o));
            } else{
                list.add(o + ": " + hash1.get(o) + ", " + null);
            }
        }

        return list;
    }
}
