package demo;

public class MBC extends Bank{

@Override
public int getMoney(int m) {
  int i=0;
	if(m>myMoney){
	   System.out.println("��������ȷ�Ľ�");
   }
   else{
	   if(m%100>0){
		  i=i+1; 
	   }
	   i=i+m/100;
	   System.out.println("����ȡ����Ҫ���ɵ����ʶ�Ϊ��"+i);
	   super.getMoney(m+i);
	 
   } 
     return m+i;
}
	
}
