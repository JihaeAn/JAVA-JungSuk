package javaJungsuk.UtilClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise9_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start;
        int end;

        while (true) {
            try {
                System.out.println("시작 단의 정수를 입력해주세요.");
                start = sc.nextInt();
                System.out.println("끝 단의 정수를 입력해주세요.");
                end = sc.nextInt();

                if (start < 2 || start > 9 || end < 2 || end > 9) {
                    throw new Exception();
                }
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력해주세요.");
                sc.next();  // 초기화 !!!
                continue;
            } catch (Exception e) {
                System.out.println("2와 9 사이의 수를 입력해주세요.");
                continue;
            }
            break;
        }

        for(int i = start; i <= end; i++ ) {
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
