package wangzherongyao;

import java.util.Scanner;
/**
 * ��������������ָ��
 * @author Dell
 */
public class Main {
	public static void main(String args[]) {
		DiTu a=new DiTu();
		a.print();
		a.print2();
		Scanner reader=new Scanner(System.in);
		while(true) {
			System.out.println("������ţ�1-�ƶ� 2-���� 3-���� 4-��ӡ 5-����");
			int CaoZuo=reader.nextInt();
			if(CaoZuo==1) {
				System.out.println("�����ƶ�λ�ã���int x��int y��");
				int x=reader.nextInt();
				int y=reader.nextInt();
				System.out.println("�����ƶ��ߣ�");
				reader.nextLine();
				String p=reader.nextLine();
				a.YiDong(x, y, p);
				a.print();
			}
			else if(CaoZuo==3) {
				reader.nextLine();
				System.out.println("���빥���ߣ�");
				String x=reader.nextLine();
				System.out.println("���뱻�����ߣ�");
				String y=reader.nextLine();
				a.GongJi(x, y);
				a.ChuLiShiTi();
				a.print();
			}
			else if(CaoZuo==2) {
				reader.nextLine();
				System.out.println("���뼼���ͷ���");
				String p=reader.nextLine();
				a.JiNeng(p);
				a.ChuLiShiTi();
				a.print();
			}
			else if(CaoZuo==4) {
				a.print2();
			}
		}
	}
}
