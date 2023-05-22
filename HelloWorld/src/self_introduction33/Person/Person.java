package self_introduction33.Person;

public class Person {
	// [問題１]lastNameの追加
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	public static int count = 0;

	// [問題２]コンストラクタにlastNameを追加
	public Person(String firstName, String lastName, int age, double height, double weight) {
		// [問題３] Person.count++とlastNameを追加
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// fullNameメソッド
	public String fullName() {
		return firstName + lastName;
	}

	// BMIを計算
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// コンソール表示メソッド
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");

	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}