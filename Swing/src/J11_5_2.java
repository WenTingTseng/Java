import java.awt.*;
import javax.swing.*;

class CCheckF extends JFrame{
	CCheckF(){
		JPanel pan=new JPanel();
		add(pan);
		JLabel lblChkStyle=new JLabel("�п�ܦۦ�˦�:");
		pan.add(lblChkStyle);
		
		JCheckBox[] chkStytle=new JCheckBox[3];
		chkStytle[0]=new JCheckBox("�@��");
		chkStytle[1]=new JCheckBox("����",true);
		chkStytle[2]=new JCheckBox("����");
		
		for(int i=0;i<chkStytle.length;i++)
			pan.add(chkStytle[i]);
		
		setTitle("JCheckBox");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}
public class J11_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CCheckF();
	}

}
