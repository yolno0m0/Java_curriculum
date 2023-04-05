
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package main;

public class curriculum_14{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問1
		String []  str = new String[]{"a","b","c","d","e","f","g","h","i","j"};
		
			for(int i = 0; i < str.length ; i++) {
				System.out.println(str[i]);
				if(i>2) {
					break;	
				}
			}
			
		//問2
		String []  str2 = new String[]{"a","b","c","d","e","f","g","h","i","j"};
		String same = "i";
			for(int i = 0; i < str.length ; i++) {
				
				if(str2[i].equals(same)) {
					continue;			
				}
			System.out.println(str2[i]);
			}	
	}	
}

