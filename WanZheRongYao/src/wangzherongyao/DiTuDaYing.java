package wangzherongyao;

import javax.swing.JLabel;

/**
 * ����ʵ��Runnable�ӿڣ���һ��Ƶ�ʴ�ӡ��ͼ
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
	 * ��ͼ��ӡ��ѭ����������Ϸ��û��������ӡƵ����10000����
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
			p1.label[0].setText("A������ֵ: "+a.A.ShengMing);
			p1.label[1].setText("B������ֵ: "+a.B.ShengMing);
			p1.label[2].setText("C������ֵ: "+a.C.ShengMing);
			p1.label[3].setText("D������ֵ: "+a.D.ShengMing);
			p1.label[4].setText("E������ֵ: "+a.E.ShengMing);
			p1.label[5].setText("a������ֵ: "+a.a.ShengMing);
			p1.label[6].setText("b������ֵ: "+a.b.ShengMing);
			p1.label[7].setText("c������ֵ: "+a.c.ShengMing);
			p1.label[8].setText("d������ֵ: "+a.d.ShengMing);
			p1.label[9].setText("e������ֵ: "+a.e.ShengMing);
		try {
			Thread.sleep(5);
		}
		catch(InterruptedException e) {
			
		}
		}
		a.print();
	}
}