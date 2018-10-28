package wangzherongyao;

import java.util.Scanner;
/**
 * 主函数用于输入指令
 * @author Dell
 */
public class Main {
	public static void main(String args[]) {
		DiTu a=new DiTu();
		a.print();
		a.print2();
		Scanner reader=new Scanner(System.in);
		while(true) {
			System.out.println("输入序号：1-移动 2-技能 3-攻击 4-打印 5-结束");
			int CaoZuo=reader.nextInt();
			if(CaoZuo==1) {
				System.out.println("输入移动位置：（int x，int y）");
				int x=reader.nextInt();
				int y=reader.nextInt();
				System.out.println("输入移动者：");
				reader.nextLine();
				String p=reader.nextLine();
				a.YiDong(x, y, p);
				a.print();
			}
			else if(CaoZuo==3) {
				reader.nextLine();
				System.out.println("输入攻击者：");
				String x=reader.nextLine();
				System.out.println("输入被攻击者：");
				String y=reader.nextLine();
				a.GongJi(x, y);
				a.ChuLiShiTi();
				a.print();
			}
			else if(CaoZuo==2) {
				reader.nextLine();
				System.out.println("输入技能释放者");
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
