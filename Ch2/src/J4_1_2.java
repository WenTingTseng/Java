import java.io.*;
public class J4_1_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] data=new int[5];
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		int i,max_num;
		for(i=0;i<data.length;i++)
		{
			System.out.println("��"+(i+1)+"�Ӽ�:");
			data[i]=Integer.parseInt(keyin.readLine());
		}
		System.out.println();
		max_num=data[0];
		for(i=1;i<data.length;i++)
		{
			if(data[i]>max_num) max_num=data[i];
		}
		System.out.println("�̤j��"+":"+max_num);
	}

}
