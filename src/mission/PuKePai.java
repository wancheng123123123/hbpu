package mission;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class PuKePai implements IPai{	
	@Override
	public void xiPai() {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		LinkedList list=new LinkedList();
		LinkedList p=new LinkedList();
		int random1,random,random3,n=0,i = 0;
		String[] s1={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] s3={"黑桃","红桃","方块","梅花"};
		while(hs.size()<52){
			random1 = (int) ( Math.random () * 13);
			random3 = (int) (Math.random()*4);
			String st=s3[random3]+s1[random1];
			hs.add(st);       
		}
		hs.add("大王");
		hs.add("小王");
	    
		Iterator it=hs.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			list.add(obj);
			//System.out.print(obj+"  ");
		}
		while(i<54){
			
			random =(int)(Math.random()*54);
			if(!p.contains(random)){  
				System.out.print(list.get(random)+" ");
				p.add(random);
				i++;
			}
		}
	}


public static void main(String[] args) {
	PuKePai xip=new PuKePai();
	xip.xiPai();
    
}
}