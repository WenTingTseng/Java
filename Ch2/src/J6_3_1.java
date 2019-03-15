class CCircle{
	private int radius;
	
	public CCircle()
	{
		radius=10;
		System.out.println("¥b®|="+radius);
	}
	public double GetArea()
	{
		return radius*radius*3.14;
	}
}
public class J6_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle c1=new CCircle();
		System.out.println("­±¿n="+c1.GetArea());
	}

}
