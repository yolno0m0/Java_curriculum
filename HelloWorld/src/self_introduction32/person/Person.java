package self_introduction32.Person;

class Person {
	public String name;
	public int age;
	public double height;
	public double weight;
	// [問題１] countを追加
	int count = 0;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// [問題２] インスタンスでカウントに１を足す
		count++;
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");

	}

	public void printCount() {
		System.out.println("合計" + count + "人です");
	}
}