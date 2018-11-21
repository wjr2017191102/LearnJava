package wangzherongyao;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;



/**
 * ս������ģ�飬����ս����ʼ��{@link DiTu()}��ս���������ʼ��{@link DiTuChuShiHua()}��
 * ��ͼչʾ{@link print()}��Ӣ�۵��ƶ�{@link YiDong(int x,int y,String p)}�ȣ�
 * @author Dell
 *
 */
public class DiTu {
	boolean flag;
	String ditu[][];
	String ditu2[][];
	JiChuYingXiong A,B,C,D,E,a,b,c,d,e;
	FaZheng O,o;
	Jian Z,z;
	FenShen E1,e1;
	Dun L,l;
	private Scanner reader;
	/**
	 * ���ڳ�ʼ��ս��
	 */
	DiTu()
	{
		flag=false;
		ditu=new String [12][12];
		ditu2=new String [12][12];
		A=new ZhanShi("A",1,1);
		a=new ZhanShi("a",10,10);
		B=new FaShi("B",1,2);
		b=new FaShi("b",10,9);
		C=new TanKe("C",2,1);
		c=new TanKe("c",9,10);
		D=new SheShou("D",2,2);
		d=new SheShou("d",9,9);
		E=new ChiKe("E",1,3);
		e=new ChiKe("e",10,8);
		O=new FaZheng("O");
		o=new FaZheng("o");
		Z=new Jian("D");
		z=new Jian("d");
		E1=new FenShen("E");
		e1=new FenShen("e");
		L=new Dun("|");
		l=new Dun("|");
		DiTuChuShiHua();
	}
	boolean ShiFouJieShu() {
		if(A.ShiFouSiWang()&&B.ShiFouSiWang()&&C.ShiFouSiWang()&&D.ShiFouSiWang()&&E.ShiFouSiWang()) {
			flag=true;
		}
		else if(a.ShiFouSiWang()&&b.ShiFouSiWang()&&c.ShiFouSiWang()&&d.ShiFouSiWang()&&e.ShiFouSiWang()) {
			flag=true;
		}
		return flag;
	}
	void DiTuChuShiHua() {
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				ditu[i][j]=" ";
				ditu2[i][j]=" ";
			}
		}
		for(int i=0;i<12;i++) {
			ditu[0][i]="*";
			ditu[11][i]="*";
		}
		for(int i=0;i<12;i++) {
			ditu[i][0]="*";
			ditu[i][11]="*";
		}
		ditu[2][4]=ditu[2][5]=ditu[2][7]=ditu[2][8]=ditu[2][9]="*";
		ditu[3][2]=ditu[3][5]=ditu[3][9]="*";
		ditu[4][2]=ditu[4][5]=ditu[4][6]=ditu[4][7]=ditu[4][9]="*";
		ditu[9][2]=ditu[9][3]=ditu[9][4]=ditu[9][6]=ditu[9][7]="*";
		ditu[8][2]=ditu[8][6]=ditu[8][9]="*";
		ditu[7][2]=ditu[7][5]=ditu[7][4]=ditu[7][6]=ditu[7][9]="*";
		SheZhiDiTu(A.x,A.y,A.name);
		SheZhiDiTu(a.x,a.y,a.name);
		SheZhiDiTu(B.x,B.y,B.name);
		SheZhiDiTu(b.x,b.y,b.name);
		SheZhiDiTu(C.x,C.y,C.name);
		SheZhiDiTu(c.x,c.y,c.name);
		SheZhiDiTu(D.x,D.y,D.name);
		SheZhiDiTu(d.x,d.y,d.name);
		SheZhiDiTu(E.x,E.y,E.name);
		SheZhiDiTu(e.x,e.y,e.name);
	}
	/**
	 * �������õ�ͼ��
	 * @param x ������
	 * @param y ������
	 * @param p ��������
	 */
	void SheZhiDiTu(int x,int y,String p) {
		if(x<1||x>10||y<1||y>10) return;
		ditu[x][y]=p;
	}
	void SheZhiDiTu2(int x,int y,String p) {
		ditu2[x][y]=p;
	}
	/**
	 * ���������ͼ��
	 */
	synchronized void print()
	{
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				System.out.print(ditu[i][j]+ditu2[i][j]);
			}
			System.out.println();
		}
	}
	synchronized void print1()
	{
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				System.out.print(ditu[i][j]+ditu2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	synchronized void print2() {
		System.out.println("name ShengMing");
		A.print();
		B.print();
		C.print();
		D.print();
		E.print();
		a.print();
		b.print();
		c.print();
		d.print();
		e.print();
	}
	JiChuYingXiong PiPei(String p) {
		JiChuYingXiong q=null;
		switch(p) {
		case "A": q=A;break;
		case "a": q=a;break;
		case "B": q=B;break;
		case "b": q=b;break;
		case "C": q=C;break;
		case "c": q=c;break;
		case "D": q=D;break;
		case "d": q=d;break;
		case "E": q=E;break;
		case "e": q=e;break;
		}
		return q;
	}
	/**
	 * �������ս�����Ѿ������ܵ�Ӣ��
	 * @return 
	 */
	synchronized void ChuLiShiTi() {
		if(A.ShiFouSiWang()) {
			SheZhiDiTu(A.x,A.y," ");
			A.set(15, 15);
			System.out.println("A�Ѿ�����");
		}
		if(B.ShiFouSiWang()) {
			SheZhiDiTu(B.x,B.y," ");
			B.set(15, 15);
			System.out.println("B�Ѿ�����");

		}
		if(C.ShiFouSiWang()) {
			SheZhiDiTu(C.x,C.y," ");
			C.set(15, 15);
			System.out.println("C�Ѿ�����");
		}
		if(D.ShiFouSiWang()) {
			SheZhiDiTu(D.x,D.y," ");
			D.set(15, 15);
			System.out.println("D�Ѿ�����");
		}
		if(E.ShiFouSiWang()) {
			SheZhiDiTu(E.x,E.y," ");
			E.set(15, 15);
			System.out.println("E�Ѿ�����");
		}
		if(a.ShiFouSiWang()) {
			SheZhiDiTu(a.x,a.y," ");
			a.set(15, 15);
			System.out.println("a�Ѿ�����");
		}
		if(b.ShiFouSiWang()) {
			SheZhiDiTu(b.x,b.y," ");
			b.set(15, 15);
			System.out.println("b�Ѿ�����");
		}
		if(c.ShiFouSiWang()) {
			SheZhiDiTu(c.x,c.y," ");
			c.set(15, 15);
			System.out.println("c�Ѿ�����");
		}
		if(d.ShiFouSiWang()) {
			SheZhiDiTu(d.x,d.y," ");
			d.set(15, 15);
			System.out.println("d�Ѿ�����");
		}
		if(e.ShiFouSiWang()) {
			SheZhiDiTu(e.x,e.y," ");
			e.set(15, 15);
			System.out.println("e�Ѿ�����");
		}
	}
	synchronized boolean ShiFouKeYiDong(int x,int y) {
		if(ditu[x][y].equals(" ")||ditu[x][y].equals("O")||ditu[x][y].equals("o")) {
			return true;
		}
		else return false;
	}
	/**
	 * ����ս���ϵ�Ӣ�۵��ƶ�
	 * @param x ������
	 * @param y ������
	 * @param p �ƶ���
	 */
	synchronized void YiDong(int x,int y,String p) {
		Logger logger = Logger.getLogger(Main.class);
		BasicConfigurator.configure();
		logger.setLevel(Level.INFO);
		logger.info("�ƶ�����Ϣ "+p+" "+x+" "+y);
		if(!ShiFouKeYiDong(x,y)||x<1||x>10||y<1||y>10) {
			System.out.println(p+"�ƶ�ʧ��");
			return;
		}
		JiChuYingXiong q=PiPei(p);
		SheZhiDiTu(q.x,q.y," ");
		q.set(x, y);
		SheZhiDiTu(q.x,q.y,q.name);
		if(q.name.equals("c")&&l.BiaoZhi) {
			SheZhiDiTu2(l.x1,l.y1," ");
			SheZhiDiTu2(l.x2,l.y2," ");
			l.set(x, y);
			SheZhiDiTu2(l.x1,l.y1,l.name);
			SheZhiDiTu2(l.x2,l.y2,l.name);
		}
		if(q.name.equals("C")&&L.BiaoZhi) {
			SheZhiDiTu2(L.x1,L.y1," ");
			SheZhiDiTu2(L.x2,L.y2," ");
			L.set(x, y);
			SheZhiDiTu2(L.x1,L.y1,L.name);
			SheZhiDiTu2(L.x2,L.y2,L.name);
		}
		if(!O.ZhanKai(x,y,ditu[x][y])&&O.BiaoZhi) {
			logger.info("������Ϣ "+O.name+" "+O.x+" "+O.y);
			q.ShouShang(O.ShangHai());
			System.out.println(q.name+"�ܵ�����O�Ĺ�������������"+O.ShangHai());
			O.set(0, 0);
			O.BiaoZhi=false;
		}
		if(!o.ZhanKai(x,y,ditu[x][y])&&o.BiaoZhi) {
			q.ShouShang(o.ShangHai());
			System.out.println(q.name+"�ܵ�����o�Ĺ�������������"+o.ShangHai());
			o.set(0, 0);
			o.BiaoZhi=false;
		}
		
	}
	/**
	 * ����ս��������Ӣ�ۼ����ͨ����
	 * @param x ������
	 * @param y ��������
	 */
	synchronized void GongJi(String x,String y) {
		JiChuYingXiong p=PiPei(x);
		JiChuYingXiong q=PiPei(y);
		if(p.ShiFouChengGong(q.x, q.y)) {
			if(q.name.equals("c")&&l.BiaoZhi) {
				SheZhiDiTu2(l.x1,l.y1," ");
				SheZhiDiTu2(l.x2,l.y2," ");
				l.ShouHui();
				System.out.println("c�Ķ��Ƶ����˹���");
				System.out.println("c������ֵ��"+q.ShengMing);
				return;
			}
			if(q.name.equals("C")&&L.BiaoZhi) {
				SheZhiDiTu2(L.x1,L.y1," ");
				SheZhiDiTu2(L.x2,L.y2," ");
				L.ShouHui();
				System.out.println("C�Ķ��Ƶ����˹���");
				System.out.println("C������ֵ��"+q.ShengMing);
				return;
			}
			q.ShouShang(p.GongJi());
			System.out.println(q.name+"�ܵ�"+p.name+"����ͨ��������������"+p.GongJi());
		}
		else {
			System.out.println(x+"����"+y+"ʧ��,������Χ֮��");
		}
	}
	/**
	 * ���ڿ���ս����Ӣ�۵ļ��ܵ��ͷţ�
	 * ��ͬ��Ӣ�ۻ��ͷŲ�ͬ�ļ��ܣ���Ҫ�����ͷ��ߵ�Ӣ�����
	 * @param p �ͷ���
	 */
	synchronized void JiNeng(String p) {
		reader = new Scanner(System.in);
		if(p.equals("B")){
			JiNengB();
		}
		else if(p.equals("b")){
			JiNengb();
		}
		else if(p.equals("d")) {
			JiNengd();
		}
		else if(p.equals("D")) {
			JiNengD();
		}
		else if(p.equals("E")) {
			JiNengE();
		}
		else if(p.equals("e")) {
			JiNenge();
		}
		else if(p.equals("c")) {
			JiNengc();
		}
		else if(p.equals("C")) {
			JiNengC();
		}
	}
	synchronized void JiNengb() {
		System.out.println("b�����ͷ�λ�ã���int x��int y��");
		int x=reader.nextInt();
		int y=reader.nextInt();
		o.set(x, y);
		
		System.out.println("b�ٻ��˷���");
		if(o.ShiFouChengGong(b.x, b.y)) {
			if(o.ZhanKai(x,y,ditu[x][y])) {
				SheZhiDiTu(x,y,o.name);
				System.out.println("b�ٻ��ķ��������");
				o.BiaoZhi=false;
			}
			else {
				if(o.BiaoZhi) {
					JiChuYingXiong m=PiPei(ditu[x][y]);
					if(m==null) {
						System.out.println("b�ٻ�����ʧ��");
						o.set(15, 15);
						o.BiaoZhi=false;
						return;
					}
					m.ShouShang(o.ShangHai());
					System.out.println(m.name+"�ܵ�b�ķ��󹥻�����������"+o.ShangHai());
				}
			}
		}
		else {
			System.out.println(b.name+"�����ͷ�ʧ��,��Χ֮��");
			o.set(15, 15);
		}
	}
	synchronized void JiNengB() {
		System.out.println("B�����ͷ�λ�ã���int x��int y��");
		int x=(int)(Math.random()*10);
		int y=(int)(Math.random()*10);
		//int x=reader.nextInt();
		//int y=reader.nextInt();
		System.out.println(x+"  "+y);
		O.set(x, y);
		
		System.out.println("B�ٻ��˷���");
		if(O.ShiFouChengGong(B.x, B.y)) {
			if(O.ZhanKai(x,y,ditu[x][y])) {
				SheZhiDiTu(x,y,O.name);
				System.out.println("B�ٻ��ķ��������");
				O.BiaoZhi=false;
			}
			else {
				if(O.BiaoZhi) {
					JiChuYingXiong m=PiPei(ditu[x][y]);
					if(m==null) {
						System.out.println("B�ٻ�����ʧ��");
						O.set(15, 15);
						O.BiaoZhi=false;
						return;
					}
					m.ShouShang(O.ShangHai());
					System.out.println(m.name+"�ܵ�B�ķ��󹥻�����������"+O.ShangHai());
				}
			}
		}
		else {
			System.out.println(B.name+"�����ͷ�ʧ��,��Χ֮��");
			O.set(15, 15);
		}
	}
	synchronized void JiNengd() {
		System.out.println("d�����˹���");
		System.out.println("����d������򣺣�w��s��a��d��");
		String s=reader.nextLine();
		int x=d.x,y=d.y;
		if(s.equals("w")) {
			System.out.println("d��w��������һ��");
			z.set("|");
			z.set(x-1, y);
			while(z.QianJin(ditu[--x][y])) {
				SheZhiDiTu(x,y,z.name);
				print1();
				SheZhiDiTu(x,y," ");
			}
			if(!ditu[x][y].equals("*")) {
				JiChuYingXiong m=PiPei(ditu[x][y]);
				if(m==null) {
					System.out.println("d����ļ�û������");
					return;
				}
				m.ShouShang(z.ShangHai());
				System.out.println(m.name+"��d�����ˣ���������"+z.ShangHai());
			}
			else System.out.println("d����ļ�û������");
		}
		else if(s.equals("s")) {
			System.out.println("d��s��������һ��");
			z.set("|");
			z.set(x+1, y);
			while(z.QianJin(ditu[++x][y])) {
				SheZhiDiTu(x,y,z.name);
				print1();
				SheZhiDiTu(x,y," ");
			}
			if(!ditu[x][y].equals("*")) {
				JiChuYingXiong m=PiPei(ditu[x][y]);
				if(m==null) {
					System.out.println("d����ļ�û������");
					return;
				}
				m.ShouShang(z.ShangHai());
				System.out.println(m.name+"��d�����ˣ���������"+z.ShangHai());
			}
			else System.out.println("d����ļ�û������");
		}
		else if(s.equals("a")) {
			System.out.println("d��a��������һ��");
			z.set("-");
			z.set(x, y-1);
			while(z.QianJin(ditu[x][--y])) {
				SheZhiDiTu(x,y,z.name);
				print1();
				SheZhiDiTu(x,y," ");
			}
			if(!ditu[x][y].equals("*")) {
				JiChuYingXiong m=PiPei(ditu[x][y]);
				if(m==null) {
					System.out.println("d����ļ�û������");
					return;
				}
				m.ShouShang(z.ShangHai());
				System.out.println(m.name+"��d�����ˣ���������"+z.ShangHai());
			}
			else System.out.println("d����ļ�û������");
		}
		else if(s.equals("d")) {
			System.out.println("d��d��������һ��");
			z.set("-");
			z.set(x, y+1);
			while(z.QianJin(ditu[x][++y])) {
				SheZhiDiTu(x,y,z.name);
				print1();
				SheZhiDiTu(x,y," ");
			}
			if(!ditu[x][y].equals("*")) {
				JiChuYingXiong m=PiPei(ditu[x][y]);
				if(m==null) {
					System.out.println("d����ļ�û������");
					return;
				}
				m.ShouShang(z.ShangHai());
				System.out.println(m.name+"��d�����ˣ���������"+z.ShangHai());
			}
			else System.out.println("d����ļ�û������");
		}
	}
	synchronized void JiNengD() {
		System.out.println("D�����˹���");
		String s=null;
		int t=(int)(Math.random()*10);
		if(t<3) s="w";
		else if(t<=5) s="s";
		else if(t<8) s="a";
		else if(t<=10) s="d";
		int x=D.x,y=D.y;
		if(s.equals("w")) {
			System.out.println("D��w��������һ��");
			Z.set("|");
			Z.set(x-1, y);
			while(Z.QianJin(ditu[--x][y])) {
				SheZhiDiTu(x,y,Z.name);
				print1();
				SheZhiDiTu(x,y," ");
			}
			if(!ditu[x][y].equals("*")) {
				JiChuYingXiong m=PiPei(ditu[x][y]);
				if(m==null) {
					System.out.println("D����ļ�û������");
					return;
				}
				m.ShouShang(Z.ShangHai());
				System.out.println(m.name+"��D�����ˣ���������"+Z.ShangHai());
			}
			else System.out.println("D����ļ�û������");
		}
		else if(s.equals("s")) {
			System.out.println("D��s��������һ��");
			Z.set("|");
			Z.set(x+1, y);
			while(Z.QianJin(ditu[++x][y])) {
				SheZhiDiTu(x,y,Z.name);
				print1();
				SheZhiDiTu(x,y," ");
			}
			if(!ditu[x][y].equals("*")) {
				JiChuYingXiong m=PiPei(ditu[x][y]);
				if(m==null) {
					System.out.println("D����ļ�û������");
					return;
				}
				m.ShouShang(Z.ShangHai());
				System.out.println(m.name+"��D�����ˣ���������"+Z.ShangHai());
			}
			else System.out.println("D����ļ�û������");
		}
		else if(s.equals("a")) {
			System.out.println("D��a��������һ��");
			Z.set("-");
			Z.set(x, y-1);
			while(Z.QianJin(ditu[x][--y])) {
				SheZhiDiTu(x,y,Z.name);
				print1();
				SheZhiDiTu(x,y," ");
			}
			if(!ditu[x][y].equals("*")) {
				JiChuYingXiong m=PiPei(ditu[x][y]);
				if(m==null) {
					System.out.println("D����ļ�û������");
					return;
				}
				m.ShouShang(Z.ShangHai());
				System.out.println(m.name+"��D�����ˣ���������"+Z.ShangHai());
			}
			else System.out.println("D����ļ�û������");
		}
		else if(s.equals("d")) {
			System.out.println("D��d��������һ��");
			Z.set("-");
			Z.set(x, y+1);
			while(Z.QianJin(ditu[x][++y])) {
				SheZhiDiTu(x,y,Z.name);
				print1();
				SheZhiDiTu(x,y," ");
			}
			if(!ditu[x][y].equals("*")) {
				JiChuYingXiong m=PiPei(ditu[x][y]);
				if(m==null) {
					System.out.println("D����ļ�û������");
					return;
				}
				m.ShouShang(Z.ShangHai());
				System.out.println(m.name+"��D�����ˣ���������"+Z.ShangHai());
			}
			else System.out.println("D����ļ�û������");
		}
	}
	synchronized void JiNenge() {
		System.out.println("����e������λ�ã���int x��int y��");
		int x=reader.nextInt();
		int y=reader.nextInt();
		e1.set(e.x, e.y);
		String m=ditu2[e1.x][e1.y];
		SheZhiDiTu2(e1.x,e1.y,e1.name);
		System.out.println("e�����˷�����");
		print1();
		SheZhiDiTu2(e1.x,e1.y,m);
		e1.set(x, y);
		m=ditu2[e1.x][e1.y];
		SheZhiDiTu2(e1.x,e1.y,e1.name);
		print1();
		if(e1.GongJi(ditu[x][y])) {
			if(e1.BiaoZhi) {
				JiChuYingXiong n=PiPei(ditu[x][y]);
				if(n==null) {
					System.out.println("e�ķ���û�й���Ŀ��");
					return;
				}
				n.ShouShang(e1.ShangHai());
				System.out.println(n.name+"�ܵ�e�ķ���������������"+e1.ShangHai());
			}
		}
		else {
			System.out.println("e�ķ���û�й���Ŀ��");
		}
		SheZhiDiTu2(e1.x,e1.y,m);
		System.out.println("e�ķ�����ʧ��");
	}
	synchronized void JiNengE() {
		System.out.println("E������λ�ã���int x��int y��");
		int x=(int)(Math.random()*10);
		int y=(int)(Math.random()*10);
		System.out.println(x+"  "+y);
		E1.set(E.x, E.y);
		String m=ditu2[E1.x][E1.y];
		SheZhiDiTu2(E1.x,E1.y,E1.name);
		System.out.println("E�����˷�����");
		print1();
		SheZhiDiTu2(E1.x,E1.y,m);
		E1.set(x, y);
		m=ditu2[E1.x][E1.y];
		SheZhiDiTu2(E1.x,E1.y,E1.name);
		print1();
		if(E1.GongJi(ditu[x][y])) {
			if(E1.BiaoZhi) {
				JiChuYingXiong n=PiPei(ditu[x][y]);
				if(n==null) {
					System.out.println("E�ķ���û�й���Ŀ��");
					return;
				}
				n.ShouShang(E1.ShangHai());
				System.out.println(n.name+"�ܵ�E�ķ���������������"+E1.ShangHai());
			}
		}
		else {
			System.out.println("E�ķ���û�й���Ŀ��");
		}
		SheZhiDiTu2(E1.x,E1.y,m);
		System.out.println("E�ķ�����ʧ��");
	}
	synchronized void JiNengc() {
		System.out.println("c�����˶���");
		l.set(c.x, c.y);
		SheZhiDiTu2(l.x1,l.y1,l.name);
		SheZhiDiTu2(l.x2,l.y2,l.name);
		l.ZhanKai();
	}
	synchronized void JiNengC() {
		System.out.println("C�����˶���");
		L.set(C.x, C.y);
		SheZhiDiTu2(L.x1,L.y1,L.name);
		SheZhiDiTu2(L.x2,L.y2,L.name);
		L.ZhanKai();
	}
}

class Ta{
	String name;
	int x,y;
	int GongJiFanWei;
	/**
	 * �������ĳ�ʼ��
	 * @param p ���ڵ�ͼ�ϵ��ַ�����ʾ
	 */
	Ta(String p){
		name=p;
		x=5;
		y=5;
		GongJiFanWei=3;
	}
	/**
	 * @return ���������˺�
	 */
	int ShangHai() {
		return 50;
	}
	/**
	 *�����ж��Ƿ��ڷ������Ĺ�����Χ֮��
	 * @param x Ŀ�������
	 * @param y Ŀ��������
	 * @return �ڣ�����true�����ڣ�����false
	 */
	boolean ShiFouGongJi(int x,int y) {
		int m=this.x-x;
		if(m<0) m=-m;
		int n=this.y-y;
		if(n<0) n=-n;
		if(m+n<=GongJiFanWei) return true;
		else return false;
	}
}