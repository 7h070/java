class A { // AA라는 사람
	public void aaa() {
		System.out.println("AAA");
	}
}
class B { // BB라는 사람
	public void Aaa() {}
}
class C { // CC라는 사람
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
