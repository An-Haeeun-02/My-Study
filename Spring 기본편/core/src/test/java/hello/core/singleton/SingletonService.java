package hello.core.singleton;

public class SingletonService {

    private static SingletonService instance = new SingletonService(); // 자바를 싱핼 할 때 자기자신을 선언함

    public static SingletonService getInstance() {
        return instance;
    }//이 객체 인스컨스가 필요하면 오직 이 메서드를 통해서만 조회랄 수 있다.

    private SingletonService() {

    }// 이러면 외부에서 singletonService singletonService = new singletonService(); 이런거 사용불가. 왜? private 니까

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
