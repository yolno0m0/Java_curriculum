package framework;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Frame{
	//変数の代入
		String greet;
//		public String getGreet(){
//			return this.greet;
//		}
		String sushi;
		String food;
	
	public String setGreet() {
			return this.greet = "こんにちは！ここは日本です！";
		}
	
		//現在日時を取得
		LocalDateTime date1 = LocalDateTime.now();
		DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String fdate1 = dtformat.format(date1);
		//現在日時を変数に代入
		String nowTime = "今の現在日時は"+fdate1+"です";
}
		
