package debug;
import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		triangle t=new triangle();
		do {
			System.out.println("�M��J�T���Ϊ��T��a�Bb�Bc:");
			Scanner scanner=new Scanner(System.in);
			a=scanner.nextInt();b=scanner.nextInt();c=scanner.nextInt();
		}while(a<=0 && b<=0 && c<=30);
		
		
		t.checkTriangle(a,b,c);
		
	}
	private void checkTriangle(int a,int b,int c)
	{
		
		if(a + b >= c && a + c >= b && b + c >= a)
			System.out.println("�o�O�@�ӤT����");
		else if((a==b)&&(b==c)&&(a==c))
			System.out.println("�o�O�@�ӥ��T����");
		else if((a==b)||(b==c)||(a==c))
			System.out.println("�o�O�@�ӵ��y�T����");
		assert false;
	}

}
