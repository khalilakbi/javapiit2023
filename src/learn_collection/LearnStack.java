package learn_collection;

import java.util.Collections;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("ctest1");
        s.push("btest2");
        s.push("atest3");
        s.push("test4");
        System.out.println(s);
        s.pop();
        System.out.println(s);

        System.out.println(s);
    }
}
