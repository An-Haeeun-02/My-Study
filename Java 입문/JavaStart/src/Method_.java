public class Method_ {
    public static void main(String[] args) {
        int sum = add(1, 2);//1과 2는 인수 (넘기는 값)
        System.out.println(sum);//1+2=3
        // sum = end(); 불가. 리턴값이 없는 메서드

        //만약 메서드의 리턴값과, 그걸 받을 변수의 타입이 다르다면? => 형변환 필요
        double dou = 1.5;
        prin((int) dou);//형변환 필요

        //오버
    }

    //add메서드(함수)
    public static int add(int a, int b) {//메서드 선언부 - 접근제어, 반횐타입, 이름, 파라미터(매개변수)
        return a + b;//return 을 만나변 함수를 빠져나감
    }

    public static void end(){//반환값과 매개변수가 없는 경우
        System.out.println("end");
    }

    public static void prin(int a){//반환값과 매개변수가 없는 경우
        System.out.println(a);
    }

    //오버로딩 - 이름이 같이만 배개변수가 다른 메서드를 정의하는 것, 매개변수의 터입과 수가 구분점
    //메서드는 메서드 이름 + 매개변수의 타입과 수 로 구분한다

    public static int add(int a, int b, int c){//이름이 같
        return a + b + c;
    }

}
