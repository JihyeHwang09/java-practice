/*
SRP- 단일 책임 원칙
모든 객체는 하나의 책임만을 가지면 객체가 제공하는 서비스는 하나의 책이믕ㄹ 수행하는데 집중되어야 한다.
-> 즉, 어떤 클래스를 변경하는 이유는 오직 하나 뿐이어야 한다.
 */

// 단일 책임 원칙이 잘 지켜지지 않는 경우는 분기 처리를 위한 if문으로 코드를 보도록 하자.
//public class Person {
//    public String job;
//    public Person(String job) {
//        this.job = job;
//    }
//
//    public void Work () {
//        if (job.equals("programmer")) {
//            System.out.println("코딩하다");
//        }
//        else if (job.equals("teacher")) {
//            System.out.println("수업을 하다");
//        }
//    }
//}


//public abstract class Person {
//    abstract public void Work();
//}
//
//class Programmer extends Person {
//    public void Work() {
//        System.out.println("개발을 하다");
//    }
//
//}
//
//class Teacher extends Person {
//    public void Work () {
//        System.out.println("학생을 가르치다");
//    }
//}
//
//
//
//
//class PersonTest {
//    public static void main(String args[]) {
//        Person person1 = new Programmer();
//        person1.Work();
//    }
//}



/*
### ISP - 인터페이스 분리 법칙
클라이언트는 자신이 사용하지 않는 메서드의 의존 관계를 맺어서는 안된다.

ISP 원칙을 적용하는 방법으로 Person을 클래스로 분리하는 게 아니라,
인터페이스를 통해 역할을 구분하는 방식이다.

인터페이스 분리 원칙을 이야기할 때 함께 등장하는 원칙 중 하나로 인터페이스 최소주의 원칙이다.
-> 즉, 상위 클래스는 풍부할수록 좋고, 인터페이스는 작을수록 좋다.
 */

abstract class Person {
    abstract public void Work();
}
class Programmer extends Person {
    public void Work () {
        System.out.println("개발을 하다");
    }
    public void Eating () {
        System.out.println("먹다");
    }
    public void Sleeping () {
        System.out.println("자다");
    }
}

class Teacher extends Person {
    public void Work () {
        System.out.println("학생을 가르치다");
    }
    public void Eating () {
        System.out.println("먹다");
    }
    public void Sleeping () {
        System.out.println("자다");
    }

}
/*
소스를 살펴보면, rogrammer와 Teacher에는 '먹다'와 '자다' 메서드가 둘다 구현되어 있다.
'먹다'와 '자다'는 사람으로서 공통적으로 가지는 기능으로 상위 클래스인 Person 클래스에서 구현을 하고
하위 클래스에서는 재사용 개념으로 쓰게 하면 더 좋은 설계가 된다는 것이다.
 */

public abstract class Person {
    abstract public void Work();

    public void Eating () {
        System.out.println("먹다");
    }
    public void Sleeping () {
        System.out.println("자다");
    }
}












