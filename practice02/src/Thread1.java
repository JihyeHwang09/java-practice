/*
## Synchronized 키워드를 활용한 동기화
> 동기화란 여러 개의 쓰레드가 한 개의 자원을 사용하고자 할 때,
> 해당 쓰레드를 제외한 나머지 쓰레드는 접근을 못하도록 막는 것을 의미한다.

- 예제는 각 쓰레드가 공통 자원을 사용하는데 있어서 순차적으로 한 번씩 사용해야 하는 자원에 대해 접근한다고 가정을 했다.


- 프로그램은 thread1, thread2, thread3가 Resource 객체의 Resource_index를 0번부터 차례대로 호출해서 사용하려고 한다.
- 한 번 사용하고나면, Resource_index를 1 증가시킨다.
- 동기화되지 않은 상태이며, 결과를 먼저 보자.
- 0번째 자원은 여러 번 사용되었을 뿐만 아니라, 순차적으로 자원을 사용하지도 못하고 있다.
*/


class ThreadTest {
    public static void main (String args[]) throws InterruptedException {
        Resource resource = new Resource();
        Thread thread1 = new Thread (new Thread1(resource, "1번 쓰레드"));
        Thread thread2 = new Thread (new Thread1(resource, "2번 쓰레드"));
        Thread thread3 = new Thread (new Thread1(resource, "3번 쓰레드"));

        thread1.start(); //차례대로 쓰레드를 실행
        thread2.start();
        thread3.start();

//        1번 쓰레드=0번째 resource 사용
//        3번 쓰레드=0번째 resource 사용
//        3번 쓰레드=2번째 resource 사용
//        3번 쓰레드=3번째 resource 사용
//        1번 쓰레드=1번째 resource 사용
//        2번 쓰레드=0번째 resource 사용
//        2번 쓰레드=6번째 resource 사용
//        2번 쓰레드=7번째 resource 사용
//        1번 쓰레드=5번째 resource 사용

    }
}

public class  Thread1 implements Runnable {
    private Resource resource;
    private String name;

    public Thread1(Resource resource, String name) {
        this.resource = resource;
        this.name = name;
    }
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                resource.getResource(name); // 0번 index부터 차례대로 자원을 사용
            }
        } catch (Exception e) {}
    }
}


class Resource {
    private  int Resource_index = 0;
    // 동기화
    // 이번에는 한 번 사용된 자원은 재사용되지 않았고, 순차적으로 잘 사용하고 있다.
    public synchronized void getResource (String name) {
        System.out.println(name + "=" + Resource_index + "번째 resource 사용"); // 자원을 사용했다고 가정
        Resource_index++; // 다음 자원의 index
    }
}
