public class Car {
    String color; // 색상
    String gearType; // 변속기 종류- auto(자동), manual(수동)
    int door; // 문의 개수

//   Car () { // 생성자
//        color = "white";
//        gearType = "auto";
//        door = 4;
//    }
// 위 생성자 코드를 재사용성을 높인 코드로 바꾸면, 아래와 같다.
    Car () {
        // Card ("white", "auto", 4);
         this ("white", "auto", 4);
    }



    Car (String c, String g, int d) { // 생성자
        color = c;
        gearType = g;
        door = d;
    }
    // 위의 생성자 코드를 참조변수 this를 사용해서 변경
    // 인스턴스변수와 지역변수를 구별하기 위해 참조변수 this를 사용했다.
    // 생성자에서 참조변수를 매개변수로 받아서 인스턴스변수들의 값을 복사한다.
    Car (String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
        }

    Car (Car c) { // 인스턴스의 복사를 위한 생성자
        // 똑같은 속성값을 갖는 독립적인 인스턴스가 하나 더 만들어진다.
//        color = c.color;
//        gearType = c.gearType;
//        door = c.door;
        // this를 사용한 코드로 바꾸면, 아래와 같다.
        this(c.color, c.gearType, c.door);
    }
}

class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1); // Car(Car c)를 호출
    }
}

