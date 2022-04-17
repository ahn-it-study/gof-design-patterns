package ch5_Singleton;

/**
 * 멀티스레딩이 해결되지 않은 싱글톤 생성 방식
 */
public class Singleton_step1_with_problem {

    /**
     * 유일한 인스턴스를 저장하기 위한 정적 변수
     */
    private static Singleton_step1_with_problem uniqueInstance;

    /**
     * 생성자를 private으로 선언했기 때문에 해당 클래서에서만 인스턴스를 만들 수 있다
     */
    private Singleton_step1_with_problem() {}

    public static Singleton_step1_with_problem getInstance() {
        if (uniqueInstance == null) uniqueInstance = new Singleton_step1_with_problem();
        return uniqueInstance;
    }

}
