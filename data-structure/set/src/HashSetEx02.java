import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* HashSet에 객체를 저장하고 가져오는 방법
: Member 클래스의 생성자를 통해 필드를 초기화하고,
 객체를 HashSet에 저장하여 값을 가져오는 방법
*/
class Member { // Member 클래스
    // 필드
    String name;
    String id;

    public Member (String name, String id) { // 생성자
    // 필드값 초기화
    this.name = name;
    this.id = id;
    }
}

public class HashSetEx02 {
    public static void main (String[] args) {
        Set<Member> set = new HashSet<Member>(); ; // 제네릭 타입이 Member인 HashSet 생성

        set.add(new Member("토니 스타크", "ironman")); // 객체 추가
        set.add(new Member("피터 파커", "spierman")); // 객체 추가

        Iterator<Member>  it = set.iterator(); // 반복자 생성

        while (it.hasNext()) {
            Member mb = it.next(); // set에 저장된 다음 객체의 참조값 저장(return the next element in the iteration)

            System.out.println("아이디: " + mb.id); // id 출력
            System.out.println("이름: " + mb.name); // name 출력
            System.out.println("----------------");
        }
    }
}
