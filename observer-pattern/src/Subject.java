import java.util.Observer;

/*
 Observer 패턴에서는 갱신된 데이터를 알려주는 주체를 Subject라고 부르고,
 Subject가 발행(publish)하는 내용을 구독(subscribe)하는 주체들을 Observer라고 부른다.
 각각 이에 해당하는 인터페이스를 생성했다.
 */
public interface Subject {
    void registerObserver (Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

public interface Observer {
    void update(int home, int away);
}
/*
기존에 존재하던 Kfa, NaverApi,
 */

