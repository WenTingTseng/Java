import java.io.*;
public class J2_6_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("輸入貨品名稱:");
		String goods_name=keyin.readLine();
		System.out.println("輸入單價:");
		float price=Float.parseFloat(keyin.readLine());
		System.out.println("輸入數量:");
		int num=Integer.parseInt(keyin.readLine());
		float money=price*num;
		
		System.out.println("\n貨品名稱\t單價\t數量\t金額");
		System.out.println(goods_name+"\t"+price+"\t"+num+"\t"+money);
		
	}

}
