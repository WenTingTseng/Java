
class CPenScore {
	protected String name;
	protected int pen_score;
	
	public void SetPenData(String name,int score)
	{
		this.name=name;
		this.pen_score=score;
	}
	public void ShowPenScore()
	{
		System.out.println("\n���զ��Z:");
		System.out.println("�m�W:"+name);
		System.out.println("���դ���:"+pen_score);
	}
}
class CTotalScore extends CPenScore
{
	private int oral_score;
	private int tot_score;
	
	public void SetOralScore(int score)
	{
		 oral_score=score;
	}
	public void ShowToScore() {
		System.out.println("\n�`���Z:");
		System.out.println("�m�W:"+name);
		System.out.println("���դ���:"+pen_score);
		System.out.println("�f�դ���:"+oral_score);
		System.out.println("===================================");
		tot_score=oral_score+pen_score;
		System.out.println("�`����:"+tot_score);
	}
}
public class J7_1_1{
	public static void main(String[] args) {
		CPenScore p1=new CPenScore();
		p1.SetPenData("�i�T�l", 50);
		p1.ShowPenScore();
		
		CTotalScore p2=new CTotalScore();
		p2.SetPenData("����", 60);
		p2.SetOralScore(20);
		p2.ShowToScore();
	}
	
}
