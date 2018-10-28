package wangzherongyao;


interface JiChuJiNeng{
	public int GongJi();
	public void ShouShang(int ShangHai);
}

class FaZheng{
	/**
	 * 以下为阵法的基本属性
	 */
	String name;
	int ShiFangFanWei;
	int x,y;
	boolean BiaoZhi;
	/**
	 * 阵法初始化
	 * @param p
	 */
	FaZheng(String p){
		name=p;
		ShiFangFanWei=3;
	}
	/**
	 * 阵法位置的设置
	 * @param x
	 * @param y
	 */
	public void set(int x,int y){
		this.x=x;
		this.y=y;
	}
	/**
	 * 用于判定阵法是呈现于战场，还是直接造成伤害
	 * @param x
	 * @param y
	 * @param p
	 * @return
	 */
	boolean ZhanKai(int x,int y,String p) {
		if(p.equals(" ")) return true;
		else {
			if(this.x==x&&this.y==y) {	
				BiaoZhi=true;
				if(name.equals("O")) {
					if(p.equals("A")||p.equals("B")||p.equals("C")||p.equals("E")||p.equals("D")) {
						BiaoZhi=false;
					}
				}
				else {
					if(p.equals("a")||p.equals("b")||p.equals("c")||p.equals("e")||p.equals("d")) {
						BiaoZhi=false;
					}
				}
			}
			return false;
		}
	}
	/**
	 * 用于判定释放的阵法是否在法师攻击范围之外
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean ShiFouChengGong(int x,int y) {
		int m=this.x-x;
		if(m<0) m=-m;
		int n=this.y-y;
		if(n<0) n=-n;
		if(m+n<=ShiFangFanWei) return true;
		else return false;
	}
	/**
	 * 
	 * @return 消耗的法力值
	 */
	public int XiaoHao() {
		return 50;
	}
	/**
	 * 
	 * @return 造成的伤害
	 */
	int ShangHai() {
		return 50;
	}
}

class Jian{
	String GuiShu;
	String name;
	int x,y;
	boolean BiaoZhi;
	Jian(String p){
		GuiShu=p;
	}
	void set(String p){
		name=p;
	}
	boolean QianJin(String p) {
		if(p.equals(" ")) return true;
		else {
			BiaoZhi=true;
			if(GuiShu.equals("D")) {
				if(p.equals("A")||p.equals("B")||p.equals("C")||p.equals("E")) {
					BiaoZhi=false;
				}
			}
			else {
				if(p.equals("a")||p.equals("b")||p.equals("c")||p.equals("e")) {
					BiaoZhi=false;
				}
			}
			return false;
		}
	}
	void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	int ShangHai() {
		if(BiaoZhi) return 50;
		else return 0;
	}
}

class FenShen{
	String name;
	int x,y;
	boolean BiaoZhi;
	FenShen(String p){
		name=p;
	}
	void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	int ShangHai() {
		if(BiaoZhi) return 50;
		else return 0;
	}
	boolean GongJi(String p) {
		if(p.equals(" ")||p.equals("*")) return false;
		else {
			BiaoZhi=true;
			if(name.equals("E")) {
				if(p.equals("A")||p.equals("B")||p.equals("C")||p.equals("D")) {
					BiaoZhi=false;
				}
			}
			else {
				if(p.equals("a")||p.equals("b")||p.equals("c")||p.equals("d")) {
					BiaoZhi=false;
				}
			}
			return true;
		}
	}
}

class Dun{
	String name;
	int x1,y2,x2,y1;
	boolean BiaoZhi;
	void set(int x,int y) {
		x1=x;
		y1=y;
		x2=x1;
		y2=y1-1;
	}
	Dun(String p){
		name=p;
		BiaoZhi=false;
	}
	void ZhanKai() {
		BiaoZhi=true;
	}
	void ShouHui() {
		BiaoZhi=false;
	}
}

