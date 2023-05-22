package self_introduction33.Main;

import self_introduction33.Person.Person;

class Main {
	public static void main(String[] args) {
		// Personを生成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		Person person2 = new Person("山田", "花子", 22, 1.5, 50);

		person1.print();
		person2.print();

		Person.printCount();
	}
}
