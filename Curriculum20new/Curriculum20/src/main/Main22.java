package main;
import main.frameork.Frame22;
public class Main22 {
	public static void main(String args[]){
		//インスタンス化
		Frame22 f = new Frame22();
		//テキストメソッドの呼び出し
		f.text();
		//現在時刻を表示
		String nowtime = f.time();
		System.out.println("現在の時刻は"+nowtime+"です");
	}
	}	
