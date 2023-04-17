/*名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 */

package curriculum1_25.c25sample;

public class Curriculum25_sample extends Sta{
	private String name;
	//名前の変数設定
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("こんにちは"+name+"さん");
	}	
}


