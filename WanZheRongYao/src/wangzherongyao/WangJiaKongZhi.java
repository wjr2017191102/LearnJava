package wangzherongyao;

import java.util.Scanner;
/**
 * ����������ҵ�ָ������
 * @author Dell
 */
class WangJiaKongZhi implements Runnable{
	DiTu a;
	private Scanner reader;
	public WangJiaKongZhi(DiTu a){
		this.a=a;
	}
	/**
	 * ��run���������������ָ�������
	 */
	public synchronized void run() {
		reader = new Scanner(System.in);
		while(!a.ShiFouJieShu()) {
		System.out.println("������ţ�1-�ƶ� 2-���� 3-���� 4-��ӡ 5-����");
		String CaoZuo=reader.nextLine();
		System.out.println(CaoZuo);
	if(CaoZuo.equals("1")) {
		System.out.println("�����ƶ��ߣ�");
		String p=reader.nextLine();
		System.out.println("�����ƶ�λ�ã���int x��int y��");
		int x=reader.nextInt();
		int y=reader.nextInt();
		System.out.println(x+" "+y);
		a.YiDong(x, y, p);
		a.print();
	}
	else if(CaoZuo.equals("3")) {
		System.out.println("���빥���ߣ�");
		String x=reader.nextLine();
		System.out.println("���뱻�����ߣ�");
		String y=reader.nextLine();
		a.GongJi(x, y);
		a.ChuLiShiTi();
		a.print();
	}
	else if(CaoZuo.equals("2")) {
		System.out.println("���뼼���ͷ���");
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
