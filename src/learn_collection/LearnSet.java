package learn_collection;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class LearnSet {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("malek");
        s.add("mehnaz");
        s.add("sharmin");
        s.add("nusrat");
        s.add("sabrina");
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            if(s.contains("sharmin")){
                s.remove("sharmin");
                break;
            }
        }
        System.out.println(s);



    }
}
