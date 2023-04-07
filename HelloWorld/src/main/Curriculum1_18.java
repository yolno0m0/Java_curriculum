package main;

import java.util.Arrays;

public class Curriculum1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello(String h,String j, int x) {
		System.out.println(h+j+x);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void cul(int x, int y) {
		int ans;
		ans = x * y;
		System.out.println(ans);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void num(int[] array) {
		for(int i : array) {
			System.out.println(i);
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void cul(double x, double y) {
		double ans;
		ans = x + y;
		System.out.println(ans);
	}	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] nums(int num1) {
		int[] data = new int[num1];
			for(int i = 0 ; i < num1 ; i++){
				if(data[i]<1) {
					data[i] = (int)(Math.random()*100+1);
					System.out.println(data[i]);
				}		
			}
			return data;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double avg(int num1) {			
		int[] ans1 = nums(num1);
		double numAvg = Arrays.stream(ans1).average().orElse(0);
		System.out.println(numAvg);
		return numAvg;
		}
	 
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		public static boolean score50(int a){
			double x = avg(a);
			if( x>=50 ) {
				System.out.println(true);
				return true;			
			}else {
				System.out.println(false);
				return false;
			}
		}
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		//Q1
		hello("Hello","JavaSE",11);
		//Q2
		cul(4,6);
		//Q3
		int [] array= {1,2,3,4,5};
		num(array);
		//Q4
		cul(4.0,6.0);
		//Q5
		nums(3);
		//Q6
		avg(3);
		//Q7
		score50(3);
	}
}