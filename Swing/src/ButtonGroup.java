import javax.swing.*;

class CRadioF extends JFrame
{
	CRadioF(){
		JPanel pan=new JPanel(); 
		add(pan);
		JLabel lblRdbAlign=new JLabel("�п�ܹ���覡:");
		pan.add(lblRdbAlign);
		
		JRadioButton[] rdbAlign=new JRadioButton[3];
		rdbAlign[0]=new JRadioButton("�a��",true);
		rdbAlign[1]=new JRadioButton("�m��");
		rdbAlign[2]=new JRadioButton("�a�k");
		
		ButtonGroup grpRdb=new ButtonGroup();
		for(int i=0;i<rdbAlign.length;i++)
		{
			//grpRdb.add
			pan.add(rdbAlign[i]);
		}
		setTitle("JRadioButton");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class ButtonGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CRadioF();
	}

}
