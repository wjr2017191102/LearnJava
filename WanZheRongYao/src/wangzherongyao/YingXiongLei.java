package wangzherongyao;

/**
 * ����Ӣ�������Ӣ�ۻ������ԣ�ʵ�ֻ�������
 * ���ֱ�սʿ����ʦ�����֣�̹�ˣ��̿������̳У�ÿ�������������Ը��費ͬ��ֵ
 * @author Dell
 *
 */

public class YingXiongLei{
	
}

class JiChuYingXiong implements JiChuJiNeng{
	/**
	 * ����ΪӢ�۵Ļ�������
	 */
	int ShengMing,FaLi,JingYan,GongJi,FangYu,GongJiFanWei,DengJi;
	String ZheYe;
	String name;
	int x,y;
	/**
	 *��������Ӣ�۵�λ��
	 *@param x ������
	 *@param y ������
	 */
	public void set(int x,int y){
		this.x=x;
		this.y=y;
	}
	/**
	 * ����Ӣ�����Ե����
	 */
	void print(){
		System.out.println(" "+name+"     "+ShengMing+"    ");
	}
	/**
	 * �����ж��о��Ƿ���Ӣ�۵���ͨ������Χ��
	 * @param x �о�������
	 * @param y �о�������
	 * @return �ڣ�����true�����ڣ�����false
	 */
	public boolean ShiFouChengGong(int x,int y) {
		int m=this.x-x;
		if(m<0) m=-m;
		int n=this.y-y;
		if(n<0) n=-n;
		if(m+n<=GongJiFanWei) return true;
		else return false;
	}
	/**
	 * ����Ӣ�۵Ĺ�����
	 */
	public int GongJi() {
		return GongJi;
	}
	/**
	 * Ӣ�����˵���������
	 * @param ShangHai �ܵ����˺�ֵ
	 */
	public void ShouShang(int ShangHai) {
		ShengMing-=ShangHai;
	}
	/**
	 * �ж�Ӣ���Ƿ�����
	 * @return �ǣ�����true�����ǣ�����false
	 */
	boolean ShiFouSiWang() {
		if(ShengMing<=0) return true;
		else return false;
	}
}

class ZhanShi extends JiChuYingXiong implements JiChuJiNeng{
	/**
	 * ��������սʿӢ�۵���������
	 * @param p ����
	 * @param x ������
	 * @param y ������
	 */
	ZhanShi(String p,int x,int y){
		this.x=x;
		this.y=y;
		name=p;
		ZheYe="ZhanShi";
		ShengMing=100;
		FaLi=0;
		JingYan=0;
		GongJi=50;
		FangYu=50;
		GongJiFanWei=1;
		DengJi=1;
	}
	/**
	 * ����Ӣ�۵Ĺ�����
	 */
	public int GongJi() {
		return GongJi;
	}
	/**
	 * Ӣ�����˵���������
	 * @param ShangHai �ܵ����˺�ֵ
	 */
	public void ShouShang(int ShangHai) {
		ShengMing-=ShangHai;
	}
	/**
	 * սʿӢ�۵ı�������
	 */
	public void QiangHua() {
		GongJi+=50;
	}
	HuJia hujia;
	ZhanShi HuiDiao(HuJia hujia,ZhanShi a) {
		this.hujia=hujia;
		return a;
	}
	void ZhuangBei() {
		System.out.println("װ���˻���");
		ShengMing+=hujia.ShengMingJiaChen();
	}
}

class FaShi extends JiChuYingXiong implements JiChuJiNeng{
	FaShi(String p,int x,int y){
		this.x=x;
		this.y=y;
		name=p;
		ZheYe="FaShi";
		ShengMing=100;
		FaLi=100;
		JingYan=0;
		GongJi=10;
		FangYu=50;
		GongJiFanWei=2;
		DengJi=1;
	}
	public int GongJi() {
		return GongJi;
	}
	public void ShouShang(int ShangHai) {
		ShengMing-=ShangHai;
	}
	public void ShiFang(int XiaoHao) {
		FaLi-=XiaoHao;
	}
}

class TanKe extends JiChuYingXiong implements JiChuJiNeng{
	TanKe(String p,int x,int y){
		this.x=x;
		this.y=y;
		name=p;
		ZheYe="TanKe";
		ShengMing=200;
		FaLi=0;
		JingYan=0;
		GongJi=20;
		FangYu=60;
		GongJiFanWei=1;
		DengJi=1;
	}
	public int GongJi() {
		return GongJi;
	}
	public void ShouShang(int ShangHai) {
		ShengMing-=ShangHai;
	}
	public void QiangHua() {
		FangYu+=20;
	}
}

class SheShou extends JiChuYingXiong implements JiChuJiNeng{
	SheShou(String p,int x,int y){
		this.x=x;
		this.y=y;
		name=p;
		ZheYe="SheShou";
		ShengMing=100;
		FaLi=0;
		JingYan=0;
		GongJi=50;
		FangYu=50;
		GongJiFanWei=3;
		DengJi=1;
	}
	public int GongJi() {
		return GongJi;
	}
	public void ShouShang(int ShangHai) {
		ShengMing-=ShangHai;
	}
}

class ChiKe extends JiChuYingXiong implements JiChuJiNeng{
	ChiKe(String p,int x,int y){
		this.x=x;
		this.y=y;
		name=p;
		ZheYe="ChiKe";
		ShengMing=100;
		FaLi=0;
		JingYan=0;
		GongJi=70;
		FangYu=40;
		GongJiFanWei=1;
		DengJi=1;
	}
	public int GongJi() {
		return GongJi;
	}
	public void ShouShang(int ShangHai) {
		ShengMing-=ShangHai;
	}
}

interface HuJia{
	public int ShengMingJiaChen();
}

class XiaoHuJia implements HuJia{
	public int ShengMingJiaChen() {
		System.out.println("����ֵ������50");
		return 50;
	}
}

class DaHuJia implements HuJia{
	public int ShengMingJiaChen() {
		System.out.println("����ֵ������100");
		return 100;
	}
}

