package javaJungsuk.test;

import java.util.*;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(0);

        // list1.remove(Integer.valueOf(0));
        // list1.remove(new Integer(0));
        // list1.remove(0);
        list1.removeIf(n -> n.equals(0));

        System.out.println(list1);
    }
}
