package wangzherongyao;

/**
 * 该类实现Runnable接口，以一定频率打印地图
 * @author Dell
 *
 */
public class DiTuDaYing implements Runnable{
	DiTu a;
	DiTuDaYing(DiTu a){
		this.a=a;
	}
	/**
	 * 地图打印的循环条件是游戏还没结束，打印频率是10000毫秒
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