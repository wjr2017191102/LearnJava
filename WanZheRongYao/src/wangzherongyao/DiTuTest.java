package wangzherongyao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiTuTest {

	@Test
	void test() {
		DiTu a=new DiTu();
		a.YiDong(5, 4, "B");
		a.YiDong(5, 6, "b");
		a.JiNeng("B");
		a.print();
		a.JiNeng("b");
		a.print();
		a.JiNeng("B");
		a.print();
		a.YiDong(5, 8, "B");
		a.print();
		assertEquals(50,a.b.ShengMing);
		assertEquals(0,a.B.ShengMing);
	}

}
