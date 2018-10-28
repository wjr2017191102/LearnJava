package wangzherongyao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YingXiongTest {
	@Test
	void test() {
		ZhanShi a=new ZhanShi("ZhanShi",0,0);
		a=a.HuiDiao(new XiaoHuJia(), a);
		a.ZhuangBei();
		assertEquals(150, a.ShengMing);
	}
	@Test
	void test2() {
		ZhanShi a=new ZhanShi("ZhanShi",0,0);
		a=a.HuiDiao(new DaHuJia(), a);
		a.ZhuangBei();
	    assertEquals(200,a.ShengMing);
	}//https://github.com/wjr2017191102/Second-Git.git
}
