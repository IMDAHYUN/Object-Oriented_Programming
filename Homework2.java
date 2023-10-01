/* 문제 : 
 - Student 클래스를 코드로 구현하세요. 이 클래스는 학번, 이름, 전공, 전화번호를 속성으로 가지고
 메소드로는 각 멤버 변수의 값을 읽는 getter와 설정하는 setter를 구현합니다. (ex : setMajor(), getMajor())
 - 3명의 학생 정보를 키보드로부터 입력받아 Student 객체를 생성하고,
 입력이 끝나면 입력된 학생 정보를 모두 출력하는 Homework2 클래스를 작성하세요.
 - 파일명은 Homework2.java로 지정하여 github에 업로드
 */

 /*요구사항 :
  - 학번, 이름, 전공, 전화번호 순서로, 띄어쓰기로 구분하여 학생 정보 입력
  - 전공과 이름은 문자열로, 학번과 전화번호는 숫자로 저장 (즉, 전화번호 입력 시 '-(하이픈)'이 없고, 맨앞 0은 삭제)
  다만 전화번호는 출력 시 010-xxxx-xxxx 형태로 앞자리 0을 복구하고 중간중간 '-'을 삽입
  */

  /*문자열 관련 힌트
   - 문자열 -> 정수 : Interger.parselnt(숫자로_구성된_문자열) 또는 Long.parseLong(숫자로_구성된_문자열)
   - 정수 -> 문자열 : Interger.toString(숫자) 또는 Long.toString(숫자)
   */

   /*
import java.util.Scanner;

class Student {
    int academicNumber;
    String name;
    String major;
    int phoneNumber;

    int getAcademicNumber() {
        return academicNumber;
    }

    void setAcademicNumber(int a) {
        academicNumber = a;
    }

    String getName() {
        return name;
    }

    void setName(String n) {
        name = n;
    }

    String getMajor() {
        return major;
    }

    void setMajor(String m) {
        major = m;
    }

    int getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(int p) {
        phoneNumber = p;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studentInformation = new Student[3];

        for (int i = 0; i < 3; i++) {
            studentInformation[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요.: ");
            int academicNumber = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            int phoneNumber = sc.nextInt();

            studentInformation[i].setAcademicNumber(academicNumber);
            studentInformation[i].setName(name);
            studentInformation[i].setMajor(major);
            studentInformation[i].setPhoneNumber(phoneNumber);
        }

        System.out.println("첫번째 학생: " + studentInformation[0].getAcademicNumber() + " " + studentInformation[0].getName() + " "
                + studentInformation[0].getMajor() + " " + regexPhoneNumber(studentInformation[0].getPhoneNumber()));
        System.out.println("두번째 학생: " + studentInformation[1].getAcademicNumber() + " " + studentInformation[1].getName() + " "
                + studentInformation[1].getMajor() + " " + regexPhoneNumber(studentInformation[1].getPhoneNumber()));
        System.out.println("세번째 학생: " + studentInformation[2].getAcademicNumber() + " " + studentInformation[2].getName() + " "
                + studentInformation[2].getMajor() + " " + regexPhoneNumber(studentInformation[2].getPhoneNumber()));
    }

    public static String regexPhoneNumber(int p) {
        String phoneNumberStr = "0" + Integer.toString(p);
        String phoneNumberHyphen = phoneNumberStr.substring(0, 3) + "-" + phoneNumberStr.substring(3, 7) + "-" + phoneNumberStr.substring(7, 11);
        return phoneNumberHyphen;
    }
}*/

import java.util.Scanner;

class Student{
    int academicNumber;
    String name;
    String major;
    int phoneNumber;

    int getAcademicNumber() {
        return academicNumber;
    }

    void setAcademicNumber(int a){
        academicNumber = a;
    }

    String getName(){
        return name;
    }

    void setName(String n){
        name = n;
    }

    String getMajor(){
        return major;
    }

    void setMajor(String m){
        major = m;
    }

    int getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(int p){
        phoneNumber = p;
    }
}

class Homework2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] studentInformation = new Student[3];
        
        for (int i = 0;i < 3;i++){
            studentInformation[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요.: ");
            int academicNumber = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            int phoneNumber = sc.nextInt();

            studentInformation[i].setAcademicNumber(academicNumber);
            studentInformation[i].setName(name);
            studentInformation[i].setMajor(major);
            studentInformation[i].setPhoneNumber(phoneNumber);
        }

        System.out.println("첫번째 학생: "+studentInformation[0].getAcademicNumber()+" "+studentInformation[0].getName()+" "
        +studentInformation[0].getMajor()+" "+regexPhoneNumber(studentInformation[0].getPhoneNumber()));
        System.out.println("두번째 학생: "+studentInformation[1].getAcademicNumber()+" "+studentInformation[1].getName()+" "
        +studentInformation[1].getMajor()+" "+regexPhoneNumber(studentInformation[1].getPhoneNumber()));
        System.out.println("세번째 학생: "+studentInformation[2].getAcademicNumber()+" "+studentInformation[2].getName()+" "
        +studentInformation[2].getMajor()+" "+regexPhoneNumber(studentInformation[2].getPhoneNumber()));
        }
        public static String regexPhoneNumber(int p) {
            String phoneNumberStr = "0" + Integer.toString(p);
            String phoneNumberHyphen = phoneNumberStr.substring(0, 3) + "-" + phoneNumberStr.substring(3, 7) + "-" + phoneNumberStr.substring(7, 11);
            return phoneNumberHyphen;
    }
}
