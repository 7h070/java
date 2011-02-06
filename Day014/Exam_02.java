import java.io.*;
abstract class AA {
	private int x;
	public AA() {}
	public abstract void aaa();
	public void disp() {
		//내용정의부
	}
}
class BB extends AA {
	public void aaa() {
		System.out.println("BBB");
	}
}
class CC extends AA {
	public void aaa() {
		System.out.println("CCC");
	}
}

public class Exam_02 {
	public static void main(String[] ar) throws Exception {
		//AA ap = new AA();
		BB bp = new BB();
		CC cp = new CC();
		AA ap = new BB();
		AA ap1 = new CC();
		ap.aaa();//BBB
		ap1.aaa();//CCC
		
		InputStream is = new FileInputStream(new File("aaa.txt"));
	}
}










