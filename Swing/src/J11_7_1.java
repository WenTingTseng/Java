import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class CSpinnerF extends JFrame implements ChangeListener{
	private JLabel lblTitle=new JLabel("¿ï¾Ü¹Ï¤ù:");
	private JLabel lblFig=new JLabel(new ImageIcon("images/1.jpg"));
	private JSpinner spin=new JSpinner(new SpinnerNumberModel(1,1,8,1));
	private JPanel pan=new JPanel();
	CSpinnerF(){
		pan.setBackground(Color.pink);
		pan.setBounds(30, 30, 210, 220);	 add(pan);
		lblTitle.setBounds(30,10,100,20);    pan.add(lblTitle);
		spin.setBounds(100, 10, 50, 20);     pan.add(spin);
		spin.addChangeListener(this);
		lblFig.setBounds(30, 50, 150, 150);  pan.add(spin);
		
		setTitle("888");
		setLayout(null);
		setBounds(50,50,290,310);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		String fig_name="images/"+spin.getValue()+".jpg";
		lblFig.setIcon(new ImageIcon(fig_name));
	}
}
public class J11_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new CSpinnerF();
	}

}
