import java.io.*;
public class Exam_08 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		MyPoint[] mp = new MyPoint[10];
		for(int i = 0; i < mp.length; ++i) {
			System.out.print("1.원 2.사각형 3.전체보기 4.종료 = ");
			int x = Integer.parseInt(in.readLine());
			if(x == 1) {
				mp[i] = new MyCircle();
				mp[i].input();
			}
			else if(x == 2) {
				mp[i] = new MyRect();
				mp[i].input();
			}
			else if(x == 3) {				
				for(int j = 0; j < i; ++j) {
					mp[j].output();
				}
				i--;
			}
			else if(x == 4) {
				System.exit(0);
			}
			else {
				System.out.println("잘못 입력 하셨습니다.");
				i--;
			}
			System.out.println();
		}
	}
}
