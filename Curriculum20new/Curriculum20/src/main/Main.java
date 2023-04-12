package main;
import main.framework.Frame;
public class Main {
	public static void main(String args[]){
		Frame f = new Frame();
		//テキストメソッドの呼び出し
		f.text();
		//現在時刻を表示
		String nowtime = f.time();
		System.out.println("現在の時刻は"+nowtime+"です");
	}
}