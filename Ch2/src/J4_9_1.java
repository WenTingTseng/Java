import java.io.*;
public class J4_9_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		String[] prob= {"2+6=(  )","____ you a girl?","�ɫe____���A�ìO�a�W���C"};
		String[]  right= {"8","Are","����"};
		String ans;
		int i,count=0;
		for(i=0;i<prob.length;i++)
		{
			System.out.println("\n��"+(i+1)+"�D");
			System.out.println(prob[i]);
			System.out.println("��J����:");
			ans=keyin.readLine();
			if(ans.equals(right[i]))
			{
				System.out.println("����F!");
				count++;
			}
			else {
				System.out.println("�����F!");
				System.out.println("���T����: "+right[i]);
			}
		}
		switch(count) {
		   case 0:
		   case 1:System.out.println("\n�[�o");
		   		  break;
		   case 2:System.out.println("\n�L��");
	   		      break;
		   case 3:System.out.println("\n����A�@�Ŵ�!");
	   		      break;
		}
	}

}
