public class Operator {
    public static void main(String[] args) {
        /** 산술연산자 **/

        int num1 = 6, num2 = 2;
        // 덧셈
        int sum = num1 + num2;
        System.out.println("num1 + num2 = " + sum); //출력 a + b = 7

        // 뺄셈
        int diff = num1 - num2;
        System.out.println("num1 - num2 = " + diff);

        // 곱셈
        int multi = num1 * num2;
        System.out.println("num1 * num2 = " + multi);

        // 나눗셈
        int div = num1 / num2;
        System.out.println("num1 / num2 = " + div);

        // 나머지
        int mod = num1 % num2;
        System.out.println("num1 % num2 = " + mod);
        //0으로 나누는 경우 오류가 생김

        //문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기1
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        /** 전위즘감연산자 - 연산하고 대입 */
        num1 = 2;
        num2 = ++num1; // num1 = num1 + 1 / num2 = 3
        num1 = 2;
        num2 = --num1; // num1 = num1 - 1 / num2 = 1

        /** 후위 증감연산자 - 대입하고 연산 */
        num1 = 2;
        num2 = num1++; // num1 = num1 + 1 / num2 = 2
        num1 = 2;
        num2 = num1--; // num1 = num1 - 1 / num2 = 2

        /** 비교 연산자 */
        int a = 2;
        int b = 3;
        System.out.println(a == b); //같다
        System.out.println(a != b); //같지않다
        System.out.println(a > b); //크다
        System.out.println(a < b); //작다
        System.out.println(a >= b); //크거나 같다
        System.out.println(a <= b); //작거나 같다

        /** 논리연산자 */
        System.out.println(true && false); //AND
        System.out.println(true || false); //OR
        System.out.println(!true); //NOT

        /** 대입 연산자 */
        a = 5;
        a += 3; // 8 (5 + 3): a = a + 3
        a -= 2; // 6 (8 - 2): a = a - 2
        a *= 4; // 24 (6 * 4): a = a * 4
        a /= 3; // 8 (24 / 3): a = a / 3
        a %= 5; // 3 (8 % 5): a = a % 5

    }
}
