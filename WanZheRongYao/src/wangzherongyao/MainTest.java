package wangzherongyao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		DiTu a=new DiTu();
		a.print();
		a.GongJi("A", "a");
		a.print2();
		a.YiDong(3, 3, "A");
		a.print();
		a.YiDong(3, 4, "a");
		a.print();
		a.GongJi("A","a");
		a.print2();
		assertEquals(50,a.a.ShengMing);
	}

}
