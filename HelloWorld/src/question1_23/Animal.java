/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

package question1_23;
public class Animal{
	private String name;
	private double height;
	private int speed;
	//動物名
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
		System.out.println("動物名：" + name);
	}
	//体長
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double x) {
		this.height = x;
		System.out.println("体長：" + x +"m");
	}
	//速度
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int y) {
		this.speed = y;
		System.out.println("速度：" + y +"km/h");
	}
	
}
