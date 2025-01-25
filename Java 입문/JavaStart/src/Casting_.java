public class Casting_ {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;
        //int < long < double
        //큰범위 = 작은범위 대입 : 자동 형변환
        doubleValue = intValue;
        //doubleValue = (double) intValue; //형 맞추기
        //doubleValue = (double) 10; //변수 값 읽기
        //doubleValue = 10.0; //형변환

        //작은범위 = 큰 범위 : 명시적 형변환
        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //형변환

        //오버플로우
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        intValue = (int) maxIntValue; //정상출력
        intValue = (int) maxIntOver; //-2147483648 - 오버플로우 즉, 정상적인 표현 불가

        /**
         * 형 변환 계산
         *
         * 1. 같은 타입끼리는 같은 타입의 결과
         * 2. 서로 다은 타입은 큼 범위로 자동 형변환
         *
         * */



    }
}
