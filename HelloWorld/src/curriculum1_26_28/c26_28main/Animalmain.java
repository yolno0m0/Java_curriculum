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

import java.util.HashMap;
import java.util.Map;

import curriculum1_26_28.c26_28sub.Animalsub;

public class Animalmain {
	public static void main(String args[]) {

		System.out.println("コンソールに入力してください");

		String animalGroup = new java.util.Scanner(System.in).nextLine();
		String[] inputAnimalGroup = animalGroup.split("[,]");

		// ,で区切る配列をinputDataに入れた
		for (int i = 0; i < inputAnimalGroup.length; i++) {
			String[] inputData = inputAnimalGroup[i].split("[:]");

			// コンストラクタの値に合わせる
			double animalHeight = Double.parseDouble(inputData[1]);
			int animalSpeed = Integer.parseInt(inputData[2]);

			// 学名と動物名の紐付け
			Map<String, String> subNameMap = new HashMap<>();
			subNameMap.put("ライオン", "パンデラ レオ");
			subNameMap.put("ゾウ", "ロキソドンタ・サイクロティクス");
			subNameMap.put("パンダ", "アイルロポダ・メラノレウカ");
			subNameMap.put("チンパンジー", "パン・トゥログロディテス");
			subNameMap.put("シマウマ", "チャップマンシマウマ");
			subNameMap.put("インコ", "不明");

			// 引数に代入
			Animalsub sub = new Animalsub(inputData[0], animalHeight, animalSpeed, subNameMap.get(inputData[0]));

			// 配列を並び替えて出力
			System.out.println("動物名：" + sub.getName());
			System.out.println("体長：" + sub.getHeight() + "m");
			System.out.println("速度：" + sub.getSpeed() + "km/h");
			System.out.println("学名：" + sub.getSubName());
		}
	}
}