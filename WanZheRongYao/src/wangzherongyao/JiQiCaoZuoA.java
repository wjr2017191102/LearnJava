package wangzherongyao;

/**
 * 该线程用于控制战士英雄A
 * 简易智能处理如下：
 * 攻击范围内有敌人，一定概率普通攻击，一定概率逃跑；
 * 攻击范围内没有敌人，一定概率释放技能，一定概率移动；
 * @author Dell
 *
 */
public class JiQiCaoZuoA implements Runnable{
	DiTu a;
	public JiQiCaoZuoA(DiTu a){
		this.a=a;
	}
	/**
	 * 用于判定攻击范围内是否有敌人
	 * @return 有，攻击范围内的敌人；没有，单空格字符串
	 */
	String IfGongJi() {
		String p[]= {"a","b","c","d","e"};
		for(int i=0;i<5;i++) {
			int x=a.PiPei(p[i]).x;
			int y=a.PiPei(p[i]).y;
			if(a.A.ShiFouChengGong(x, y)) {
				return p[i];
			}
		}
		return " ";
	}
	/**
	 * 线程主体内的循环的循环条件为战士英雄A没有死亡且游戏没有结束
	 */
	public  void run() {
		while(!a.A.ShiFouSiWang()&&!a.ShiFouJieShu()) {
			int x,y;
			if(IfGongJi()!=" ") {
				if(Math.random()<=0.8) {
					a.GongJi("A", IfGongJi());
					a.ChuLiShiTi();
				}
				else {
					x=(int)(Math.random()*10);
					y=(int)(Math.random()*10);
					a.YiDong(x, y, "A");
				}
			}
			else {
				x=(int)(Math.random()*10);
				y=(int)(Math.random()*10);
				if(Math.random()<=0.5) {
					a.YiDong(x, y, "A");
				}
				else {
					a.JiNeng("A");
					a.ChuLiShiTi();
				}
			}
			try {
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
			
			}
		}
	}
}