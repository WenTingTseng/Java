import java.io.*;
public class J4_6_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		int[] account= {18,14,12,16,10};
		String[] name= {"王五","張三","陳二","李四","鄭一"};
		int i,num,search_num;
		System.out.println("\n線性搜尋法:");
		System.out.print("輸入編號:");
		search_num=Integer.parseInt(keyin.readLine());
		num=-1;
		for(i=0;i<account.length;i++)
		{
			if(account[i]==search_num)
			{
				num=i;
			    break;
			}
		}
		if(num==-1)
			System.out.println("\n查無此編號");
		else {
			System.out.println("\n編號\t姓名");
			System.out.println(" "+account[num]+"\t"+name[num]);
		}
	}

}
