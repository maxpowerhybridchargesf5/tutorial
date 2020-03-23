import java.util.Scanner;
public class Kadai1 {
	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		Kadai1b w = new Kadai1b();
		w.b = q.nextDouble();
		w.h = q.nextDouble();
		System.out.println("底辺：" + w.b);
		System.out.println("高さ：" + w.h);
		System.out.println("インスタンスを生成しました。");
		System.out.println("面積は"+w.getArea()+"です。");
	}
}