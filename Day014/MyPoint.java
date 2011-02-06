import java.io.*;
public abstract class MyPoint {
	protected static BufferedReader in;
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	protected int x;
	protected int y;
	public abstract void input() throws IOException;
	public abstract void output();
}
