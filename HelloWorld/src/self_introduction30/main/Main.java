package self_introduction30.main;

import self_introduction30.Person.*;

class Main {
	public static void main(String[] args) {
		// 【問題5】weightに60を入れる
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		person1.print();

		// 合計人数を出力する
		Person.printCount();
	}
}