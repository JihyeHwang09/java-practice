import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
TreeSet도 HashSet과 같이 중복된 데이터를 저장할 수 없고, 입력한 순서대로 값을 저장하지 않는다.
차이점은 TreeSet은 기본적으로 오름차순으로 데이터를 정렬한다는 점이다. (입력한 순서대로가 X)
 */
public class TreeSetEx01 {
    public static void main(String[] args) {
      Set<Integer> set =  new TreeSet<Integer>();

        // 데이터 추가
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(1);
        set.add(3);

        Iterator<Integer> it = set.iterator(); // 반복자 생성

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----------");

        Set<String> ts =  new TreeSet<String>();
        ts.add("a");
        ts.add("a");
        ts.add("c");
        ts.add("b");
        ts.add("d");
        ts.add("c");

        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
/*
실행결과:
1
2
3
4
----------
a
b
c
d

-> 중복을 허용하지 않고 오름차순으로 데이터를 저장하는 것을 알 수 있다.
 */