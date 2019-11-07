import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx01 {
    public static void main(String[] args) {
        // key는 String 타입으로, value는 Integer 타입으로 지정
        Map<String, Integer> hm = new HashMap<String, Integer>();

        // put 메서드 이용 key와 value 추가
        hm.put("A", 90);
        hm.put("B", 80);
        hm.put("C", 80);
        hm.put("D", 60);
        hm.put("E", 60);

        // size 메서드 이용 저장된 객체 수 출력
        System.out.println("저장된 객체 수 : " + hm.size());
        // get 메서드로 특정 key에 해당하는 값 출력
        System.out.println("D의 값:" + hm.get("D"));
        // 동일한 key로 추가(기존 내용 삭제)
        hm.put("D", 40);
        System.out.println("----------------");
        // keySet 메서드를 이용해서, 저장된 모든 key 값을 Set 컬렉션에 저장
        Set<String> keys = hm.keySet();
        // 반복자 생성
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next(); // Set의 key값을 하나씩 key에 대입
            int value = hm.get(key);; // 해당 key에 해당하는 value 대입 / 오토 언박싱

            System.out.println(key + ":" + value);
        }
    }
}
