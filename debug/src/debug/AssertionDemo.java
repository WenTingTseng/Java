package debug;

import java.util.Scanner;


public class AssertionDemo {

	public static void main(String[] args) {
		AssertionDemo demo = new AssertionDemo();
		float x;int money,datenum;
		System.out.println("�п�J�~�Q�v�B�s�ڪ��B�B����");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextFloat();money=scanner.nextInt();datenum=scanner.nextInt();
		
		demo.checkMoney(x, datenum, money);
	}
	private void checkMoney(float x,int datenum,int money)
	{
		
		
		final double POSITIVE_INFINITY = 1.0 / 0.0;
		float count=x/datenum;
		float result=money*(1+count);
		assert count<POSITIVE_INFINITY:"���~!";
		System.out.println(result);
		
	}
}
	
//	/*
//	 * Using assert
//	 */
//	private void checkWithAssert(int value) {
//		if (value % 3 == 0) {
//			System.out.println("3n");
//		} else if (value % 3 == 1) {
//			System.out.println("3n+1");
//		} else { // value %3 ==2
//			assert (value % 3 == 2):"���~!";
//			System.out.println("3n+2");
//		}
//	}
