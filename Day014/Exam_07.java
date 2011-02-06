
public class Exam_07 implements Exam_06 {
	public void disp() {
		System.out.println("x = " + x);
	}
	public static void main(String[] ar) {
		Exam_06 ex = new Exam_07();
		ex.disp();
	}
}
