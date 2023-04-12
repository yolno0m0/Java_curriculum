package main.framework;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Frame{
		String greet;
		String sushi;
		String food;
	
	public String time() {
	//現在日時を取得	
	LocalDateTime date1 =	LocalDateTime.now();
	//表示形式を設定
	DateTimeFormatter dtformat =
			DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	String fdate1 = dtformat.format(date1);
	return fdate1;
	}
	
	public void text(){
		//変数へ代入
		this.greet = "こんにちは！ここは日本です！";
		this.sushi = "この寿司はうまい";
		this.food = "寿司は和食です";
		//表示
		System.out.println(greet);
		System.out.println(sushi);
		System.out.println(food);
	}
}