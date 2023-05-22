package self_introduction31.Person;

import java.math.BigDecimal;
import java.math.RoundingMode;

import self_introduction31.Vehicle.Bicycle;
import self_introduction31.Vehicle.Car;

public class Person {
	// インスタンスフィールドを作成
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count = 0;
	Car car = new Car();

	// コンストラクタに初期値をセット
	public Person(String name, int age, double height, double weight) {
		// インスタンスフィールドに値をセット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// インスタンスを生成するたびに、countを増やす
		Person.count++;
	}

	// BMIの値を計算して返すメソッド
	public BigDecimal bmi(double height, double weight) {
		double bmi = weight / (height * height);
		BigDecimal bd = new BigDecimal(bmi);
		BigDecimal bdBmi = bd.setScale(1, RoundingMode.DOWN);
		return bdBmi;
	}

	// thisを用いて名前、年齢、BMIを返す
	public void print() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年は" + this.age + "歳です。");
		System.out.println("BMIは" + bmi(this.height, this.weight) + "です。");
	}

	// Countメソッド インスタンス化された回数を出力する
	public static void printCount() {
		System.out.println("合計は" + Person.count + "人です");
	}

	// buyメソッド
	public void buy(Car car) {
		car.setOwner(this.name);
		System.out.println(car.getOwner() + "が購入しました。");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました。");
	}

}
