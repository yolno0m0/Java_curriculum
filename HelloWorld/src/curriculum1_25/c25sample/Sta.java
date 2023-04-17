package curriculum1_25.c25sample;

public class Sta{
	private int status;
	//ステータスのランダム表記
	public int getStatus() {
		return this.status;
	}
	public int setStatus() {
		this.status = new java.util.Random().nextInt(1000);
		return this.status;
	}
}