import java.io.*;
public class J3_3_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		String pw="Java";
		boolean is_pass=false;
		do {
			count++;
			System.out.println("請輸入密碼:");
			String pw_keyin=keyin.readLine();
			if(pw_keyin.equals(pw))
			{
				System.out.println("密碼正確，歡迎光臨");
				is_pass=true;
				break;
			}
			else
			{
				System.out.println("第"+count+"次密碼輸入錯誤!\n");
			}
		}while(count<3);
		if(!is_pass) System.out.println("三次密碼錯誤，拒絕使用!");
	}
}
