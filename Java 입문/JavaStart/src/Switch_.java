public class Switch_ {
    public static void main(String[] args) {

        int num = 1;

        switch (num) {//조건의 대상
            case 1: //num == 1일때
                System.out.println("1");
                break; //이게 없으면 그 다음 case2 도 실행됨.
                        // 해당되는 조건의 case 부터 brake 만날때 까지 실행
            case 2: //num == 2일때
                System.out.println("2");
                break;
            case 3://num == 3일때
                System.out.println("3");
                break;
            default: //num가 1,2,3 전부 아닐때
                System.out.println("default");
        }

        int print = switch (num){
            case 1 -> 1; //num==1이면 print = 1
            case 2 -> 2;
            case 3 -> 3;
            default -> 0;
        };
        System.out.println(print);//print 는 반환값

        /** 삼황 연산자 | 조건 연산자*/
        num = 5;
        String status = (num >= 10) ? "10 이상의 수" : "10 미만의 수";
        System.out.println(status);
        //반환값을 넣을 변수 = (조건) ? 참일때_반환값 : 거짓일때_반환값 ;

    }
}
