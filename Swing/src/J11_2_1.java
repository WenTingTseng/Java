import java.awt.*;
import javax.swing.*;

class CTextAreaF extends JFrame{
	CTextAreaF(){
		JPanel pan=new JPanel();
		add(pan);
		JLabel lalPoetry=new JLabel("黃鶴樓");
		pan.add(lalPoetry);
		
		String st1="昔人已乘黃鶴去， 此地空餘黃鶴樓。\n";
		String st2="黃鶴一去不復返， 白雲千載空悠悠。\n";
		String st3="晴川歷歷漢陽樹， 芳草萋萋鸚鵡洲。 日暮鄉關何處是， 煙波江上使人愁。";
		
		JTextArea txtPoetry=new JTextArea(st1,4,9);
		txtPoetry.setBorder(BorderFactory.createLineBorder(Color.blue));
		txtPoetry.setLineWrap(true);
		txtPoetry.append(st2);
		txtPoetry.append(st3);
		JScrollPane span=new JScrollPane(txtPoetry,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS
				,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		pan.add(span);
		
		setTitle("捲動頁面");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class J11_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CTextAreaF();
	}

}
