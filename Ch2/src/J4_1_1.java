import java.io.*;
public class J4_1_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		float[] data=new float[5];
		int i;
		float sum=0;
		
		for(i=0;i<5;i++)
		{
			System.out.println("²Ä"+(i+1)+"­Ó¼Æ:");
			data[i]=Float.parseFloat(keyin.readLine());
		}
		for(i=0;i<5;i++)
		{
			System.out.println("data["+i+"]"+"="+data[i]);
			sum+=data[i];
		}
		System.out.println("sum"+"="+sum);
	}

}
