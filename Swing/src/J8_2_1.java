import javax.swing.*;

class CMyFrame extends JFrame
{
	CMyFrame(){
		setTitle("第一個視窗");
		setBounds(80,80,210,210);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class J8_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyFrame frame1=new CMyFrame();
		CMyFrame frame2=new CMyFrame();
		frame2.setTitle("第二個視窗");
		frame2.setBounds(200,180,300,250);
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
