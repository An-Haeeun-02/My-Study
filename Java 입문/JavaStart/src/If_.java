public class If_ {
    public static void main(String[] args) {
        boolean bool = true;

        if (bool == true) { //조건
            System.out.println("true"); //조건이 참이면 실행
        }

        if (bool == true) { //조건
            System.out.println("true"); //조건이 참이면 실행
        } else {
            System.out.println("false");//조건이 참이 아니면 실행
        }

        boolean bool2 = true;

        if (bool == true) { //조건1
            System.out.println("bool == true"); //조건이 참이면 실행
        } else if (bool2 == true) {//조건2
            System.out.println("bool =! true 이고 bool2 == true"); //조건1이 거짓이고, 조건2가 참일때 실행
        } else {
            System.out.println("false");//조건1과 2과 전부 거짓일때 실행
        }

        //else if 는 앞에 if 와 연결됨. 독립적으로 동작하지 않거 연관된 경우에 사용

        if (true)
            System.out.println("if문에서 실행됨"); // 실행할 명령이 하나면 중괄호 생략가능
            System.out.println("이건 if문이 아님");

    }
}
