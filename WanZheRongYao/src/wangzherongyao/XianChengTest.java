package wangzherongyao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class XianChengTest {

	@Test
	void test() {
		DiTu a=new DiTu();
		WangJiaKongZhi a1=new WangJiaKongZhi(a);
		a1.run();
	}
}
