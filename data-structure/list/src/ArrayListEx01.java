import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 ArrayList는 List 인터페이스를 구현한 클래스이다.
설정된 저장 용량(capacity)보다 많은 데이터가 들어오면 자동으로 용량이 늘어난다.

- ArrayList를 생성하는 방법
```java
List<E> 객체명 = new ArrayList<E> ([초기 저장용량]);
```
- 초기 저장용량을 생략할 경우, 기본적으로 10의 저장용량을 갖는다.
- E는 제네릭 타입을 의미하는데 생략할 경우, Object 타입이 된다.
- Object는 모든 데이터 타입이 저장 가능하지만, **데이터를 추가하거나 검색할 때 형 변환**을 해야 한다.
자료구조에는 주로 동일한 데이터 타입을 저장하기 때문에 -> **제네릭 타입을 지정하고 사용하는 것이 좋다.**
- 기본적으로 데이터를 추가할 때는 **인덱스 순으로 자동 저장**된다.
 이때 중간에 데이터를 추가하거나 삭제할 경우에는 인덱스가 한 칸씩 뒤로 밀리거나 당겨진다.
 */
public class ArrayListEx01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("리스트1"); // 0번 index에 데이터 추가
        list.add("리스트2"); // 1번 index에 데이터 추가
        list.add("리스트3"); // 2번 index
        list.add("리스트4"); // 3번 index
        list.add(1, "리스트5"); //  1번 index에 데이터 추가(기존의 1번 이후의 인덱스들이 하나씩 뒤로 밀림)
        list.add("리스트6"); // 5번 index

        System.out.println(list.size());  // 저장된 데이터 용량 출력 : 6

        System.out.println(list.get(0)); // 0번 index 값 출력
        System.out.println(list.get(1)); // 1번 index 값 출력

        System.out.println();

        for (int i = 0; i < list.size(); i++) { // 반복문 이용 데이터 출력
            System.out.println(i + "번 인덱스 데이터: " + list.get(i));
        }
        System.out.println();

        list.remove(0); // 0번 index 삭제(하나씩 앞으로 당겨짐)
        list.remove("리스트5");  // 리스트5를 갖는 데이터 삭제(이후의 데이터들은 하나씩 앞으로 당겨짐)

        for (String value : list) { // for each 반복문 이용 데이터 출력
            System.out.println(value);
        }

        System.out.println();

        Iterator<String> elements = list.iterator();  // Iterator (반복자)

        // Iterator 이용 데이터 출력
        while (elements.hasNext()) { // hasNext : 데이터가 있으면 true, 없으면 false 리턴
            System.out.println(elements.next());  // next(): 다음 데이터 리턴
        }
    }
}
