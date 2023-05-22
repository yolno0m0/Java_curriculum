package self_introduction31.main;

import self_introduction31.Person.*;
import self_introduction31.Vehicle.*;

class Main {
	public static void main(String[] args) {
		// Personを生成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("山田花子", 22, 1.5, 50);

		person1.print();

		// 合計人数を出力する
		Person.printCount();

		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		// 【問題4】オーナーをセットする
		car.setOwner(person1.name);
		bicycle.setOwner(person2.name);

		// 【問題5】オーナーを出力する
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		// 【問題10】Buyメソッドの実行
		person1.buy(car);
		person2.buy(bicycle);

	}
}
