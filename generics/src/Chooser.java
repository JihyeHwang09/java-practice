import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
    // 배열로 선언한 경우
    private final T[] choiceArray;

    public Chooser (Collection<T> choices) {
        choiceArray = (T[]) choices.toArray();
    }

    public Object choose() {
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }
}


// 컬렉션 사용 예시
class Chooser<T> {
    private final List<T> choiceArray;

    public Chooser(Collection<T> choices) {

    }
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get()
    }
}
