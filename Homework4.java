/*
5장 개념 확인 과제 - 최대공약수 계산 함수
-최대공약수는 뺄셈 대신 나머지 연산을 이용해 구할 수도 있습니다.
아래 알고리즘은 재귀호출을 이용하도록 구현하고, 이를 다시 반복문으로도 바꿔보세요.
-함수의 이름과 형태는 앞의 소개한 것과 동일하게 int gcd(int, int)로 하며, 결과도 똑같이 나와야 합니다.
-콘솔에서 두 수를 입력받아 최대공약수를 출력
-파일명은 Homework4.java로 지정하여 github에 업로드

알고리즘 :
1. 두 개의 정수 m, n을 매개변수로 받음. (m과 n은 모두 1 이상의 정수이고, m과 n 사이에는 최대공약수가 반드시 존재한다고 가정)
2. n이 0이라면 m을 반환하고 함수 실행 종료
3. m이 n으로 나눠지면(나머지가 0이면), n을 반환하고 함수 실행 종료
4. m을 n으로 나눈 나머지를 새로 m에 저장한 후에 m과 n을 바꾸고 2번으로 돌아감.
 */

import java.util.Scanner;
public class Homework4 {
    int gcd(int m, int n){
        if (n==0) return m;
        if (m%n == 0) return n;
        return gcd(n, m%n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Homework4 recursive = new Homework4();
        System.out.print("두 수를 입력하세요. : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d, %d의 최대공약수는 %d입니다.",a, b, recursive.gcd(a, b));
    }
}
