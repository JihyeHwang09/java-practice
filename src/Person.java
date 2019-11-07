class Person {
    private int age;

    public Person (int age) {
        this.age = age;
    }
}
/*
생성자로 생성하는 Person 클래스이다.
팩토리 메서드를 Person 에다가 추가할수도있지만 스프링은 외부에서 객체를 생성하도록 하는 팩토리 인터페이스를 제공한다.
 */


interface FactoryBean<T> {
    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}

//해당 인터페이스를 구현하는 팩토리 클래스를 만들어 Person bean 을 제공할 수 있다.


class PersonBean implements FactoryBean<Person> {
    private Person person;
    private int age;

//    getObject: 실제 객체를 반환
    @Override
    public Person getObject () throws Exception {
        return new Person(29);
    }
//    getObjectType: 반환하는 객체의 타입을 반환
    @Override
    public Class<?> getObjectType () {
        return Person.class;
    }
//    isSingleton: 반환하는 객체가 싱글톤인지 여부
//    getObject를 호출할 때마다 new로 신규 객체를 만들기 때문에
//      isSingleton()는 false를 반환한다.
    @Override
    public boolean isSingleton () {
        return true;
    }
}


