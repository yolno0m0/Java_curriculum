/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package main;

public class curriculum_15 {

	public static void main(String[] args) {
		int[][] test ={
				{64,73,69},
				{58,81,75},
				{86,68,79},
				{72,55,80}
				};
		String[] name = {"生徒1","生徒2","生徒3","生徒4"};
		String [] subjects = {"国語","数学","英語"};	
		//1:データの表示
		for(int i = 0 ; i < test.length ; i++ ) {
			for(int j = 0 ; j < test[0].length ; j++) {
				
		if(j==0) {
			System.out.println(name[i]+":");}
			System.out.println(subjects[j]+test[i][j]+"点");		
			
			}
			System.out.println("");
		}
		//2:平均点の算出
		int sub1Avg = 0;
		int sub2Avg = 0;
		int sub3Avg = 0;
		for(int i = 0 ; i < test.length ; i++ ) {		
		 sub1Avg += test[i][0];		
		 sub2Avg += test[i][1];
		 sub3Avg += test[i][2];
		}
		 System.out.println("国語の平均点は"+sub1Avg/4+"点です。");
		 System.out.println("数学の平均点は"+sub2Avg/4+"点です。");
		 System.out.println("英語の平均点は"+sub3Avg/4+"点です。");
	}
}


	



