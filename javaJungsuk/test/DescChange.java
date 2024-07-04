package javaJungsuk.test;

import java.util.Arrays;
import java.util.Collections;
// reverse()는 StringBuilder에서만 사용 가능 (String X)
//        StringBuilder builder = new StringBuilder(s1);  // String -> StringBuilder 클래스로 변함
//        builder.reverse();
//        return Long.parseLong(builder.toString());
//        System.out.println("reverse : " + builder);
public class DescChange {
    public static void main(String[] args) {
        solution(12345);
        System.out.println(solution(12345));
    }
    // 함수 solution은 정수 n을 매개변수로 입력받습니다.
    // n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
    public static long solution(long n) {
        String stringNum = n+"";
        String arr[] = stringNum.split("");
        Arrays.sort(arr,Collections.reverseOrder());

        String str ="";
        for(int i = 0; i<arr.length; i++){
            str += arr[i];
        }

        return Long.parseLong(str);
    }
}
