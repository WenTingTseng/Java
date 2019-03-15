import javax.swing.*;
import java.awt.event.*;

class CLoginF extends JFrame implements ActionListener
{
	private JTextField txtID,txtShow;
	private JPasswordField pwfPW;
	private JButton btnOK,btnReset;
	CLoginF(){
		JLabel lbTitle=new JLabel("請輸入帳號密碼");
		lbTitle.setBounds(60,10,200,20); add(lbTitle);
		
		JLabel lbID=new JLabel("帳號:");
		lbID.setBounds(30,50,50,20);  	add(lbID);
		
		JTextField txtID=new JTextField("");
		txtID.setBounds(70,50,120,20);	add(txtID);
		
		JLabel lbPW=new JLabel("密碼:");
		lbPW.setBounds(30,80,50,20);  	add(lbPW);
		
		JPasswordField pwfPW=new JPasswordField("");
		pwfPW.setBounds(70,80,120,20);	add(pwfPW);
		pwfPW.setEchoChar('*');
		
		JTextField txtShow=new JTextField("");
		txtShow.setBounds(30,120,160,20); add(txtShow);
		txtShow.setEditable(false);
		
		JButton btnOK=new JButton("確定");   add(btnOK);
		btnOK.setBounds(40,160, 60, 20);
		btnOK.addActionListener(this);
		JButton btnReset=new JButton("重來"); add(btnReset);
		btnReset.setBounds(120,160, 60, 20); 
		btnOK.addActionListener(this);
		
		setTitle("登入");
		setBounds(100,100,235,230);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnReset) {
			txtID.setText("");
			pwfPW.setText("");
			txtShow.setText("");
		}
		if(e.getSource()==btnOK || e.getSource()==txtID ||e.getSource()==pwfPW)
		{
			String pw=new String(pwfPW.getPassword());
			if(txtID.getText().equals("change") && pw.equals("test123"))
			{
				

			}
			else
			{
				System.out.println("帳號密碼錯誤，請重新輸入!");
			}
		}
	}
}

public class J8_3_2 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLoginF loginF=new CLoginF();
	}

}
