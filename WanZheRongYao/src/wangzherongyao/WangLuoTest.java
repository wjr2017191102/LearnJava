package wangzherongyao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class WangLuoTest {

	@Test
	void test() {
		DiTu a=new DiTu();
		WangJiaKongZhi a1=new WangJiaKongZhi(a);
		WangJiaKongZhi a2=new WangJiaKongZhi(a);
		Thread XianChen1=new Thread(a1);
		XianChen1.start();
		Thread XianChen2=new Thread(a2);
		XianChen2.start();
		TuXingJieMian.main(null);
	}

}
