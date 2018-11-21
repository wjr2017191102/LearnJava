package wangzherongyao;

import java.util.Scanner;
/**
 * 该类用于玩家的指令输入
 * @author Dell
 */
class WangJiaKongZhi implements Runnable{
	DiTu a;
	private Scanner reader;
	public WangJiaKongZhi(DiTu a){
		this.a=a;
	}
	/**
	 * 该run（）方法用于玩家指令的输入
	 */
	public synchronized void run() {
		reader = new Scanner(System.in);
		while(!a.ShiFouJieShu()) {
		System.out.println("输入序号：1-移动 2-技能 3-攻击 4-打印 5-结束");
		String CaoZuo=reader.nextLine();
		System.out.println(CaoZuo);
	if(CaoZuo.equals("1")) {
		System.out.println("输入移动者：");
		String p=reader.nextLine();
		System.out.println("输入移动位置：（int x，int y）");
		int x=reader.nextInt();
		int y=reader.nextInt();
		System.out.println(x+" "+y);
		a.YiDong(x, y, p);
		a.print();
	}
	else if(CaoZuo.equals("3")) {
		System.out.println("输入攻击者：");
		String x=reader.nextLine();
		System.out.println("输入被攻击者：");
		String y=reader.nextLine();
		a.GongJi(x, y);
		a.ChuLiShiTi();
		a.print();
	}
	else if(CaoZuo.equals("2")) {
		System.out.println("输入技能释放者");
		String p=reader.nextLine();
		a.JiNeng(p);
		a.ChuLiShiTi();
		a.print();
	}
	else if(CaoZuo.equals("4")) {
		a.print2();
	}
	else if(CaoZuo.equals("5")) {
		break;
	}
 }
		
	}
}
