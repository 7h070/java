class A { // AA��� ���
	public void aaa() {
		System.out.println("AAA");
	}
}
class B { // BB��� ���
	public void Aaa() {}
}
class C { // CC��� ���
	public void aAa() {}
}
public class Exam_01 {
	public static void main(String[] ar) {
		A ap = new A();
		ap.aaa();
		B bp = new B();
		bp.Aaa();
		C cp = new C();
		cp.aAa();
	}
}
