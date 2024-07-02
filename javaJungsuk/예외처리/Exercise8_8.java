package javaJungsuk.예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8_8 {
    public static void main(String[] args) {
        // 1 ~ 100 사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0;  // 사용자 입력을 저장할 공간
        int count = 0;  // 시도 횟수를 세기 위한 변수

        do {
            count ++;
            System.out.println("1과 100 사이의 값을 입력하세요.");

            try {
                input = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("🤦🏻‍ 이럴수가 ! 숫자를 입력해주세요.");
                continue; // continue를 써주지 않으면 더 큰 수를 입력하세요가 출력되어버림
            }

            if(answer > input) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("정답 🫶🏻");
                System.out.println("시도 횟수는 " + count + "번 입니다.");
                break;
            }
        } while (true);     // 무한반복문
    }
}
