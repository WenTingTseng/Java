import java.awt.*;
import javax.swing.*;

class CFlowLayoutF extends JFrame{
	CFlowLayoutF(){
		String st[]= {"�e���u","�e�x��","�e���","��߯x","��߶�"};
		JButton btnDraw[]=new JButton[st.length];
		for(int i=0;i<st.length;i++)
		{
			btnDraw[i]=new JButton(st[i]);
			add(btnDraw[i]);
		}
		setTitle("FlowLayout�G���覡");
		setLayout(new FlowLayout());	
		setBounds(50,50,180,140);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
public class J11_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CFlowLayoutF();
	}
}
