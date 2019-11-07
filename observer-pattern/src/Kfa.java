import java.util.ArrayList;
import java.util.List;

public class Kfa implements Subject{
    private List<Observer> observers;
    private int home, away;

    public Kfa() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(home, away));
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setHome(int home) {
        this.home = home;
    }

    public void setAway(int way) {
        this.away = away;
    }



//    private NaverApi naverApi;
//    private DaumApi daumApi;
//    // 골득점 이벤트가 발생하면 Kfa 객체의 goal() 메서드가 호출된다.
//    // goal 메서드는 각 포털사의 update() 메서드를 호출해서 데이터를 갱신한다.
//    public void goal(int home, int away) {
//        naverApi.update(home, away);
//        daumApi.update(home, away);
//    }
}

public class NaverApi implements Observer{
//    public void update(int home, int away) {
//        System.out.println(String.format("naver &%d:%d", home, away));
//    }
    private Kfa kfa;

    public NaverApi(Kfa kfa) {
        this.kfa = kfa;
        this.kfa.registerObserver(this);
    }

    @Override
    public void update(int home, int away) {
        System.out.println(String.format("naver &%d:%d", home, away));
    }
}

public class DaumApi implements Observer {
//    public void update(int home, int away) {
//        System.out.println(String.format("daum %d %d", home, away));
//    }
    private Kfa kfa;

    public NaverApi(Kfa kfa) {
        this.kfa = kfa;
        this.kfa.registerObserver(this);
    }

    @Override
    public void update(int home, int away) {
        System.out.println(String.format("naver &%d:%d", home, away));
    }
}