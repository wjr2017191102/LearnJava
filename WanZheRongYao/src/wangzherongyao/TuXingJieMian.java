package wangzherongyao;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * ��������ڴ���ͼ�ν��棬����ѡ������Լ���ս����
 * @author Dell
 */
public class TuXingJieMian {
	private static void ChuangJian() {
		JFrame DuRu=new JFrame("�������");
		DuRu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TextDome If=new TextDome();
		DuRu.setContentPane(If);
		DuRu.setSize(300,200);
		DuRu.setVisible(true);
		
		
		DiTu a=new DiTu();
		JiQiCaoZuoA a1=new JiQiCaoZuoA(a);
		JiQiCaoZuoB b1=new JiQiCaoZuoB(a);
		JiQiCaoZuoC c1=new JiQiCaoZuoC(a);
		JiQiCaoZuoD d1=new JiQiCaoZuoD(a);
		JiQiCaoZuoE e1=new JiQiCaoZuoE(a);
		WangJiaKongZhi m=new WangJiaKongZhi(a);
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		Thread t3=new Thread(c1);
		Thread t4=new Thread(d1);
		Thread t5=new Thread(e1);
		Thread t7=new Thread(m);
		t7.start();
		/**
		 * ѡ�����Ĵ��崴��
		 */
		JFrame frame=new JFrame("DiTu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MenuDemo menudemo=new MenuDemo();
		frame.setJMenuBar(menudemo.create(t1,t2,t3,t4,t5,a,frame));
		
		LabelDemo pane=new LabelDemo(a);
		frame.add(pane);
		
		frame.setSize(650, 662);
		frame.setVisible(true);
		
		/**
		 * ��ս����Ĵ��崴��
		 */
		JFrame frame1=new JFrame("JieMian");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ShuJu pane1=new ShuJu(a);
		frame1.add(pane1);
		
		frame1.setSize(300, 662);
		frame1.setVisible(true);
		
		DiTuDaYing c2=new DiTuDaYing(a,pane,pane1);
		Thread t6=new Thread(c2);
		t6.start();
	
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ChuangJian();
			}
		});
	}
}

class MenuDemo implements ActionListener{
	Thread t1,t2,t3,t4,t5;
	DiTu a;
	Component comp;
	public JMenuBar create(Thread t1,Thread t2,Thread t3,Thread t4,Thread t5,DiTu a,Component comp) {
		this.a=a;
		this.comp=comp;
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
		this.t4=t4;
		this.t5=t5;
		JMenuBar menubar;
		menubar=new JMenuBar();
		JMenu menu1;
		menu1=new JMenu("��ʼ(J)");
		menu1.setMnemonic(KeyEvent.VK_J);
		menubar.add(menu1);
		JMenuItem menuitem;
		menuitem=new JMenuItem("Ӣ��A");
		menuitem.setActionCommand("A");
		menuitem.addActionListener(this);
		menu1.add(menuitem);
		menuitem=new JMenuItem("Ӣ��B");
		menuitem.setActionCommand("B");
		menuitem.addActionListener(this);
		menu1.add(menuitem);
		menuitem=new JMenuItem("Ӣ��C");
		menuitem.setActionCommand("C");
		menuitem.addActionListener(this);
		menu1.add(menuitem);
		menuitem=new JMenuItem("Ӣ��D");
		menuitem.setActionCommand("D");
		menuitem.addActionListener(this);
		menu1.add(menuitem);
		menuitem=new JMenuItem("Ӣ��E");
		menuitem.setActionCommand("E");
		menuitem.addActionListener(this);
		menu1.add(menuitem);
		JMenu menu2;
		menu2=new JMenu("�ƶ�(1)");
		menu2.setMnemonic(KeyEvent.VK_1);
		menubar.add(menu2);
		menuitem=new JMenuItem("Ӣ��c");
		menuitem.setActionCommand("c");
		menuitem.addActionListener(this);
		menu2.add(menuitem);
		menuitem=new JMenuItem("Ӣ��d");
		menuitem.setActionCommand("d");
		menuitem.addActionListener(this);
		menu2.add(menuitem);
		JMenu menu3;
		menu3=new JMenu("����(2)");
		menu3.setMnemonic(KeyEvent.VK_2);
		menubar.add(menu3);
		menuitem=new JMenuItem("Ӣ��d");
		menuitem.setActionCommand("dgj");
		menuitem.addActionListener(this);
		menu3.add(menuitem);
		return menubar; 
	}
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		String cmd=e.getActionCommand();
		Thread t;
		if(cmd.equals("A")) {
			t1.start();
		}
		if(cmd.equals("B")) {
			t2.start();
		}
		if(cmd.equals("C")) {
			t3.start();
		}
		if(cmd.equals("D")) {
			t4.start();
		}
		if(cmd.equals("E")) {
			t5.start();
		}
		if(cmd.equals("c")) {
			//t=new Thread(new DianJi(a,"c",comp));
			//t.start();
			MouseListener w=new PoppupYiDong(a,"c");
			comp.addMouseListener(w);
			System.out.println("Yes");
		}
		if(cmd.equals("d")) {
			t=new Thread(new DianJi(a,"d",comp));
			t.start();
		}
		if(cmd.equals("dgj")) {
			MouseListener w=new PoppupGongJi(a,"d");
			comp.addMouseListener(w);
			System.out.println("Yes");
		}
	}
}

class ShuJu extends JPanel{
	private static final long serialVersionUID = 1L;
	public JLabel label[];
	ShuJu(DiTu a){
		this.setLayout(new GridLayout(10,1));
		label=new JLabel[10];
		label[0]=new JLabel("A������ֵ: "+a.A.ShengMing);
		label[1]=new JLabel("B������ֵ: "+a.B.ShengMing);
		label[2]=new JLabel("C������ֵ: "+a.C.ShengMing);
		label[3]=new JLabel("D������ֵ: "+a.D.ShengMing);
		label[4]=new JLabel("E������ֵ: "+a.E.ShengMing);
		label[5]=new JLabel("a������ֵ: "+a.a.ShengMing);
		label[6]=new JLabel("b������ֵ: "+a.b.ShengMing);
		label[7]=new JLabel("c������ֵ: "+a.c.ShengMing);
		label[8]=new JLabel("d������ֵ: "+a.d.ShengMing);
		label[9]=new JLabel("e������ֵ: "+a.e.ShengMing);
		
		for(int i=0;i<10;i++) {
			this.add(label[i]);
		}
	}
}
/**
 * �������ڽ���ͼ���е��ַ���ά��������ڴ�����
 */
class LabelDemo extends JPanel{
	private static final long serialVersionUID = 1L;
	public JLabel label[][];
	LabelDemo(DiTu a){
		this.setLayout(new GridLayout(12,12));
		label=new JLabel[12][12];
		for(int i=0;i<12;i++) {
			for(int j=0;j<12;j++) {
				String p=a.ditu[i][j];
				label[i][j]=new JLabel(ChuangZhao(p));
				label[i][j].setOpaque(true);
				this.add(label[i][j]);
			}
		}
	}
	/**
	 * �÷������ڽ��ַ�ת���ɶ�Ӧ��ͼƬ
	 * @param p ԭ�ַ�
	 * @return  ͼƬ
	 */
	public Icon ChuangZhao(String p) {
		ImageIcon t = null;
		if(p.equals("A")) {
			t=new ImageIcon("D:\\h\\"+p+".png");
		}
		if(p.equals("Agj")) {
			t=new ImageIcon("D:\\h\\"+p+".png");
		}
		if(p.equals("Bgj")) {
			t=new ImageIcon("D:\\h\\"+p+".png");
		}
		if(p.equals("Cgj")) {
			t=new ImageIcon("D:\\h\\"+p+".png");
		}
		if(p.equals("Dgj")) {
			t=new ImageIcon("D:\\h\\"+p+".png");
		}
		if(p.equals("Egj")) {
			t=new ImageIcon("D:\\h\\"+p+".png");
		}
		if(p.equals("O")) {
			t=new ImageIcon("D:\\h\\O.png");
		}
		if(p.equals("o")) {
			t=new ImageIcon("D:\\h\\o1.png");
		}
		if(p.equals("B")) {
			t=new ImageIcon("D:\\h\\B.png");
		}
		if(p.equals("C")) {
			t=new ImageIcon("D:\\h\\C.png");
		}
		if(p.equals("D")) {
			t=new ImageIcon("D:\\h\\D.png");
		}
		if(p.equals("E")) {
			t=new ImageIcon("D:\\h\\E.png");
		}
		if(p.equals("a")) {
			t=new ImageIcon("D:\\h\\a1.png");
		}
		if(p.equals("b")) {
			t=new ImageIcon("D:\\h\\b1.png");
		}
		if(p.equals("c")) {
			t=new ImageIcon("D:\\h\\c1.png");
		}
		if(p.equals("d")) {
			t=new ImageIcon("D:\\h\\d1.png");
		}
		if(p.equals("dgj")) {
			t=new ImageIcon("D:\\h\\d1gj.png");
		}
		if(p.equals("e")) {
			t=new ImageIcon("D:\\h\\e1.png");
		}
		if(p.equals("*")) {
			t=new ImageIcon("D:\\h\\t.png");
		}
		if(p.equals(" ")){
			t=new ImageIcon("D:\\h\\kb.png");
		}
		t.setImage(t.getImage().getScaledInstance(50,50,50));
		return t;
	}
}
/**
 * ��������ʵ��������Ӣ���ƶ�
 */
class PoppupYiDong extends MouseAdapter{
	DiTu a;
	String p;
	boolean flag;
	String ShuJuBao;
	PoppupYiDong(DiTu a,String p){
		this.a=a;
		this.p=p;
		flag=true;
	}
	public String getShuJuBao() {
		return ShuJuBao;
	}
	public void mousePressed(MouseEvent e) {
		PreYiDong(e);
	}
	public void mouseReleased(MouseEvent e) {
		flag=false;
	}
	void PreYiDong(MouseEvent e) {
		if(flag) {
			int x=(int)((e.getY()-62)/50);
			int y=(int)(e.getX()/50);
			//YiDong w=new YiDong(x,y,p,a);
			//Thread tw=new Thread(w);
			//tw.start();
			ShuJuBao=""+x+y;
		}
	}
}

class PoppupGongJi extends MouseAdapter{
	DiTu a;
	String p;
	boolean flag;
	PoppupGongJi(DiTu a,String p){
		this.a=a;
		this.p=p;
		flag=true;
	}
	public void mousePressed(MouseEvent e) {
		PreGongJi(e);
	}
	public void mouseReleased(MouseEvent e) {
		flag=false;
	}
	void PreGongJi(MouseEvent e) {
		if(flag) {
			System.out.println("x"+e.getX()+"   y"+e.getY());
			int x=(int)((e.getY()-62)/50);
			int y=(int)(e.getX()/50);
			System.out.println(x+"    "+y);
			System.out.println(a.ditu[x][y]);
			if(a.ditu[x][y]=="A"||a.ditu[x][y]=="B"||a.ditu[x][y]=="C"||a.ditu[x][y]=="D"||a.ditu[x][y]=="E") {
				System.out.println("���Թ���");
				a.GongJi(p, a.ditu[x][y]);
			}
			
		}
	}
}
/**
 * ���ڴ����������
 */
class TextDome extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel label;
	JTextField ZhangHu;
	JPasswordField MiMa;
	boolean flag;
	TextDome(){
		super(new FlowLayout());
		ZhangHu=new JTextField(20);
		ZhangHu.addActionListener(this);
		this.add(ZhangHu);
		MiMa=new JPasswordField(20);
		MiMa.addActionListener(this);
		this.add(MiMa);
		label=new JLabel("�������û���");
		this.add(label);
		flag=false;
	}
	public void actionPerformed(ActionEvent e) {
		Object s=e.getSource();
		if(s==ZhangHu) {
			label.setText("����������");
		}
		else if(s==MiMa) {
				String p=new String(MiMa.getPassword());
				if(p.equals("123456")) {
					flag=true;
				}
		}
	}
	/**
	 * ���ڷ��ص���״̬
	 * @return ture������ɹ���false ����ʧ��
	 */
	public boolean ShiFouChengGong() {
		return flag;
	}
}