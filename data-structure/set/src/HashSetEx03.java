import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
/*
 데이터를 키보드로 입력받아서 객체를 HashSet에 저장하고,
 Iterator를 통해 저장된 객체를 출력하는 조금 더 응용된 예제
 */

class MemberInfo {
    // private 필드
    private String name;
    private String id;

    public String getName() {return name;} // 저장된 name값 리턴
    public void setName(String name) {this.name = name; }// name값 설정
    public String getId() {return id;}// 저장된 id값 리턴
    public void setId(String id) {this.id = id;} // id값 설정
}

public class HashSetEx03 {
    public static void main(String[] args) {
        MemberInfo mm; // MemberInfo 객체 선언
        Set<MemberInfo> set = new HashSet<MemberInfo>(); // HashSet 생성
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
        do {
            mm = new MemberInfo(); // 반복될 때마다 인스턴스 생성(반복문 외부에서 new 연산자 사용 시 1개의 객체만 저장됨)
            System.out.println("이름 입력: ");
            String name = sc.next();
            System.out.println("아이디 입력: ");
            String  id = sc.next();

            mm.setName(name); // 위에서 입력한 name 값 설정
            mm.setId(id); // id 값 설정

            set.add(mm); // set에 mm객체 저장

            System.out.println("계속 Y, 정지 N");
            String yn = sc.next();

            if (yn.equals("y") || yn.equals("Y")) {
                continue; // 소문자 y나, 대문자 Y 입력시 반복문 계속
            } else { // 다른값 입력시 반복문 종료
                break;
            }
        } while (true);

        System.out.println("---------------");

        Iterator<MemberInfo> it = set.iterator(); // Iterator 생성
        while (it.hasNext()) {

        mm = it.next();
        System.out.println("이름: " + mm.getName());  // getName 메서드 호출 (name 값 리턴)
        System.out.println("아이디: " + mm.getId());  // getId 메서드 호출(id 값 리턴)
        System.out.println("---------------");
        }
    }
}
