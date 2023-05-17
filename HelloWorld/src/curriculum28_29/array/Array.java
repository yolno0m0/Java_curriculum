package curriculum28_29.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Array {
    public void map(String[] inputIndex, String sortArrays) {
        Map<Integer, String> countries = new HashMap<>();

        countries.put(0, "北海道:札幌市:83424");
        countries.put(1, "青森県:青森市:9646");
        countries.put(2, "岩手県:盛岡市:15275");
        countries.put(3, "宮城県:仙台市:7282");
        countries.put(4, "秋田県:秋田市:11638");
        countries.put(5, "山形県:山形市:9323");
        countries.put(6, "福島県:福島市:13784");
        countries.put(7, "茨城県:水戸市:6097");
        countries.put(8, "栃木県:宇都宮市:6408");
        countries.put(9, "群馬県:前橋市:6362");
        countries.put(10, "埼玉県:さいたま市:3798");
        
        //scannerで入力した配列をInteger型に変換
        Integer[] sortedArrays = Stream.of(inputIndex).mapToInt(Integer::parseInt)
                .boxed().toArray(Integer[]::new);

        // Sortする
        if (sortArrays.equals("昇順")) {
            Arrays.sort(sortedArrays);
        } else if (sortArrays.equals("降順")) {
            Arrays.sort(sortedArrays, Collections.reverseOrder());
        }
        
        //sorteArraysで受け取った配列を繰り返し処理でキーとして返す
        for (Integer index : sortedArrays ) {
        	String[] date = countries.get(index).split(":");
        	
        	//面積をdouble型に変換する
            String area = date[2];
            double dbArea = Double.parseDouble(area);
           
            // Map Keyとscannerで格納された配列の値を比較して表示させる
            System.out.println("");
            System.out.println("都道府県：" + date[0]);
            System.out.println("県庁所在地:" + date[1]);
            System.out.println("面積：" + dbArea + "km2");
        }
    }
}
