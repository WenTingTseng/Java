import javax.swing.*;
import java.awt.event.*;

class CMouseAdapF extends JFrame{
		private JLabel lblShow,lblPic;
		private ImageIcon icon1,icon2,icon3;
		
		CMouseAdapF(){
			lblShow=new JLabel("�ƹ����A:");
			lblShow.setBounds(20,10,200,30);   add(lblShow);
			icon1=new ImageIcon("images/1.jpg");
			icon2=new ImageIcon("images/2.jpg");
			icon3=new ImageIcon("images/3.jpg");
			lblPic=new JLabel(icon1);		add(lblPic);
			lblPic.setBounds(70,70,60,60);
			lblPic.addMouseListener(new CMouseAdap());
			
			setLayout(null);
			setBounds(100,100,220,200);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		class CMouseAdap extends MouseAdapter
		{
			public void mouseEntered(MouseEvent e)
			{
				lblShow.setText("�ƹ����A:�ƹ����в��J");
				lblPic.setIcon(icon2);
			}
			public void mouseExited(MouseEvent e)
			{
				lblShow.setText("�ƹ����A:�ƹ����в��X");
				lblPic.setIcon(icon1);
			}
			public void mousePressed(MouseEvent e)
			{
				lblShow.setText("�ƹ����A:�ƹ����U");
				lblPic.setIcon(icon3);
			}
			public void mouseReleased(MouseEvent e)
			{
				lblShow.setText("�ƹ����A:�ƹ���}");
				lblPic.setIcon(icon2);
			}
		}
}
public class J8_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMouseAdapF mouseF=new CMouseAdapF(); 
	}

}
