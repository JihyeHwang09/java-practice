import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
Vector
- ArrayList와 동일한 구조를 갖는다.
- 차이점: Vector는 자동 동기화를 보장하므로 멀티 스레드 환경에서 안정적으로 사용이 가능하다.
    - But, 단일 스레드에서는 ArrayList가 성능이 더 좋다.
-Vector를 생성하는 방법
```java
List<E> list = new Vector<e>([초기용량,</e> 증가용량]);
```
- 초기용량과 증가용량을 생략하면 기본 값인 `0`으로 설정된다.
아래 예제는 키보드로 회원정보를 입력받고. 데이터를 저장해 두었다가 출력하는 예제이다.
 */
class MemberInfo {
    private int no;
    private String name;
    private String phoneNumber;
    private String address;

    // getter(저장된 데이터를 리턴)
    public int getNo() {return no;}
    public String getName() {return name;}
    public String getPhoneNumber() {return phoneNumber;}
    public String getAddress() {return  address;}
    // setter(필드값 세팅) 메소드
    public void setNo(int no) {this.no = no;}
    public void setName (String name) {this.name = name;}
    public void setPhoneNumber (String phoneNumber) {this.phoneNumber = phoneNumber;}
    public void setAddress (String address) {this.address = address;}
}

public class VectorEx02 {
    public static void main(String[] args) {
       List<MemberInfo> list = new Vector<MemberInfo>();
                MemberInfo mi = new MemberInfo();
       do {
           Scanner sc = new Scanner(System.in);
           System.out.println("회원번호 입력: ");
           int no = sc.nextInt();
           System.out.println("이름 입력: ");
           String name = sc.next();
           System.out.println("핸드폰 번호 입력: ");
           String phoneNumber = sc.next();
           System.out.println("주소 입력: ");
           String address = sc.next();

           MemberInfo mm = new MemberInfo();
           mm.setNo(no); // no 셋팅
           mm.setName(name);// name 셋팅
           mm.setPhoneNumber(phoneNumber); // phoneNumber 셋팅
           mm.setAddress(address); // address 셋팅

           list.add(mm); // list에 객체 저장

           System.out.println("계속은 y, 아니면 아무키 입력");
           String yn = sc.next();

           if(yn.equals("y") || yn.equals("Y")) {
               continue;
           } else {
               break;
           }
       } while (true);

       for (int i = 0; i < list.size(); i++) {
           MemberInfo m = list.get(i); // list 인덱스에 저장된 객체의 참조값 저장

           // 해당 데이터 출력
           System.out.println("회원 번호 : " + m.getNo());
           System.out.println("이름  : " + m.getName());
           System.out.println("핸드폰 번호 : " + m.getPhoneNumber());
           System.out.println("주소 : " + m.getAddress());

       }
    }
}
