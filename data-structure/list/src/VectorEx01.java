import java.util.ArrayList;
import java.util.List;

/*
- 제네릭 타입을 클래스 타입으로 지정하고, 데이터를 저장하고 갖고 오는 방법이다.
기본적인 방법은 똑같다.
-  Avengers 자료형에 ArrayList의 인덱스에 저장된 참조값을 얻어오고,
해당 참조값으로 해당되는 객체의 데이터(name, id, age)를 구해와야 한다.
 */
class  Avengers { // Avengers 클래스 정의
    // 필드
    String name;
    String id;
    int age;

    public Avengers(String name, String id, int age) { // 생성자 초기화
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

public class VectorEx01 {
    public static void main(String[] args) {
        List<Avengers> list = new ArrayList<Avengers>();
        // 객체 생성 및 저장
        list.add(new Avengers("토니 스타크", "ironman", 53));
        list.add(new Avengers("피터 파커", "spiderman", 25));
        list.add(new Avengers("브루스 배너", "Hulk", 50));

        for (int i = 0; i < list.size(); i++) { // 반복문
            Avengers av = list.get(i); // ArrayList의 인덱스에 저장된 참조값을 얻어온다.
            System.out.println("이름 : " + av.name);
            System.out.println("아이디 : " + av.id);
            System.out.println("나이 : " + av.age);
            System.out.println("--------------------");
        }
    }
}
