package wangzherongyao;

import javax.swing.JLabel;

/**
 * 该类实现Runnable接口，以一定频率打印地图
 * @author Dell
 *
 */
public class DiTuDaYing implements Runnable{
	DiTu a;
	LabelDemo p;
	ShuJu p1;
	DiTuDaYing(DiTu a,LabelDemo p,ShuJu p1){
		this.a=a;
		this.p=p;
		this.p1=p1;
	}
	/**
	 * 地图打印的循环条件是游戏还没结束，打印频率是10000毫秒
	 */
	public synchronized void run() {
		while(!a.ShiFouJieShu()) {
			a.ChuLiShiTi();
			for(int i=0;i<12;i++) {
				for(int j=0;j<12;j++) {
					p.label[i][j].setIcon(p.ChuangZhao(a.ditu[i][j]));
					/*if(a.ditu[i][j].equals("A")) {
						p.label[i][j].setIcon(p.ChuangZhao(a.ditu[i][j]));
					}
					else p.label[i][j].setText(a.ditu[i][j]);*/
				}
			}
			p1.label[0].setText("A的生命值: "+a.A.ShengMing);
			p1.label[1].setText("B的生命值: "+a.B.ShengMing);
			p1.label[2].setText("C的生命值: "+a.C.ShengMing);
			p1.label[3].setText("D的生命值: "+a.D.ShengMing);
			p1.label[4].setText("E的生命值: "+a.E.ShengMing);
			p1.label[5].setText("a的生命值: "+a.a.ShengMing);
			p1.label[6].setText("b的生命值: "+a.b.ShengMing);
			p1.label[7].setText("c的生命值: "+a.c.ShengMing);
			p1.label[8].setText("d的生命值: "+a.d.ShengMing);
			p1.label[9].setText("e的生命值: "+a.e.ShengMing);
		try {
			Thread.sleep(5);
		}
		catch(InterruptedException e) {
			
		}
		}
		a.print();
	}
}