package wangzherongyao;

/**
 * ���߳����ڿ���սʿӢ��A
 * �������ܴ������£�
 * ������Χ���е��ˣ�һ��������ͨ������һ���������ܣ�
 * ������Χ��û�е��ˣ�һ�������ͷż��ܣ�һ�������ƶ���
 * @author Dell
 *
 */
public class JiQiCaoZuoA implements Runnable{
	DiTu a;
	public JiQiCaoZuoA(DiTu a){
		this.a=a;
	}
	/**
	 * �����ж�������Χ���Ƿ��е���
	 * @return �У�������Χ�ڵĵ��ˣ�û�У����ո��ַ���
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
	 * �߳������ڵ�ѭ����ѭ������ΪսʿӢ��Aû����������Ϸû�н���
	 */
	public  void run() {
		while(!a.A.ShiFouSiWang()&&!a.ShiFouJieShu()) {
			int x,y;
			if(IfGongJi()!=" ") {
				if(Math.random()<=0.8) {
					a.GongJi("A", IfGongJi());
				}
				else {
					x=(int)(Math.random()*10);
					y=(int)(Math.random()*10);
					YiDong w=new YiDong(x,y,"A",a);
					w.run();
				}
			}
			else {
				x=(int)(Math.random()*10);
				y=(int)(Math.random()*10);
				if(Math.random()<=0.5) {
					YiDong w=new YiDong(x,y,"A",a);
					w.run();
				}
				else {
					a.JiNeng("A");
					a.ChuLiShiTi();
				}
			}
			try {
				Thread.sleep(250);
			}
			catch(InterruptedException e) {
			
			}
		}
	}
}