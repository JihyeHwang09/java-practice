import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableEx01 {
    public static void main(String[] args) {
        Map<String, String> ht = new Hashtable<String, String>();
        ht.put("사과", "Apple");
        ht.put("복숭아", "Peach");
        ht.put("망고스틴", "Mangosteen");
        ht.put("석류", "Poemegranate");
        ht.put("딸기", "Strawberries");

        // entrySet 메서드 이용 Set 컬렉션에 key와 value 저장
       Set<Map.Entry<String, String>> fruits = ht.entrySet();
        // 반복자 생성
        Iterator<Map.Entry<String, String>> it = fruits.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
