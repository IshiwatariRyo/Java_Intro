package part8;
import java.util.Random;

public class Cleric {
	Random r = new Random();
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	public  void selfAid() {
		this.mp -= 5;
		this.hp = this.MAXHP;
	}
	public int pray(int sec) {
		int rec = sec + (r.nextInt(3));
		int recAc = Math.min(this.MAXHP - this.hp, rec);
		this.mp += recAc;
		return recAc;
	}

}
