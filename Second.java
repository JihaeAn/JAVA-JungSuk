
import java.util.*;
public class Second {

        public int solution(int n) {
            int answer = 0;

            String str = Integer.toString(n);
             char[] chars = str.toCharArray();
             for(int i = 0; i < chars.length; i++){
                 int a = chars[i] - '0';
                 answer += a;
             }

            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("Hello Java");

            return answer;
        }

}
