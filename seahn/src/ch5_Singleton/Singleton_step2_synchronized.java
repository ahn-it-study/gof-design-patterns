package ch5_Singleton;

public class Singleton_step2_synchronized {

    /**
     * 유일한 인스턴스를 저장하기 위한 정적 변수
     */
    private static Singleton_step2_synchronized uniqueInstance;

    /**
     * 생성자를 private으로 선언했기 때문에 해당 클래서에서만 인스턴스를 만들 수 있다
     */
    private Singleton_step2_synchronized() {}

    /**
     * synchronized 동기화 처리 -> 멀티스레드 해결
     */
    public static synchronized Singleton_step2_synchronized getInstance() {
        if (uniqueInstance == null) uniqueInstance = new Singleton_step2_synchronized();
        return uniqueInstance;
    }
}
