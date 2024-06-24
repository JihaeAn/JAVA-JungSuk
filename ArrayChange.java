import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayChange {
    public static void main(String[] args) {

        System.out.println(solution(6789));
    }
        public static int[] solution(long n) {
            // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

            String s1 = n + "";
            int answer [] = new int [s1.length()];

            for(int i = 0; i < answer.length; i++){
                answer[i] = Integer.parseInt(s1.substring(s1.length()-i -1, s1.length()-i));
                System.out.println(answer[i]);
            }
            return answer;
        }
}
