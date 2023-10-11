/*문제
 * -몇 개의 정수를 입력받을 것인지 먼저 입력받고, 이 수만큼 추가로 정수를 입력받아 배열에 저장해주세요.
 * -입력이 끝나면 입력된 수들 중 최소값과 최대값을 출력해주세요.
 * -파일명은 Homework3.java로 지정하여 github에 업로드
 */

 /* 요구사항
  * -입력값은 항상 정수라고 가정
  * -정수들의 입력은 공백으로 구분한다고 가정
  */

  /*힌트
   * -배열의 크기를 입력받을 정수 개수로 지정
   * -최소값과 최대값을 저장할 두 변수의 값들은 모두 배열의 0번째 요소로 초기화
   * -이후 배열의 요소들을 탐색하면서, 최소값/최대값 변수들과 배열 요소의 값을 비교, 최소값/최대값을 갱신
   */

import java.util.Scanner;

class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 정수를 입력할 예정인가요? : ");
        int size = sc.nextInt();

        int[] number = new int[size];

        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int min = number[0];
        int max = number[0];

        for (int i = 1; i < size; i++) {
            if (max < number[i]) max = number[i];
            if (min > number[i]) min = number[i];
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}





