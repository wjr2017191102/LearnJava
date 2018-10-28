package wangzherongyao;

/**
 * 基础英雄类包括英雄基本属性，实现基础技能
 * 并分别被战士，法师，射手，坦克，刺客五个类继承，每个类会给基本属性赋予不同的值
 * @author Dell
 *
 */

public class YingXiongLei{
	
}

class JiChuYingXiong implements JiChuJiNeng{
	/**
	 * 以下为英雄的基本属性
	 */
	int ShengMing,FaLi,JingYan,GongJi,FangYu,GongJiFanWei,DengJi;
	String ZheYe;
	String name;
	int x,y;
	/**
	 *用于设置英雄的位置
	 *@param x 横坐标
	 *@param y 纵坐标
	 */
	public void set(int x,int y){
		this.x=x;
		this.y=y;
	}
	/**
	 * 用于英雄属性的输出
	 */
	void print(){
		System.out.println(" "+name+"     "+ShengMing+"    ");
	}
	/**
	 * 用于判定敌军是否在英雄的普通攻击范围内
	 * @param x 敌军横坐标
	 * @param y 敌军纵坐标
	 * @return 在，返回true，不在，返回false
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
	 * 返回英雄的攻击力
	 */
	public int GongJi() {
		return GongJi;
	}
	/**
	 * 英雄受伤的生命减少
	 * @param ShangHai 受到的伤害值
	 */
	public void ShouShang(int ShangHai) {
		ShengMing-=ShangHai;
	}
	/**
	 * 判定英雄是否阵亡
	 * @return 是，返回true，不是，返回false
	 */
	boolean ShiFouSiWang() {
		if(ShengMing<=0) return true;
		else return false;
	}
}

class ZhanShi extends JiChuYingXiong implements JiChuJiNeng{
	/**
	 * 设置属于战士英雄的特有属性
	 * @param p 名字
	 * @param x 横坐标
	 * @param y 纵坐标
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
	 * 返回英雄的攻击力
	 */
	public int GongJi() {
		return GongJi;
	}
	/**
	 * 英雄受伤的生命减少
	 * @param ShangHai 受到的伤害值
	 */
	public void ShouShang(int ShangHai) {
		ShengMing-=ShangHai;
	}
	/**
	 * 战士英雄的被动技能
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
		System.out.println("装备了护甲");
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
		System.out.println("生命值提升了50");
		return 50;
	}
}

class DaHuJia implements HuJia{
	public int ShengMingJiaChen() {
		System.out.println("生命值提升了100");
		return 100;
	}
}

