package debug;

import java.util.Scanner;

public class ExceptionTriangle {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a,b,c;
		
		System.out.println("�M��J�T���Ϊ��T��a�Bb�Bc:");
		Scanner scanner=new Scanner(System.in);
		try {
			a=scanner.nextInt();
			b=scanner.nextInt();
			c=scanner.nextInt();
			checkTriangle(a,b,c);
			
		}catch(IllegalArgumentException e) {
			e.getMessage();
			e.printStackTrace();
		}
	
	}
	public static void checkTriangle(int a,int b,int c) throws Exception{
		if(a<=0 || b<=0 || c<=0)
			throw new WrongTriangle(a,b,c);
		if(a + b >= c && a + c >= b && b + c >= a)
			System.out.println("�o�O�@�ӤT����");
		else if((a==b)&&(b==c)&&(a==c))
			System.out.println("�o�O�@�ӥ��T����");
		else if((a==b)||(b==c)||(a==c))
			System.out.println("�o�O�@�ӵ��y�T����");	
	}
}
class WrongTriangle extends Exception{
	
	int wa,wb,wc;
	public WrongTriangle(int a,int b,int c)
	{
		super("�T��������p�󵥩�s�y�����~");
		this.wa=a;
		this.wb=b;
		this.wc=c;
	}
	public String getMessage()
	{
		return "���~���"+wa+","+wb+","+wc+"�y�����~!";
	}
	
}
