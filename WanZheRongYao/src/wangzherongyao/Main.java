package wangzherongyao;

import java.awt.Component;
import java.awt.event.MouseListener;
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
	DiTu a;
	JiQiCaoZuoA a1;
	JiQiCaoZuoB b1;
	JiQiCaoZuoC c1;
	JiQiCaoZuoD d1;
	JiQiCaoZuoE e1;
	DiTuDaYing c2;
	WangJiaKongZhi m;
	Thread t1;
	Thread t2;
	Thread t3;
	Thread t4;
	Thread t5;
	Thread t6;
	Thread t7;
	public Main() {
		DiTu a=new DiTu();
		a.print();
		a.print2();
		/*JiQiCaoZuoA a1=new JiQiCaoZuoA(a);
		JiQiCaoZuoB b1=new JiQiCaoZuoB(a);
		JiQiCaoZuoC c1=new JiQiCaoZuoC(a);
		JiQiCaoZuoD d1=new JiQiCaoZuoD(a);
		JiQiCaoZuoE e1=new JiQiCaoZuoE(a);
		//DiTuDaYing c2=new DiTuDaYing(a);
		WangJiaKongZhi m=new WangJiaKongZhi(a);
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		Thread t3=new Thread(c1);
		Thread t4=new Thread(d1);
		Thread t5=new Thread(e1);
		Thread t6=new Thread(c2);
		Thread t7=new Thread(m);
		/*t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();*/
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
			}
			else {
				x=(int)(Math.random()*10);
				y=(int)(Math.random()*10);
				YiDong w=new YiDong(x,y,"E",a);
				w.run();
			}
		}
		else {
			x=(int)(Math.random()*10);
			y=(int)(Math.random()*10);
			if(Math.random()<=0.5) {
				YiDong w=new YiDong(x,y,"E",a);
				w.run();
			}
			else {
				a.JiNeng("E");
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
					}
					else {
						x=(int)(Math.random()*10);
						y=(int)(Math.random()*10);
						YiDong w=new YiDong(x,y,"D",a);
						w.run();
					}
				}
				else {
					x=(int)(Math.random()*10);
					y=(int)(Math.random()*10);
					if(Math.random()<=0.5) {
						YiDong w=new YiDong(x,y,"D",a);
						w.run();
					}
					else {
						a.JiNeng("D");
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
	public  synchronized void run() {
		while(!a.C.ShiFouSiWang()&&!a.ShiFouJieShu()) {
				int x,y;
				if(IfGongJi()!=" ") {
					if(Math.random()<=0.8) {
						a.GongJi("C", IfGongJi());
					}
					else {
						x=(int)(Math.random()*10);
						y=(int)(Math.random()*10);
						YiDong w=new YiDong(x,y,"C",a);
						w.run();
					}
				}
				else {
					x=(int)(Math.random()*10);
					y=(int)(Math.random()*10);
					if(Math.random()<=0.5) {
						YiDong w=new YiDong(x,y,"C",a);
						w.run();
					}
					else {
						a.JiNeng("C");
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

class FuHuod implements Runnable{
	DiTu a;
	FuHuod(DiTu a){
		this.a=a;
	}
	public void run() {
		if(a.d.ShiFouSiWang()) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
			a.d.set(9, 9);
			a.d.ShengMing=100;
			a.SheZhiDiTu(9, 9, "d");
			System.out.println("d已经复活");
		}
	}
}

class DianJi implements Runnable{
	DiTu a;
	String p;
	Component comp;
	DianJi(DiTu a,String p,Component comp){
		this.a=a;
		this.p=p;
		this.comp=comp;
	}
	public void run() {
		MouseListener w=new PoppupYiDong(a,p);
		comp.addMouseListener(w);
		System.out.println("Yes");
	}
}

class GongJi implements Runnable{
	String x,y;
	DiTu a;
	GongJi(DiTu a,String x,String y){
		this.a=a;
		this.x=x;
		this.y=y;
	}
	public void run() {
		JiChuYingXiong p=a.PiPei(x);
		JiChuYingXiong q=a.PiPei(y);
		String t=p.name;
		p.name=t+"gj";
		a.SheZhiDiTu(p.x, p.y, p.name);
		try {
			Thread.sleep(80);
		}
		catch(InterruptedException e) {
			
		}
		p.name=t;
		a.SheZhiDiTu(p.x, p.y, p.name);
		if(p.ShiFouChengGong(q.x, q.y)) {
			if(q.name.equals("c")&&a.l.BiaoZhi) {
				a.SheZhiDiTu2(a.l.x1,a.l.y1," ");
				a.SheZhiDiTu2(a.l.x2,a.l.y2," ");
				a.l.ShouHui();
				System.out.println("c的盾牌抵消了攻击");
				System.out.println("c的生命值是"+q.ShengMing);
				return;
			}
			if(q.name.equals("C")&&a.L.BiaoZhi) {
				a.SheZhiDiTu2(a.L.x1,a.L.y1," ");
				a.SheZhiDiTu2(a.L.x2,a.L.y2," ");
				a.L.ShouHui();
				System.out.println("C的盾牌抵消了攻击");
				System.out.println("C的生命值是"+q.ShengMing);
				return;
			}
			q.ShouShang(p.GongJi());
			System.out.println(q.name+"受到"+p.name+"的普通攻击，生命减少"+p.GongJi());
		}
		else {
			System.out.println(x+"攻击"+y+"失败,攻击范围之外");
		}
	}
}

class YiDong implements Runnable{
	DiTu ditu;
	int x,y;
	String p;
	YiDong(int x,int y,String p,DiTu a){
		this.x=x;
		this.y=y;
		this.p=p;
		this.ditu=a;
	}
	public synchronized void run() {
		int xx=ditu.PiPei(p).x;
		int yy=ditu.PiPei(p).y;
		int i,j,k;
		if(xx<x) i=1;
		else if(xx>x) i=-1;
		else i=0;
		if(yy<y) j=1;
		else if(yy>y) j=-1;
		else j=0;
		while(x!=xx||y!=yy) {
			if(x!=xx) {
			if(ditu.ShiFouKeYiDong(xx+i,yy)) {
				xx=xx+i;
				System.out.println(i);
				ditu.YiDong(xx, yy, p);
				try {
					Thread.sleep(200);
				}
				catch(InterruptedException e) {
					
				}
			}
			}
			if(y!=yy) {
			if(ditu.ShiFouKeYiDong(xx, yy+j)) {
				yy=yy+j;
				System.out.println(j);
				ditu.YiDong(xx, yy, p);
				try {
					Thread.sleep(200);
				}
				catch(InterruptedException e) {
					
				}
			}
			}
			if(!ditu.ShiFouKeYiDong(xx+i,yy)&&!ditu.ShiFouKeYiDong(xx, yy+j)) {
				break;
			}
		}
	}
}