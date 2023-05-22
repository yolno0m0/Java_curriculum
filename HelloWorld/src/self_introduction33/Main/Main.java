package self_introduction33.Main;

import self_introduction31.Person.Person;

class Main {
	public static void main(String[] args) {
		// Personを生成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("山田花子", 22, 1.5, 50);

		person1.print();
		person2.print();

		// 合計人数の表示
		Person.printCount();
	}
}
