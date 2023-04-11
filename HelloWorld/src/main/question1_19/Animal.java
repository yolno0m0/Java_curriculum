package main.question1_19;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。 	
		Dog dog = new Dog(3);
		System.out.println(dog.name);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		System.out.println(dog.num);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在日時を取得
		LocalDateTime date1 = LocalDateTime.now();
		// 表示形式を指定
		DateTimeFormatter dtformat = 
			DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		//表示形式+Stringに変換
		String fdate1 = dtformat.format(date1); 
		System.out.println(fdate1);
        
	}
}
