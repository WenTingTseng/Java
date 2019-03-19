import java.awt.*;
import javax.swing.*;

class CFlowLayoutF extends JFrame{
	CFlowLayoutF(){
		String st[]= {"畫直線","畫矩形","畫橢圓","實心矩","實心圓"};
		JButton btnDraw[]=new JButton[st.length];
		for(int i=0;i<st.length;i++)
		{
			btnDraw[i]=new JButton(st[i]);
			add(btnDraw[i]);
		}
		setTitle("FlowLayout佈局方式");
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
