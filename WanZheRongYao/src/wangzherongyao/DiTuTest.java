package wangzherongyao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class DiTuTest {

	private Scanner reader;

	@Test
	void test() {
		DiTu a=new DiTu();
		a.YiDong(5, 4, "b");
		a.YiDong(5, 6, "A");
		a.YiDong(5, 7, "A");
		a.JiNeng("b");
		a.print();
		reader = new Scanner(System.in);
		int x=reader.nextInt();
		int y=reader.nextInt();
		a.YiDong(x, y, "c");
		a.print();
	}

}
