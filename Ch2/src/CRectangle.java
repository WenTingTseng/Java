
public class CRectangle {
	private int high;
	private int wide;
	private int area=0;
	private int peri=0;
	
	public void SetValue(int h,int w)
	{
		high=h;
		wide=w;	
		CalArea();
		CalPeri();
	}
	private void CalArea()
	{
		area=high*wide;
	}
	private void CalPeri()
	{
		peri=(high+wide)*2;
	}
	public int GetArea()
	{
		return area;
	}
	int GetPeri()
	{
		return peri;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CRectangle rec1=new  CRectangle();
		 int h=15;
		 int w=12;
		 rec1.SetValue(h, w);
		 
		 
		 System.out.println("*****�x�Τ@****");
		 System.out.println("����= "+rec1.high);
		 System.out.println("�e��= "+rec1.wide);
		 System.out.println("���n= "+rec1.GetArea());
		 System.out.println("�P��= "+rec1.GetPeri());
	}

}
