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
	
	//動物名の表示メソッド
	public String getName() {
		return this.name; 
	}
	public void setName(String name) {
		System.out.println("動物名："+name);
	}
	//体長の表示メソッド
	public double getHeight() {
		return this.height; 
	}
	public void setHeight(double x) {
		System.out.println("体長："+x+"m");
	}
	//速度の表示メソッド
	public int getSpeed() {
		return this.speed; 
	}
	public void setSpeed(int y) {
		System.out.println("速度："+y+"km/h");
	}
	//学名の表示メソッド
	public String getSubName() {
		return this.subName; 
	}
	public void setSubName(String name2) {
		System.out.println("学名："+name2);
	}
}