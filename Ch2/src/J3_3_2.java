import java.io.*;
public class J3_3_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J�p�{��������:");
		float km=Float.parseFloat(keyin.readLine());
		int money=75;
		km-=1.5;
		while(km>0)
		{
			money+=5;
			km-=0.3;
		}
		System.out.println("�p�{������(��):"+money);
	}

}
