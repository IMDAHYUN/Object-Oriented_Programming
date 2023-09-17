import java.util.Scanner;

/* #문제 : 
 - 사용자로부터 5개 정수를 입력받을 때까지 프로그램을 실행하면서, 
 매 숫자 입력 후에 그때까지 입력된 모든 정수값들의 합을 계산해서 출력하는 프로그램을 작성하세요.
 -class의 이름은 Homework1로, 파일명은 Homework1.java로 지정하여 github에 업로드
 (권장사항 : 다른 프로젝트의 파일들과 혼용되지 않게 별도의 과목 repository 생성)
 */

 /* #요구사항 :
 정수 외에 다른 값은 입력하지 않는다고 가정.
 반복문을 사용하지 않아도 5번의 입력 함수 호출로 풀 수 있지만, 반복문을 사용해도 무방.
  */
class Homework1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;

        for(int i = 0;i < 5;i++){
            System.out.printf("%d번째 숫자를 입력하세요. : ", i+1);
            arr[i] = sc.nextInt();
            sum += arr[i];
            System.out.printf("지금까지 입력한 숫자의 총합은 %d입니다.\n\n", sum);
        }
    }
}