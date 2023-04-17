package curriculum1_26_28.c26_28sub;
public class Animalsub{
	//動物名
	private String name;

	//体長
	private double height;

	//速度
	private int speed;

	//学名
	private String subName;

	//コンストラクタ
	public Animalsub(String name,double height,int speed,String subName) {
		this.name = name;
		this.height = height;
		this.speed = speed;
		this.subName = subName;
	}

	//動物名の表示メソッド
	public String getName(){return this.name;}

	//体長の表示メソッド
	public double getHeight(){return this.height;}

	//速度の表示メソッド
	public int getSpeed(){return this.speed;}

	//学名の表示メソッド
	public String getSubName(){return this.subName;}
}