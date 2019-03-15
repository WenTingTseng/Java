import javax.swing.*;
import java.awt.event.*;

class CKeyF extends JFrame implements ActionListener
{
	private JLabel lblKey,lblChar;
	private JTextField txtInput;
	private JButton btnReset;
	
	public CKeyF()
	{
		lblKey=new JLabel("按鍵:");
		lblKey.setBounds(20,10,150,30);    add(lblKey);
		txtInput=new JTextField("");
		txtInput.setBounds(10,50,180,30);  add(txtInput);
		txtInput.addKeyListener(keyListInput);
		lblChar=new JLabel("字元:");
		lblChar.setBounds(20, 90, 150, 30);	add(lblChar);
		btnReset=new JButton("重來");
	    btnReset.setBounds(120,95,60,20);	add(btnReset);
	    btnReset.addActionListener(this);
	    
		setTitle("鍵盤事件偵測");
		setLayout(null);
		setSize(220,180);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	KeyListener keyListInput=new KeyListener() {
		public void keyPressed(KeyEvent e)
		{
			lblKey.setText("按鍵:["+KeyEvent.getKeyText(e.getKeyCode())+"]鍵被按下");
		}
		public void keyTyped(KeyEvent e)
		{
			lblChar.setText("字元:"+e.getKeyChar());
		}
		public void keyReleased(KeyEvent e) {};
	};
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnReset) {
			txtInput.setText("");
			lblKey.setText("按鍵:");
			lblChar.setText("字元:");
		}
	}
}
public class J8_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CKeyF keyF=new CKeyF();
	}

}
