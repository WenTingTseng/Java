import java.awt.*;
import javax.swing.*;

class CTabPaneF extends JFrame{
	CTabPaneF(){
		JTabbedPane tpan=new JTabbedPane();
		tpan.setBounds(10,10,220,180);
		add(tpan);
		
		String st="黃鶴樓--唐.崔顥\n"
				+"昔人已乘黃鶴去， 此地空餘黃鶴樓。\n"
				+"黃鶴一去不復返， 白雲千載空悠悠。\n"
				+"晴川歷歷漢陽樹， 芳草萋萋鸚鵡洲。\n"
				+ " 日暮鄉關何處是， 煙波江上使人愁。";
		JTextArea txtPoetry=new JTextArea(st);
		txtPoetry.setLineWrap(true);
		tpan.addTab("七言律詩",txtPoetry);
		
		JLabel lblPic=new JLabel(new ImageIcon("2.jpg"));
		tpan.addTab("照片", lblPic);
		
		setTitle("頁籤");
		setLayout(null);
		setBounds(50,50,250,230);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
public class J11_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CTabPaneF();
	}

}
