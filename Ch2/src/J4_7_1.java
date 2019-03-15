import java.io.*;
public class J4_7_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] letter= {"a","e","i","o","u"};
		int[] count= {0,0,0,0,0};
		String str,sentence;
		int i,j;
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入英文句子");
		sentence=keyin.readLine();
		for(i=0;i<sentence.length();i++)
		{
			str=sentence.substring(i,i+1);
			for(j=0;j<letter.length;j++)
			{
				if(letter[j].equals(str.toLowerCase())) 
				{
					count[j]++;
					break;
				}
			}
		}
		for(i=0;i<letter.length;i++)
		{
			System.out.println(letter[i]+"="+count[i]+" 次");
		}
	}

}
