package debug;

import java.util.Scanner;

public class ExceptionTriangle {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a,b,c;
		
		System.out.println("清輸入三角形的三邊a、b、c:");
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
			System.out.println("這是一個三角形");
		else if((a==b)&&(b==c)&&(a==c))
			System.out.println("這是一個正三角形");
		else if((a==b)||(b==c)||(a==c))
			System.out.println("這是一個等腰三角形");	
	}
}
class WrongTriangle extends Exception{
	
	int wa,wb,wc;
	public WrongTriangle(int a,int b,int c)
	{
		super("三角形邊長小於等於零造成錯誤");
		this.wa=a;
		this.wb=b;
		this.wc=c;
	}
	public String getMessage()
	{
		return "錯誤邊長"+wa+","+wb+","+wc+"造成錯誤!";
	}
	
}
