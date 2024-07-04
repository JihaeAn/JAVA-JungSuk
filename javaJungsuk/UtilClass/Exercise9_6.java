package javaJungsuk.UtilClass;

import java.util.Arrays;

public class Exercise9_6 {
    public static String fillZero(String src, int length) {
        if(src == null || src.length() == length) {
            return src;
        } else if (length <= 0) {
            return "";
        } else if (src.length() > length) {
            return src.substring(0, length);
        }

        char[] ch = new char[length];
        Arrays.fill(ch, '0');

        int b = src.length() - 1; // 실제 길이보다 인덱스가 1 작으니까
        for(int i = ch.length - 1; i >= ch.length - src.length(); i--) { // 배열의 뒤에서부터 시작인 걸 잘 인지하기 !
            ch[i] = src.charAt(b);
            b--;
        }

//        for(int i =0 ;i < src.length(); i++){   // 이건 앞에서부터 시작인 방식 !
//            ch[length-src.length()+i] = src.charAt(i);
//        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}
