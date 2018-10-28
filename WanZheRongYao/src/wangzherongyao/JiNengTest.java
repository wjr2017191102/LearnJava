package wangzherongyao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JiNengTest {
	@Test
	void test() {
		ZhanShi a=new ZhanShi("ZhanShi",3,3);
		FaZheng O=new FaZheng("FaZhneg");
		a.ShouShang(O.ShangHai());
		assertEquals(50,a.ShengMing);
		}

}
