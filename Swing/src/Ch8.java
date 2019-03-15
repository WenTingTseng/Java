import javax.swing.*;
import java.awt.event.*;
class CompanyF extends JFrame implements ActionListener{
	private JTextField txtS,txtY,txtShow;
	private JButton btnOK,btnClear;
	CompanyF(){
		JLabel lblS=new JLabel("輸入底薪(元):");
		lblS.setBounds(30,50, 50, 20);   add(lblS);
		txtS=new JTextField("0");
		txtS.setBounds(130,50,50,20);    add(txtS);
		txtS.addActionListener(this);
		
		JLabel lblY=new JLabel("輸入年資(年):");
		lblY.setBounds(30,80,120,20);   add(lblY);
		txtY=new JTextField("0");
		txtY.setBounds(130,80,120,20);   add(txtY);
		txtY.addActionListener(this);
		
		txtShow=new JTextField("");
		txtShow.setBounds(30,120,160,20);add(txtShow);
		txtShow.setEditable(false);
		
		btnOK=new JButton("確定");
		btnOK.setBounds(40,160,60,20);   add(btnOK);
		btnOK.addActionListener(this);
		
		btnClear=new JButton("清除");     add(btnClear);
		btnClear.setBounds(120,160,60,20);
		btnClear.addActionListener(this);
		
		setTitle("計算員工薪資");	setLayout(null);
		setBounds(100,100,235,230);	setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnClear) {
			txtS.setText("");
			txtY.setText("");
			txtShow.setText("");
		}
		
		if(e.getSource()==btnOK || e.getSource()==txtS || e.getSource()==txtY) {
			int year=Integer.parseInt(txtY.getText());
			int salary=Integer.parseInt(txtS.getText());
			String Final;
			if(year<1)
			{
				Final=String.valueOf(salary);
				txtShow.setText(Final);
			}
			else if(year<2)
			{
				Final=String.valueOf(salary+500);
				txtShow.setText(Final);
			}
			else if(year<5)
			{
				Final=String.valueOf(salary+1000);
				txtShow.setText(Final);
			}
			else
			{
				Final=String.valueOf(salary+2000);
				txtShow.setText(Final);
			}			
		}
	}
}
public class Ch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyF c=new CompanyF();
	}

}
