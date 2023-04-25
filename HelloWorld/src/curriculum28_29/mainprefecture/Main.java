package curriculum28_29.mainprefecture;

import curriculum28_29.subprefecture.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // コンソール入力処理
        System.out.println("コンソールに入力してください。");
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        // 繰り返し処理で
        while (sc.hasNext()) {
            // 昇順降順の入力
            String scanner = sc2.next();

            // ”,”で区切って配列に格納
            String[] inputIndexArray = sc.nextLine().split(",");

            // int型へ変換
            int[] intIndexArray = Stream.of(inputIndexArray).mapToInt(Integer::parseInt).toArray();

            // 処理メソッド
            // 配列にデータ代入
            Sub[] subArray = new Sub[11];

            subArray[0] = new Sub("北海道", "札幌市", 83424);
            subArray[1] = new Sub("青森県", "青森市", 9646);
            subArray[2] = new Sub("岩手県", "盛岡市", 15275);
            subArray[3] = new Sub("宮城県", "仙台市", 7282);
            subArray[4] = new Sub("秋田県", "秋田市", 11638);
            subArray[5] = new Sub("山形県", "山形市", 9323);
            subArray[6] = new Sub("福島県", "福島市", 13784);
            subArray[7] = new Sub("茨城県", "水戸市", 6097);
            subArray[8] = new Sub("栃木県", "宇都宮市", 6408);
            subArray[9] = new Sub("群馬県", "前橋市", 6362);
            subArray[10] = new Sub("埼玉県", "さいたま市", 3798);

            // ソート
            if (scanner.equals("昇順")) {
                Arrays.sort(intIndexArray);
            } else if (scanner.equals("降順")) {
                Arrays.sort(intIndexArray);
                for (int f = 0, l = inputIndexArray.length - 1; f < l; f++, l--) {
                    int temp = intIndexArray[f];
                    intIndexArray[f] = intIndexArray[l];
                    intIndexArray[l] = temp;
                }
            }
            // コンソールに入力された値と比較して、一致するものを表示する
            for (int i = 0; i < intIndexArray.length; i++) {
                int j = intIndexArray[i];
                Sub s = new Sub(subArray[j].getPrefecture(), subArray[j].getCity(),
                        subArray[j].getArea());

                // 処理後の出力
                System.out.println("");
                System.out.println("都道府県名：" + s.getPrefecture());
                System.out.println("県庁所在地：" + s.getCity());
                System.out.println("面積：" + s.getArea() + "km2");
            }
        }
    }
}
