import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/*
 중복된 데이터는 제외하고, 입력된 순서로 값을 출력하게 된다.(크기 비교후 정렬하는게 X)!!
 */
public class LinkedHashSetEx01 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("1");
        set.add("1");
        set.add("two");
        set.add("3");
        set.add("4");
        set.add("five");
        set.add("4");
        set.add("3");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------------");

        LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
        lh.add(1);
        lh.add(1);
        lh.add(4);
        lh.add(2);
        lh.add(5);
        lh.add(3);
        Iterator<Integer> it2 = lh.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
