//변수관련 한번에 모아보기
public class Variable {
    public static void main(String[] args) {
        System.out.println(10);
        // 변수 선언과 초기화
        int a = 1;
        int b;
        int c, d;
        int e = 3, f = 5;
        a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);
        //System.out.println(e); 초기화 하지 않으면 컴파일 에러 발생

        //변수 타입(기본)
        int i = 100; //정수
        double dou = 100.0; //실수
        boolean boo = true; //true, false
        char ch = 'a'; // 문자 하나
        String str = "abc"; // 문자열
        // 직접 적은 값을 리터럴 이라고 함

        //변수 타입 심화
        //정수
        byte by = 127; //-128 ~ 127
        short sh = 32767; // -32,768 ~ 32,767
        int in = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long lon = 9223372036854775807L;

        //실수
        float fl = 10.0f;
        double doub = 10.0;

        /* 변수 명명 규직
        * 1. 숫자로 시작할 수 없음
        * 2. 공백이 포함될 수 없음
        * 3. 예약어 금지
        * 4. 영문자, 숫자, $,_ 만 사용가능
        * 5. 낙타표기법(관례): 시작은 소문자, 여러단어로 이뤄지면 두번째 단어부터 시작은 대문자로ㅗ 시작
        */

        /* 자바 관례
        * 1. 클래스의 처음은 대문자로 시작
        * 2. 상수는 모두 대문자
        * 패키지는 모두 소문자
        */
    }
}
