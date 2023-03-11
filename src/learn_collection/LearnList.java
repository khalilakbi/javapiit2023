package learn_collection;

import java.util.ArrayList;

public class LearnList {
    public static void main(String[] args) {
//        ArrayList l = new ArrayList();//
//        l.add("malek");
//        l.add(1);
//        System.out.println(l);
//        System.out.println(l.get(0) instanceof Integer);
        ArrayList<String> l = new ArrayList<>();
        l.add("aniqa");
        l.add("kfhf");
        l.add("djfj");
        ArrayList<String> l1 = new ArrayList<>(l);
        System.out.println(l1);
        l1.add(3,"jdgd");
        l1.set(0,"anika");
        System.out.println(l1);
        System.out.println(l1.contains("anika"));
        l.remove("anika");
        l.remove(1);
        System.out.println(l.get(1));
        System.out.println(l.indexOf("aniqa"));
        for(String s : l){
            System.out.println(s);
        }
        for(int i = 0; i < l.size(); i++){
            System.out.println(l.get(i));
        }


    }
}
