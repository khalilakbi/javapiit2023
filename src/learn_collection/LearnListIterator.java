package learn_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LearnListIterator {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        l.add("khalil");
        l.add("sharmin");
        l.add("mehnaz");
        l.add("malek");
        System.out.println(l.size());
       ListIterator <String> li = l.listIterator(3);
       while (li.hasPrevious()){
           System.out.println(li.previous());
       }



    }
}
