import javax.swing.*;

class CLabelF extends JFrame{
	CLabelF(){
		JLabel lbl1=new JLabel("1.標籤文字");
		lbl1.setBounds(10,10,270,45);
		add(lbl1);
		
		ImageIcon icon=new ImageIcon("images/3.gif");
		JLabel lbl2=new JLabel("2.標籤圖示和文字",icon,SwingConstants.RIGHT);
		
		lbl2.setBounds(10,60,270,45);
		add(lbl2);
		
		setTitle("JLabel的運用");
		setLayout(null);
		setBounds(100,100,300,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}
public class J8_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLabelF label=new CLabelF();
	}

}
