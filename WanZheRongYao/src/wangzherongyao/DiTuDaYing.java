package wangzherongyao;

/**
 * ����ʵ��Runnable�ӿڣ���һ��Ƶ�ʴ�ӡ��ͼ
 * @author Dell
 *
 */
public class DiTuDaYing implements Runnable{
	DiTu a;
	DiTuDaYing(DiTu a){
		this.a=a;
	}
	/**
	 * ��ͼ��ӡ��ѭ����������Ϸ��û��������ӡƵ����10000����
	 */
	public synchronized void run() {
		while(!a.ShiFouJieShu()) {
		a.print();
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			
		}
		}
		a.print();
	}
}