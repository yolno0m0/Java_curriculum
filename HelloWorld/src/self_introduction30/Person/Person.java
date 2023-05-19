package self_introduction30.Person;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
	// 【問題1】インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count = 0;

	// 【問題2】コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		// 【問題3】インスタンスフィールドに値をセット
		this.name = name;
		this.age = age;
		this.height = height;
		// 【問題４】引数にweightを追加
		this.weight = weight;
		Person.count++;
	}

	// 【問題5】インスタンスメソッドでBMIを返す
	public BigDecimal bmi(double height, double weight) {
		double bmi = weight / (height * height);
		BigDecimal bd = new BigDecimal(bmi);
		BigDecimal bdBmi = bd.setScale(1, RoundingMode.DOWN);
		return bdBmi;
	}

	// 【問題7】thisを用いて名前、年齢、BMIを返す
	public void print() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年は" + this.age + "歳です。");
		System.out.println("BMIは" + bmi(this.height, this.weight) + "です。");
	}

	// 【問題8】Countメソッド インスタンス化された回数を出力する
	public static void printCount() {
		System.out.println("合計は" + Person.count + "人です");
	}
}
