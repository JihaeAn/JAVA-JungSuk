package javaJungsuk.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println(3 + '0');
        System.out.println( '3' - '0');
    }
}

/**
 * char 리스트로 바꿔서 푸는 법
 */
class Solution1 {
    boolean solution(String s) {
        boolean answer = true;

        int Psum = 0;
        int Ysum = 0;

        char[] str = s.toCharArray();

        for(int i = 0; i < str.length; i++){
            if(str[i] == 'y' || str[i] == 'Y'){
                Ysum += 1;
            }else if(str[i] == 'P' || str[i] == 'p'){
                Psum += 1;
            }
        }
    if(Psum != Ysum) {
        answer = false;
    }
        return answer;
    }
}

/**
 * substring으로 푸는 법
 */
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int Psum = 0;
        int Ysum = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.substring(i, i+1).equals("p") || s.substring(i, i+1).equals("P")){
                Psum += 1;
            }else if(s.substring(i, i+1).equals("y") || s.substring(i, i+1).equals("Y")){
                Ysum += 1;
            }
        }

        if(Psum != Ysum) answer = false;

        return answer;
    }
}