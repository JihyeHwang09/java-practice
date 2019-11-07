public abstract class Person1 {
    abstract void introduce();
}

class Honggildong extends Person1 {
    public void introduce() {
        System.out.println("저는 홍길동입니다!!");
    }
}

class Hanmi extends Person1 {
    public void introduce() {
        System.out.println("저는 한미입니다.");
    }
}

class Person1Test {
    public static void main (String args[]) {
        Person1 person1 = new Honggildong();
        Person1 person2 = new Hanmi();

        person1.introduce();
        person2.introduce();
    }
}


