/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */
package curriculum1_26_28.c26_28main;
import curriculum1_26_28.c26_28sub.Animalsub;
public class Animalmain{
	public static void main(String args[]) {
		//入力値の判定
		boolean isCorrect = false;
		while(isCorrect == false) {
			System.out.println("コンソールに入力してください");
			//テキスト入力
			String imputName = new java.util.Scanner(System.in).nextLine();
			//Animalsub array
			Animalsub[] animalSubArray;
			animalSubArray = new Animalsub[6];
			//配列のデータと入力
			animalSubArray[0] = new Animalsub("ライオン",2.1,80,"パンデラ　レオ");
			animalSubArray[1] = new Animalsub("ゾウ",3.2,40,"ロキソドンタ・サイクロティクス");
			animalSubArray[2] = new Animalsub("パンダ",2.9,30,"アイルロポダ・メラノレウカ");
			animalSubArray[3] = new Animalsub("チンパンジー",0.94,25,"パン・トゥログロディテス");
			animalSubArray[4] = new Animalsub("シマウマ",2.4,30,"チャップマンシマウマ");
			animalSubArray[5] = new Animalsub("インコ",0.1,50,"不明");
			//出力
			for(int i = 0; i < animalSubArray.length ; i++) {

				if(imputName.equals(animalSubArray[i].getName())) {
					isCorrect = true;
					System.out.println("動物名：" + animalSubArray[i].getName());
					System.out.println("体長：" + animalSubArray[i].getHeight() + "m");
					System.out.println("速度：" + animalSubArray[i].getSpeed() + "km/h");
					System.out.println("学名：" + animalSubArray[i].getSubName());
					break;
				}
			}

			//不正な値な場合の処理
			if(!isCorrect) {
				System.out.println("入力値が不正です。");
			}
		}
	}
}