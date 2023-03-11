package learn_collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedList {

    public static void main(String[] args) {
        //Queue fifo
        LinkedList<String> l = new LinkedList<>();
//        l.offer("test1");
//        l.offer("test2");
//        l.offer("test3");
//        System.out.println(l);
//        l.poll();
//        System.out.println(l);
        //lifo
        //Deque
        l.offerFirst("test1");
        l.offerFirst("test2");
        l.offerFirst("test3");
        System.out.println(l);
        l.pollFirst();
        System.out.println(l);



    }
}
