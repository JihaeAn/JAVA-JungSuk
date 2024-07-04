package javaJungsuk.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        int value = 10;
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
        list.add(3, 11); // 끼워넣기
        System.out.println(list);
        list.set(2, 11);                // 덮어쓰기
        System.out.println(list);

        System.out.println("인덱스 뽑기 " + list.indexOf(1)); // 값으로 인덱스 번호 찾기

        int array[] = new int[5];

    }
}
