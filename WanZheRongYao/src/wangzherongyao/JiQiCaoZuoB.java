package wangzherongyao;
/**
 * ���߳����ڿ��Ʒ�ʦӢ��B
 * �������ܴ������£�
 * ������Χ���е��ˣ�һ��������ͨ������һ���������ܣ�
 * <p>������Χ��û�е��ˣ�һ�������ͷż��ܣ�һ�������ƶ���
 * @author Dell
 *
 */
class JiQiCaoZuoB implements Runnable{
	DiTu a;
	public JiQiCaoZuoB(DiTu a){
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
			if(a.B.ShiFouChengGong(x, y)) {
				return p[i];
			}
		}
		return " ";
	}
	/**
	 * �߳������ڵ�ѭ����ѭ������Ϊ��ʦӢ��Bû����������Ϸû�н���
	 */
	public  void run() {
		while(!a.B.ShiFouSiWang()&&!a.ShiFouJieShu()) {
				int x,y;
				if(IfGongJi()!=" ") {
					if(Math.random()<=0.4) {
						a.GongJi("B", IfGongJi());
						a.ChuLiShiTi();
					}
					else {
						x=(int)(Math.random()*10);
						y=(int)(Math.random()*10);
						a.YiDong(x, y, "B");
					}
				}
				else {
					x=(int)(Math.random()*10);
					y=(int)(Math.random()*10);
					if(Math.random()<=0.4) {
						a.YiDong(x, y, "B");
					}
					else {
						a.JiNeng("B");
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