package wangzherongyao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
/**
 * 主函数用于创建并启动线程
 * @author Dell
 */
public class Main {
	public static void main(String args[]) {
		DiTu a=new DiTu();
		a.print();
		a.print2();
		JiQiCaoZuoA a1=new JiQiCaoZuoA(a);
		JiQiCaoZuoB b1=new JiQiCaoZuoB(a);
		JiQiCaoZuoC c1=new JiQiCaoZuoC(a);
		JiQiCaoZuoD d1=new JiQiCaoZuoD(a);
		JiQiCaoZuoE e1=new JiQiCaoZuoE(a);
		DiTuDaYing c2=new DiTuDaYing(a);
		WangJiaKongZhi m=new WangJiaKongZhi(a);
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		Thread t3=new Thread(c1);
		Thread t4=new Thread(d1);
		Thread t5=new Thread(e1);
		Thread t6=new Thread(c2);
		Thread t7=new Thread(m);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
	}
}



class JiQiCaoZuoE implements Runnable{
	DiTu a;
	JiQiCaoZuoE(DiTu a){
		this.a=a;
	}
	String IfGongJi() {
		String p[]= {"a","b","c","d","e"};
		for(int i=0;i<5;i++) {
			int x=a.PiPei(p[i]).x;
			int y=a.PiPei(p[i]).y;
			if(a.E.ShiFouChengGong(x, y)) {
				return p[i];
			}
		}
		return " ";
	}
	public  void run() {
		while(!a.E.ShiFouSiWang()&&!a.ShiFouJieShu()) {
		int x,y;
		if(IfGongJi()!=" ") {
			if(Math.random()<=0.8) {
				a.GongJi("E", IfGongJi());
				a.ChuLiShiTi();
			}
			else {
				x=(int)(Math.random()*10);
				y=(int)(Math.random()*10);
				a.YiDong(x, y, "E");
			}
		}
		else {
			x=(int)(Math.random()*10);
			y=(int)(Math.random()*10);
			if(Math.random()<=0.5) {
				a.YiDong(x, y, "E");
			}
			else {
				a.JiNeng("E");
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
class JiQiCaoZuoD implements Runnable{
	DiTu a;
	JiQiCaoZuoD(DiTu a){
		this.a=a;
	}
	String IfGongJi() {
		String p[]= {"a","b","c","d","e"};
		for(int i=0;i<5;i++) {
			int x=a.PiPei(p[i]).x;
			int y=a.PiPei(p[i]).y;
			if(a.D.ShiFouChengGong(x, y)) {
				return p[i];
			}
		}
		return " ";
	}
	public  void run() {
		while(!a.D.ShiFouSiWang()&&!a.ShiFouJieShu()) {
				int x,y;
				if(IfGongJi()!=" ") {
					if(Math.random()<=0.8) {
						a.GongJi("D", IfGongJi());
						a.ChuLiShiTi();
					}
					else {
						x=(int)(Math.random()*10);
						y=(int)(Math.random()*10);
						a.YiDong(x, y, "D");
					}
				}
				else {
					x=(int)(Math.random()*10);
					y=(int)(Math.random()*10);
					if(Math.random()<=0.5) {
						a.YiDong(x, y, "D");
					}
					else {
						a.JiNeng("D");
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

class JiQiCaoZuoC implements Runnable{
	DiTu a;
	JiQiCaoZuoC(DiTu a){
		this.a=a;
	}
	String IfGongJi() {
		String p[]= {"a","b","c","d","e"};
		for(int i=0;i<5;i++) {
			int x=a.PiPei(p[i]).x;
			int y=a.PiPei(p[i]).y;
			if(a.C.ShiFouChengGong(x, y)) {
				return p[i];
			}
		}
		return " ";
	}
	public  void run() {
		while(!a.C.ShiFouSiWang()&&!a.ShiFouJieShu()) {
				int x,y;
				if(IfGongJi()!=" ") {
					if(Math.random()<=0.8) {
						a.GongJi("C", IfGongJi());
						a.ChuLiShiTi();
					}
					else {
						x=(int)(Math.random()*10);
						y=(int)(Math.random()*10);
						a.YiDong(x, y, "C");
					}
				}
				else {
					x=(int)(Math.random()*10);
					y=(int)(Math.random()*10);
					if(Math.random()<=0.5) {
						a.YiDong(x, y, "C");
					}
					else {
						a.JiNeng("C");
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
