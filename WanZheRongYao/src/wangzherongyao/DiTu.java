package wangzherongyao;

import java.util.Scanner;
/**
 * ս������ģ�飬����ս����ʼ��{@link DiTu()}��ս���������ʼ��{@link DiTuChuShiHua()}��
 * ��ͼչʾ{@link print()}��Ӣ�۵��ƶ�{@link YiDong(int x,int y,String p)}�ȣ�
 * @author Dell
 *
 */
public class DiTu {
	String ditu[][];
	String ditu2[][];
	JiChuYingXiong A,B,C,D,E,a,b,c,d,e;
	FaZheng O,o;
	Jian Z,z;
	FenShen E1,e1;
	Dun L,l;
	/**
	 * ���ڳ�ʼ��ս��
	 */
	DiTu()
	{
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
		ditu[x][y]=p;
	}
	void SheZhiDiTu2(int x,int y,String p) {
		ditu2[x][y]=p;
	}
	/**
	 * ���������ͼ��
	 */
	void print()
	{
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				System.out.print(ditu[i][j]+ditu2[i][j]);
			}
			System.out.println();
		}
	}
	void print1()
	{
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				System.out.print(ditu[i][j]+ditu2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	void print2() {
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
		JiChuYingXiong q=new JiChuYingXiong();
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
	 */
	void ChuLiShiTi() {
		if(A.ShiFouSiWang()) {
			SheZhiDiTu(A.x,A.y,"X");
			print1();
			SheZhiDiTu(A.x,A.y," ");
		}
		if(B.ShiFouSiWang()) {
			SheZhiDiTu(B.x,B.y,"X");
			print1();
			SheZhiDiTu(B.x,B.y," ");

		}
		if(C.ShiFouSiWang()) {
			SheZhiDiTu(C.x,C.y,"X");
			print1();
			SheZhiDiTu(C.x,C.y," ");
		}
		if(D.ShiFouSiWang()) {
			SheZhiDiTu(D.x,D.y,"X");
			print1();
			SheZhiDiTu(D.x,D.y," ");
		}
		if(E.ShiFouSiWang()) {
			SheZhiDiTu(E.x,E.y,"X");
			print1();
			SheZhiDiTu(E.x,E.y," ");
		}
		if(a.ShiFouSiWang()) {
			SheZhiDiTu(a.x,a.y,"X");
			print1();
			SheZhiDiTu(a.x,a.y," ");
		}
		if(b.ShiFouSiWang()) {
			SheZhiDiTu(b.x,b.y,"X");
			print1();
			SheZhiDiTu(b.x,b.y," ");
		}
		if(c.ShiFouSiWang()) {
			SheZhiDiTu(c.x,c.y,"X");
			print1();
			SheZhiDiTu(c.x,c.y," ");
		}
		if(d.ShiFouSiWang()) {
			SheZhiDiTu(d.x,d.y,"X");
			print1();
			SheZhiDiTu(d.x,d.y," ");
		}
		if(e.ShiFouSiWang()) {
			SheZhiDiTu(e.x,e.y,"X");
			print1();
			SheZhiDiTu(e.x,e.y," ");
		}
	}
	boolean ShiFouKeYiDong(int x,int y) {
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
	void YiDong(int x,int y,String p) {
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
			q.ShouShang(O.ShangHai());
			System.out.println(q.name+"�ܵ���������������"+O.ShangHai());
			O.set(0, 0);
			O.BiaoZhi=false;
		}
		if(!o.ZhanKai(x,y,ditu[x][y])&&o.BiaoZhi) {
			q.ShouShang(o.ShangHai());
			System.out.println(q.name+"�ܵ���������������"+o.ShangHai());
			o.set(0, 0);
			o.BiaoZhi=false;
		}
		
	}
	/**
	 * ����ս��������Ӣ�ۼ����ͨ����
	 * @param x ������
	 * @param y ��������
	 */
	void GongJi(String x,String y) {
		JiChuYingXiong p=PiPei(x);
		JiChuYingXiong q=PiPei(y);
		if(p.ShiFouChengGong(q.x, q.y)) {
			if(q.name.equals("c")&&l.BiaoZhi) {
				SheZhiDiTu2(l.x1,l.y1," ");
				SheZhiDiTu2(l.x2,l.y2," ");
				l.ShouHui();
				System.out.println("c�Ķ��Ƶ����˹���");
				return;
			}
			if(q.name.equals("C")&&L.BiaoZhi) {
				SheZhiDiTu2(L.x1,L.y1," ");
				SheZhiDiTu2(L.x2,L.y2," ");
				L.ShouHui();
				System.out.println("C�Ķ��Ƶ����˹���");
				return;
			}
			q.ShouShang(p.GongJi());
			System.out.println(q.name+"�ܵ���������������"+p.GongJi());
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
	void JiNeng(String p) {
		Scanner reader=new Scanner(System.in);
		if(p.equals("B")){
			System.out.println("���뼼���ͷ�λ�ã���int x��int y��");
			int x=reader.nextInt();
			int y=reader.nextInt();
			O.set(x, y);
			System.out.println("B�ͷ��˷���");
			if(O.ShiFouChengGong(B.x, B.y)) {
				if(O.ZhanKai(x,y,ditu[x][y])) {
					SheZhiDiTu(x,y,O.name);
				}
				else {
					if(O.BiaoZhi) {
						JiChuYingXiong m=PiPei(ditu[x][y]);
						m.ShouShang(O.ShangHai());
						System.out.println(m.name+"�ܵ���������������"+O.ShangHai());
					}
				}
			}
			else System.out.println(B.name+"�����ͷ�ʧ��,��Χ֮��");
		}
		else if(p.equals("b")){
			System.out.println("���뼼���ͷ�λ�ã���int x��int y��");
			int x=reader.nextInt();
			int y=reader.nextInt();
			o.set(x, y);
			System.out.println("b�ͷ��˷���");
			if(o.ShiFouChengGong(b.x, b.y)) {
				if(o.ZhanKai(x,y,ditu[x][y])) {
					SheZhiDiTu(x,y,o.name);
				}
				else {
					if(o.BiaoZhi) {
						JiChuYingXiong m=PiPei(ditu[x][y]);
						m.ShouShang(o.ShangHai());
						System.out.println(m.name+"�ܵ���������������"+o.ShangHai());
					}
				}
			}
			else System.out.println(b.name+"�����ͷ�ʧ��,��Χ֮��");
		}
		else if(p.equals("d")) {
			System.out.println("d�����˹���");
			System.out.println("���뼼���ͷŷ��򣺣�w��s��a��d��");
			String s=reader.nextLine();
			int x=d.x,y=d.y;
			if(s.equals("w")) {
				System.out.println("��w��������һ��");
				z.set("|");
				z.set(x-1, y);
				while(z.QianJin(ditu[--x][y])) {
					SheZhiDiTu(x,y,z.name);
					print1();
					SheZhiDiTu(x,y," ");
				}
				if(!ditu[x][y].equals("*")) {
					JiChuYingXiong m=PiPei(ditu[x][y]);
					m.ShouShang(z.ShangHai());
					System.out.println(m.name+"�ܵ���������������"+z.ShangHai());
				}
				else System.out.println("û������");
			}
			else if(s.equals("s")) {
				System.out.println("��s��������һ��");
				z.set("|");
				z.set(x+1, y);
				while(z.QianJin(ditu[++x][y])) {
					SheZhiDiTu(x,y,z.name);
					print1();
					SheZhiDiTu(x,y," ");
				}
				if(!ditu[x][y].equals("*")) {
					JiChuYingXiong m=PiPei(ditu[x][y]);
					m.ShouShang(z.ShangHai());
					System.out.println(m.name+"�ܵ���������������"+z.ShangHai());
				}
				else System.out.println("û������");
			}
			else if(s.equals("a")) {
				System.out.println("��a��������һ��");
				z.set("-");
				z.set(x, y-1);
				while(z.QianJin(ditu[x][--y])) {
					SheZhiDiTu(x,y,z.name);
					print1();
					SheZhiDiTu(x,y," ");
				}
				if(!ditu[x][y].equals("*")) {
					JiChuYingXiong m=PiPei(ditu[x][y]);
					m.ShouShang(z.ShangHai());
					System.out.println(m.name+"�ܵ���������������"+z.ShangHai());
				}
				else System.out.println("û������");
			}
			else if(s.equals("d")) {
				System.out.println("��d��������һ��");
				z.set("-");
				z.set(x, y+1);
				while(z.QianJin(ditu[x][++y])) {
					SheZhiDiTu(x,y,z.name);
					print1();
					SheZhiDiTu(x,y," ");
				}
				if(!ditu[x][y].equals("*")) {
					JiChuYingXiong m=PiPei(ditu[x][y]);
					m.ShouShang(z.ShangHai());
					System.out.println(m.name+"�ܵ���������������"+z.ShangHai());
				}
				else System.out.println("û������");
			}
		}
		else if(p.equals("D")) {
			System.out.println("D�����˹���");
			System.out.println("���뼼���ͷŷ��򣺣�w��s��a��d��");
			String s=reader.nextLine();
			int x=D.x,y=D.y;
			if(s.equals("w")) {
				System.out.println("��w��������һ��");
				Z.set("|");
				Z.set(x-1, y);
				while(Z.QianJin(ditu[--x][y])) {
					SheZhiDiTu(x,y,Z.name);
					print1();
					SheZhiDiTu(x,y," ");
				}
				if(!ditu[x][y].equals("*")) {
					JiChuYingXiong m=PiPei(ditu[x][y]);
					m.ShouShang(Z.ShangHai());
					System.out.println(m.name+"�ܵ���������������"+Z.ShangHai());
				}
				else System.out.println("û������");
			}
			else if(s.equals("s")) {
				System.out.println("��s��������һ��");
				Z.set("|");
				Z.set(x+1, y);
				while(Z.QianJin(ditu[++x][y])) {
					SheZhiDiTu(x,y,Z.name);
					print1();
					SheZhiDiTu(x,y," ");
				}
				if(!ditu[x][y].equals("*")) {
					JiChuYingXiong m=PiPei(ditu[x][y]);
					m.ShouShang(Z.ShangHai());
					System.out.println(m.name+"�ܵ���������������"+Z.ShangHai());
				}
				else System.out.println("û������");
			}
			else if(s.equals("a")) {
				System.out.println("��a��������һ��");
				Z.set("-");
				Z.set(x, y-1);
				while(Z.QianJin(ditu[x][--y])) {
					SheZhiDiTu(x,y,Z.name);
					print1();
					SheZhiDiTu(x,y," ");
				}
				if(!ditu[x][y].equals("*")) {
					JiChuYingXiong m=PiPei(ditu[x][y]);
					m.ShouShang(Z.ShangHai());
					System.out.println(m.name+"�ܵ���������������"+Z.ShangHai());
				}
				else System.out.println("û������");
			}
			else if(s.equals("d")) {
				System.out.println("��d��������һ��");
				Z.set("-");
				Z.set(x, y+1);
				while(Z.QianJin(ditu[x][++y])) {
					SheZhiDiTu(x,y,Z.name);
					print1();
					SheZhiDiTu(x,y," ");
				}
				if(!ditu[x][y].equals("*")) {
					JiChuYingXiong m=PiPei(ditu[x][y]);
					m.ShouShang(Z.ShangHai());
					System.out.println(m.name+"�ܵ���������������"+Z.ShangHai());
				}
				else System.out.println("û������");
			}
		}
		else if(p.equals("E")) {
			System.out.println("���뼼�ܹ���λ�ã���int x��int y��");
			int x=reader.nextInt();
			int y=reader.nextInt();
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
					n.ShouShang(E1.ShangHai());
					System.out.println(n.name+"�ܵ���������������"+E1.ShangHai());
				}
			}
			else {
				System.out.println("û�й���Ŀ��");
			}
			SheZhiDiTu2(E1.x,E1.y,m);
			System.out.println("������ʧ��");
		}
		else if(p.equals("e")) {
			System.out.println("���뼼�ܹ���λ�ã���int x��int y��");
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
					n.ShouShang(e1.ShangHai());
					System.out.println(n.name+"�ܵ���������������"+e1.ShangHai());
				}
			}
			else {
				System.out.println("û�й���Ŀ��");
			}
			SheZhiDiTu2(e1.x,e1.y,m);
			System.out.println("������ʧ��");
		}
		else if(p.equals("c")) {
			System.out.println("C�����˶���");
			l.set(c.x, c.y);
			SheZhiDiTu2(l.x1,l.y1,l.name);
			SheZhiDiTu2(l.x2,l.y2,l.name);
			l.ZhanKai();
		}
		else if(p.equals("C")) {
			System.out.println("C�����˶���");
			L.set(C.x, C.y);
			SheZhiDiTu2(L.x1,L.y1,L.name);
			SheZhiDiTu2(L.x2,L.y2,L.name);
			L.ZhanKai();
		}
	}
}