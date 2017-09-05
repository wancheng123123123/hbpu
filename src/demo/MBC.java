package demo;

public class MBC extends Bank{

@Override
public int getMoney(int m) {
  int i=0;
	if(m>myMoney){
	   System.out.println("请输入正确的金额！");
   }
   else{
	   if(m%100>0){
		  i=i+1; 
	   }
	   i=i+m/100;
	   System.out.println("本次取款需要交纳的利率额为："+i);
	   super.getMoney(m+i);
	 
   } 
     return m+i;
}
	
}
