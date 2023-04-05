package main;

public class curriculum1_16 {

	public static void main(String[] args) {
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。
		char a = 'A';
		System.out.println(a);
		// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
		String greet = "Hello java";
		System.out.println(greet);
		// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。
		int fujiHeight = 3376;
		System.out.println(fujiHeight);
		// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。
		double r = 3.14;
		System.out.println(r);
		// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。
		int[] nums = {10,100,1000} ;
		System.out.println(nums[0]);
		// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
		//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。
		int [] b = new int[2];
		b[0] = 8;
		nums = b ;
		System.out.println(nums[0]);
	}

}
