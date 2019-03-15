import java.io.*;
public class J4_3_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		int[] data;
		int i,len;
		System.out.println("請輸入陣列的大小:");
		len=Integer.parseInt(keyin.readLine());
		data=new int[len];
		for(i=0;i<len;i++)
		{
			data[i]=(i+10)*(i+10);
			if(i==len-1)
				System.out.print(data[i]);
			else
				System.out.print(data[i]+",");
		}
	}
}
