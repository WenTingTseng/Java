import java.io.*;
public class J2_6_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("��J�f�~�W��:");
		String goods_name=keyin.readLine();
		System.out.println("��J���:");
		float price=Float.parseFloat(keyin.readLine());
		System.out.println("��J�ƶq:");
		int num=Integer.parseInt(keyin.readLine());
		float money=price*num;
		
		System.out.println("\n�f�~�W��\t���\t�ƶq\t���B");
		System.out.println(goods_name+"\t"+price+"\t"+num+"\t"+money);
		
	}

}
