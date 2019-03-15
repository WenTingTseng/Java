import java.io.*;

public class J2_6_1 {
	public static void main(String[] args) throws Exception{
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		double w1,w2,avg;
		
		System.out.println("請輸入第一個體重:");
		//String st=keyin.readLine();
		w1=Double.parseDouble(keyin.readLine());
		
		System.out.println("請輸入第二個體重:");
		w2=Double.parseDouble(keyin.readLine());
		avg=(w1+w2)/2;
		//String st_ave=String.valueOf(avg);
		System.out.println("兩人平均體重: "+String.valueOf(avg));
	}
}
