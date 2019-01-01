package wangzherongyao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LuBoTest {

	@Test
	void test() {
		DiTu a=new DiTu();
		WangJiaKongZhi t=new WangJiaKongZhi(a);
		t.run();
	}

}
