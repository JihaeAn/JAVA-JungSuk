package javaJungsuk.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String[] args) {
        Set set = new TreeSet();
//        Set set = new HashSet();

        for(int i = 0; i < 6; i++){
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);
        }
        System.out.println(set);
    }
}
