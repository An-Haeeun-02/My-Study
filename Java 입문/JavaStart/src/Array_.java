public class Array_ {
    public static void main(String[] args) {
        int[] arr; //배열 변수 선언
        arr = new int[5]; //배열 생성, 정한 크기는 바꿀 수 없음
        arr[0] = 1;//인덱스 별 변수 값 데임
        System.out.println(arr);//arr는 참조값 반환

        //참조형 - 크기 동적 할당
        int size = 10;
        int[] ints = new int[size];

        int[] ints2 = {0, 1, 2, 3, 4, 5}; //배열의 선언과 초기화를 한번에 하는법

        /** 2차원 배열 */

        int row = 3, column = 2;

        int[][] arr2 = new int[row][column];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;
        /**
         * 1 2 3
         * 4 5 6
         * */

        int[][] arr3 = {{1,2,3}, {4,5,6}, {7,8,9}};

        /**
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * */





    }
}
