package Lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, List<String>> ageToNamesMap = new HashMap<>();
        addName(ageToNamesMap,41,"Max");
        addName(ageToNamesMap,44,"John");
        addName(ageToNamesMap,42,"Bill");
        addName(ageToNamesMap,41,"Erik");

        printMap(ageToNamesMap);

    }
    private static void addName(Map<Integer,List<String>> map,int age,String name){
     map.computeIfAbsent(age,k-> new ArrayList<>()).add(name);
    }
    private static void printMap(Map<Integer,List<String>> map){
        for(Map.Entry<Integer,List<String>> entry:map.entrySet()){
            System.out.println("Age: "+entry.getKey()+" - Names: "+entry.getValue());
        }
    }
}
