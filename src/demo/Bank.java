package demo;

public abstract class Bank implements IBank{
int myMoney=0;
	@Override
	public int getMoney(int m) {
	if(m>myMoney){
		System.out.println("请输入正确的取款金额！");
	}
	else {
		myMoney-=m;
		System.out.println("您取出的金额为："+m);
		System.out.println("您的当前余额为："+myMoney);
	}
		return m;
	}
@Override
	public void setMoney(int m) {
    myMoney+=m;
	System.out.println("您存入的金额为："+m);	
	System.out.println("您当前的余额为："+myMoney);
	}

public void transfrom(Bank mbc, int m){
	if(this.getMoney(m)>this.myMoney){
		System.out.println("请输入正确的转账金额！");
	}
	else {
  mbc.setMoney(m);
}
}
}
