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
			System.out.println("�п�J�K�X:");
			String pw_keyin=keyin.readLine();
			if(pw_keyin.equals(pw))
			{
				System.out.println("�K�X���T�A�w����{");
				is_pass=true;
				break;
			}
			else
			{
				System.out.println("��"+count+"���K�X��J���~!\n");
			}
		}while(count<3);
		if(!is_pass) System.out.println("�T���K�X���~�A�ڵ��ϥ�!");
	}
}
