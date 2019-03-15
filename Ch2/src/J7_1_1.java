
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
		System.out.println("\n筆試成績:");
		System.out.println("姓名:"+name);
		System.out.println("筆試分數:"+pen_score);
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
		System.out.println("\n總成績:");
		System.out.println("姓名:"+name);
		System.out.println("筆試分數:"+pen_score);
		System.out.println("口試分數:"+oral_score);
		System.out.println("===================================");
		tot_score=oral_score+pen_score;
		System.out.println("總分數:"+tot_score);
	}
}
public class J7_1_1{
	public static void main(String[] args) {
		CPenScore p1=new CPenScore();
		p1.SetPenData("張三峽", 50);
		p1.ShowPenScore();
		
		CTotalScore p2=new CTotalScore();
		p2.SetPenData("王五", 60);
		p2.SetOralScore(20);
		p2.ShowToScore();
	}
	
}
