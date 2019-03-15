
public class J4_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {18,14,12,16,10};
		int i,j,k,temp;
		System.out.print("排序前:");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=3;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j+1];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				System.out.print("第"+(4-i)+"次:");
				for(k=0;k<a.length;k++)
				{
					System.out.println(a[k]+" ");
				} 
				System.out.println();
			}
		}
	}

}
