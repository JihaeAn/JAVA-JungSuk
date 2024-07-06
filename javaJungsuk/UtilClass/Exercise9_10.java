package javaJungsuk.UtilClass;

import java.util.Arrays;

public class Exercise9_10 {
    public static String format(String str, int length, int alignment) {
        char[] arr = new char[length];
        if(length < str.length()) {
            return str.substring(0, length);
        } else {
            Arrays.fill(arr, ' ');
        }

        if(alignment == 0) {
            System.arraycopy(str.toCharArray(), 0, arr, 0, str.length());
            // arr[i] = str.charAt(i);
        } else if (alignment == 1) {
            // 어디서부터 붙여넣기 할 건지 이게 너무 궁금했는데 이렇게 하면 됨 !!!
            System.arraycopy(str.toCharArray(), 0, arr, (length - str.length()) / 2, str.length());
        } else if (alignment == 2) {
            System.arraycopy(str.toCharArray(), 0, arr, (length - str.length()), str.length());
        }

        String result = "";
        for(char a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "가나다";

        System.out.println(format(str,7,0));    // 왼쪽 정렬
        System.out.println(format(str,7,1));    // 가운데 정렬
        System.out.println(format(str,7,2));    // 오른쪽 정렬
    }
}
