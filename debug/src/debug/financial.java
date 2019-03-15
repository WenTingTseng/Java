package debug;
import java.util.Scanner;
import java.util.*;

public class financial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		financial demo = new financial();
		float x;int money,datenum;
		System.out.println("請輸入年利率、存款金額、期數");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextFloat();money=scanner.nextInt();datenum=scanner.nextInt();
		
		demo.checkMoney(x, datenum, money);

	}
	
	private void checkMoney(float x,int datenum,int money)
	{
		double count=(double)Math.pow((1+(x/datenum)),datenum);
		float result=(float) ((float)money*count);
		assert count<Math.E:"錯誤";
		System.out.println(result);
		
	}

}
