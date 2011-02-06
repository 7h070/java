import java.io.*;
public class MyCircle extends MyPoint {
	private int r;
	public void input() throws IOException {
		System.out.print("x = ");
		x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		y = Integer.parseInt(in.readLine());
		System.out.print("r = ");
		r = Integer.parseInt(in.readLine());
	}
	public void output() {
		System.out.println(x + ", " + y + ", " + r);
	}
}
