/*
## 3. 사용자 예외 만들기
- 예외 클래스들의 최상위 클래스인 Exception 클래스를 상속받아 사용자 예외를 만들어 보자.
- 예외 발생시 출력되는 에러 보고 형식을 우리가 원하는 대로 처리하기 위해
또는 특정 사건에 대한 예외 상황을 모아서 한꺼번에 처리할 방법으로 사용하기 위해서 사용된다.
 */

class ExceptionExample {
    public static void main(String[] args) {
        int number[] = new int[5];

        try {
            sum(number);
        } catch (Exception e) {
            MyException em = new MyException("배열 인덱스 초과", e);
            System.out.println(em.getMessage());
        } finally {
            System.out.println("예외 발생 여부와 상관없이 저는 실행이 돼요");
        }
    }
    /*
    sum() 메서드에서 의도적으로 예외를 발생시키고 메인으로 처리를 전가하고 있다.
    메인의 catch 구문에서 예외처리 객체를 전달받아 직접 만든 Exception 객체를 생성하고 있다.
     */
    public static void sum(int[] number) throws Exception {
        {
            for (int i = 0; i < 5; i++) {
                number[i] = 1;
            }
        }
    }
 }
 class MyException extends Exception {
    private String msg;
    private Throwable cause;

    public MyException() {
        super("사용자 정의 Exception");
    }
    // Exception 클래스를 상속받고, 예외처리에서 쓰일 메세지와 예외 발생시 넘어온 예외 객체를 인자로하는
    // 상위 클래스의 생성자를 호출하는 생성자를 정의하고 있다.
    public MyException(String msg, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
        this.cause = cause;
    }
 }
