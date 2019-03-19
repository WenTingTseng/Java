import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CComboF extends JFrame implements ItemListener{
	private JLabel lblHead=new JLabel("血型與個性分析");
	private String[] blood= {"請選擇","A型","B型","AB型","O型"};
	private JComboBox<String> cbcBlood=new JComboBox<String>(blood);
	private JPanel pan=new JPanel();
	private JTextArea txtShow=new JTextArea("個性分析:",4,4);
	
	CComboF(){
		pan.add(lblHead);
		cbcBlood.addItemListener(this);
		pan.add(cbcBlood);
		
		add(pan,BorderLayout.NORTH);
		add(txtShow,BorderLayout.SOUTH);
		setTitle("下拉式清單");
		setBounds(50,50,220,180);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		switch((String)e.getItem()) {
			case "請選擇":
				txtShow.setText("個性分析");
				break;
			case "A型":
				txtShow.setText("A型的人:\n個性溫和，穩重踏實。\n感情豐富，誠實而謙虛");
				break;
			case "B型":
				txtShow.setText("B型的人:\n個性灑脫，光明磊落。\n不居小節，親切而曠達");
				break;
			case "AB型":
				txtShow.setText("AB型的人:\n兼具A型與B型的特質。\n善變，不喜歡墨守成規");
				break;
			case "O型":
				txtShow.setText("O型的人:\n樂觀進取，明朗外向。\n意志堅定，熱情而有自信");
				break;
		}
	}
	
}
public class J11_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CComboF();
	}

}
