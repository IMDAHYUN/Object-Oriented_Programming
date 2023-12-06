
/*문제
        – Homework8.java과 같이, ID와 비밀번호 쌍을 해시맵에 저장하고, 이를 이용하여 로그인 기능을 구현
        – 단, db.txt 파일로부터 ID와 비밀번호 쌍을 입력받음
        • 요구사항
        – 입력된 ID가 존재하지 않으면 다시 입력하라는 메시지 출력
        – 입력된 ID가 존재하면, 비밀번호를 입력받고 일치 여부 확인
        – ID와 비밀번호 뒤에 입력된 공백은 무시 (String 클래스의 trim() 함수 사용)
        – db.txt에 저장된 ID와 비밀번호 쌍은 아래와 같으며, 상대경로 사용
 */
import java.io.*;
import java.util.*;

public class Homework9 {
    public static void main(String[] args){
        HashMap<String, String> loginInfo = new HashMap<>();
        try {
                Scanner sc = new Scanner(new File("db.txt"));
                while (sc.hasNext()){
                    String line = sc.nextLine();
                    String[] parts = line.split("\\s+");
                    if (parts.length == 2) {
                        loginInfo.put(parts[0], parts[1]);
                    }
                }
            } catch(FileNotFoundException e){
            System.out.println("db.txt 파일이 존재하지 않습니다.");
        }

        boolean match = true;
        Scanner scanner = new Scanner(System.in);
        while(match){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = scanner.nextLine().trim();

            if(!loginInfo.containsKey(inputId)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");

            } else {
                System.out.print("password : ");
                String inputPassword = scanner.nextLine().trim();
                String password = loginInfo.get(inputId);
                if(password.compareTo(inputPassword) == 0){
                    System.out.println("id와 비밀번호가 일치합니다.\n");
                    match = false; //종료
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }
            }
        }
    }
}
