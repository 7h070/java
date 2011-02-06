import java.io.*;
public class MyRect extends MyPoint {
	private int w;
	private int h;
	public void input() throws IOException {
		System.out.print("x = ");
		x = Integer.parseInt(in.readLine());
		System.out.print("y = ");
		y = Integer.parseInt(in.readLine());
		System.out.print("w = ");
		w = Integer.parseInt(in.readLine());
		System.out.print("h = ");
		h = Integer.parseInt(in.readLine());
	}
	public void output() {
		System.out.println(x + ", " + y + ", " + w + ", " + h);
	}
}
