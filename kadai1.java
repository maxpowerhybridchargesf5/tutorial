import java.util.Scanner;
public class Kadai1 {
	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		Kadai1b w = new Kadai1b();
		w.b = q.nextDouble();
		w.h = q.nextDouble();
		System.out.println("��ӁF" + w.b);
		System.out.println("�����F" + w.h);
		System.out.println("�C���X�^���X�𐶐����܂����B");
		System.out.println("�ʐς�"+w.getArea()+"�ł��B");
	}
}