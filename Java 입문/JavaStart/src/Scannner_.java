import java.util.Scanner;

public class Scannner_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //사용자 입력

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 입력 String, 엔터( \n )을 입력할 때 까지
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt(); // 입력 int
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble(); // 입력 double
        System.out.println("입력한 실수: " + doubleValue);
        /**
         * print() : 출력 후 다음라인으로 넘어가지 않음
         * println() : 출력후 다음라인으로 넘어감
         *
         * **/
    }
}
