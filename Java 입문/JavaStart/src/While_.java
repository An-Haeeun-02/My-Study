public class While_ {
    public static void main(String[] args) {
        /*
         * while (조건 : 부합하면 반복, 아니면 반복문 종료) {
         * 반복할 내용
         * }
         * */

        int count = 0;
        while (count < 5) {
            count++;
            System.out.println(count);
        }

        /*
        * do{
        * 반복할 코드
        * } while(조건식);
        *
        *  while 문과 비슷하지만, 조건에 상관없이 무조건 한번은 실행한다.
        * 코드 실행 -> 조건 탐색 -> 조건에 맞으면 또 실행, 아니면 종료
        * */

        count = 0;
        do {
            count++;
            System.out.println(count);
        } while (count < 5);

        /*
        * brake는 다음 코드를 실행하지 않고 반복문을 종료시키고 빠져나감
        * continue는 다음 코드를 실행하지 않고 현재 반복을 멈추고 다시 조건식으로 돌아감
        * while, do-while, for에 전부 사용 가능
        * */

    }
}
