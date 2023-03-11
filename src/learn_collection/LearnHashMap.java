package learn_collection;

import java.util.*;

public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "sharmin");
        map.put(2, "mehnaz");
        map.put(3, "nusrat");
        map.put(4, "malek");
//        Set s = map.keySet();
//        System.out.println(s);
//        Collection c = map.values();
//        ArrayList l = new ArrayList<>(c);
        System.out.println(map.get(2).equals("Mehnaz"));
        System.out.println(map.containsValue("khalil"));
        System.out.println(map.containsValue("sharmin"));
        System.out.println(map.containsKey(67));
        System.out.println(map.get(2));
//        for(int i = 0; i <= map.size(); i ++){
//            System.out.println(map.get(i));
//        }
//        for(Map.Entry<Integer,String> m : map.entrySet()){
//            System.out.println(m.getKey()+" "+ m.getValue());
//
//        }
        int [] arr = {1,2,3,1,1,1,2,4,6};
        HashMap<Integer,Integer> duplication = new HashMap<>();
        for(int i = 0; i < arr.length; i++){ //
            if(duplication.containsKey(arr[i])){
                duplication.put(arr[i],duplication.get(arr[i])+1);//
            }else{
                duplication.put(arr[i],1);// (1,4) (2,2)(3,1)(4,1)(6,1)
            }

        }
        System.out.println(duplication);





    }
}
