package curriculum1_26_28.c26_28main;
import curriculum1_26_28.c26_28sub.Animalsub;
public class Animalmain{
	public static void main(String args[]) {
		//ライオンインスタンスの作成
		Animalsub a1 =new Animalsub();
		a1.setName("ライオン");
		a1.setHeight(2.1);
		a1.setSpeed(80);
		a1.setSubName("バンデラ　レオ");
		System.out.println();
		//ゾウインスタンスの作成
		Animalsub a2=new Animalsub();
		a2.setName("ゾウ");
		a2.setHeight(3.2);
		a2.setSpeed(40);
		a2.setSubName("ロキソドンタ・サイクロティス");
		System.out.println();
		//パンダインスタンスの作成
		Animalsub a3 =new Animalsub();
		a3.setName("パンダ");
		a3.setHeight(2.9);
		a3.setSpeed(30);
		a3.setSubName("アイルロボダ・メラノレウカ");
		System.out.println();
		//チンパンジーインスタンスの作成
		Animalsub a4 =new Animalsub();
		a4.setName("チンパンジー");
		a4.setHeight(0.94);
		a4.setSpeed(25);
		a4.setSubName("パン・トゥログロディテス");
		System.out.println();
		//シマウマインスタンスの作成
		Animalsub a5 =new Animalsub();
		a5.setName("シマウマ");
		a5.setHeight(2.4);
		a5.setSpeed(65);
		a5.setSubName("チャップマンシマウマ");
		System.out.println();
		//インコインスタンスの作成
		Animalsub a6 =new Animalsub();
		a6.setName("インコ");
		a6.setHeight(0.1);
		a6.setSpeed(50);
		a6.setSubName("不明");
	}
}