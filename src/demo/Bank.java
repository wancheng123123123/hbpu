package demo;

public abstract class Bank implements IBank{
int myMoney=0;
	@Override
	public int getMoney(int m) {
	if(m>myMoney){
		System.out.println("��������ȷ��ȡ���");
	}
	else {
		myMoney-=m;
		System.out.println("��ȡ���Ľ��Ϊ��"+m);
		System.out.println("���ĵ�ǰ���Ϊ��"+myMoney);
	}
		return m;
	}
@Override
	public void setMoney(int m) {
    myMoney+=m;
	System.out.println("������Ľ��Ϊ��"+m);	
	System.out.println("����ǰ�����Ϊ��"+myMoney);
	}

public void transfrom(Bank mbc, int m){
	if(this.getMoney(m)>this.myMoney){
		System.out.println("��������ȷ��ת�˽�");
	}
	else {
  mbc.setMoney(m);
}
}
}
