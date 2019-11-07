import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
- Set은 객체(데이터)를 중복해서 저장할 수 없다.
- 저장된 객체(데이터)를 인덱스로 관리하지 않는다. -> 저장 순서가 보장되지 않는다.
- 수학의 집합과 비슷하다.
- ex) Set 컬렉션을 구현하는 대표적인 클래스들: `HashSet`, `TreeSet`, `LinkedHashSet` 등
    - 만약 요소의 저장 순서를 유지해야 한다면, JDK 1.4부터 제공하는 `LinkedHashSet` 클래스를 사용
- 주요 메소드: add, iterator, size, remove, clear
- Set의 데이터를 검색하는 방법
: iterator() 메서드로 Iterator(반복자)를 생성하고, 데이터를 가져와야 한다.
    (이유: 인덱스로 객체를 관리하지 않기 때문에)

 */
public class HashSetEx01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("4");
        set.add("5");
        set.add("six");

        System.out.println("저장된 데이터 수" + set.size()); // 데이터 수 출력

        Iterator<String> it = set.iterator(); // Iterator(반복자) 생성

        while (it.hasNext()) { // hasNext(): 데이터가 있으면 true 없으면 false
            System.out.println(it.next());
        }

        System.out.println("----------------------------");

        set.remove("three");  // 데이터 제거
        System.out.println("저장된 데이터 수" + set.size());  // 저장된 데이터 수 출력
        it = set.iterator(); // 반복자 재생성(위의 반복문에서 next 메서드로 데이터를 다 가져왔기 때문에 재생성을 해야함

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------------------");
    }
}
/*
출력 결과:
저장된 데이터 수6
six
4
5
one
two
three
----------------------------
저장된 데이터 수5
six
4
5
one
two
----------------------------
 */
/*
데이터의 순서가 보장되지 않고, 데이터의 중복을 허용하지 않는 것을 알 수 있다.
데이터를 가져오기 위해서 반복자(iterator)를 이용하였다.
 */























