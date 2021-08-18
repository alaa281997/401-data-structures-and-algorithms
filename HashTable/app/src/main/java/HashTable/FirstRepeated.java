package main.java.HashTable;

import java.util.HashMap;
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
}
