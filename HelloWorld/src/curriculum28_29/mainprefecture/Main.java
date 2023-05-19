package curriculum28_29.mainprefecture;

import java.util.Scanner;

import curriculum28_29.array.Array;

public class Main {
    static String[] inputIndex;

    public static void main(String[] args) {

        // コンソール入力処理
        System.out.println("コンソールに入力してください。");

        // 入力された数字を配列に入れるメソッド→scan
        Scanner inputNum = new Scanner(System.in);
        Scanner sortArrays = new Scanner(System.in);

        // 繰り返し処理でscに値があったら次へ進む
        while (inputNum.hasNext()) {
            String scanner = sortArrays.next();
            String[] inputIndex = inputNum.nextLine().split(",");

            // データの出力とソートなど格納しているメソッド
            Array a = new Array();
            a.map(inputIndex, scanner);
        }
    }
}
