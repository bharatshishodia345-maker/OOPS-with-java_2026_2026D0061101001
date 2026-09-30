import java.util.*;

public class MapDemo{
    public static void main(String[] args){
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(10,96);
        hm.put(20,95);
        hm.put(30,94);
        hm.put(40,93);

        for(Map.Entry<Integer,Integer> i:hm.entrySet()){
            System.out.println("key "+ i.getKey() + " value " + i.getValue());
        }
    }

}