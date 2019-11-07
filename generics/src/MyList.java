import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

// 제네릭 클래스
 public class MyList<T> {
    private T[] ts;
    private int cursor;

    @SuppressWarnings("unchecked")
    MyList() {
        this.ts = (T[]) new Object[10];
    }

    void add(T t) {
        this.ts[cursor++] = t;
    }
    T get(int idx) {
        return this.ts[idx];
    }
}

// 제네릭 메서드
class MyList2 {
    private Object[] ts;
    private int cursor;

    MyList2() {
        this.ts = new Object[10];
    }

    <T> void add(T t) {
        this.ts[cursor++] = t;
    }

    @SuppressWarnings("unchecked")
    <T> T get(int idx) {
        return (T) this.ts[idx];
    }
}

class MyList3 {
    static int numElementsInCommon (Set s1, Set s2) {
//        ...
    } // 동작은 타입이 안정적이지 못하다.

    static int numElementsInCommon (Set<?> s1, Set<?> s2 ) {
//        ...
        // 와일드카드를 사용함으로써 타입에 안정적이다.
    }
 }















