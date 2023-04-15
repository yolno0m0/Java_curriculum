package curriculum1_25.c25main;

import curriculum1_25.c25sample.Curriculum25_sample;

public class Curriculum25_main{
	public static void main(String args[]) {
		Curriculum25_sample s = new Curriculum25_sample();
		//こんにちは 「 名前 」 さん
		s.setName("「名前」");
		//ステータス
		int str1 = s.setStatus();
		int str2 = s.setStatus();
		int str3 = s.setStatus();
		int str4 = s.setStatus();
		int str5 = s.setStatus();
		//HP
		System.out.println("HP:"+str1);		
		//MP
		System.out.println("MP:"+str2);	
		//攻撃力
		System.out.println("攻撃力:"+str3);	
		//素早さ
		System.out.println("素早さ:"+str4);	
		//防御力
		System.out.println("防御力:"+str5);	
	}
}