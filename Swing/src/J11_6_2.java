import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CComboF extends JFrame implements ItemListener{
	private JLabel lblHead=new JLabel("�嫬�P�өʤ��R");
	private String[] blood= {"�п��","A��","B��","AB��","O��"};
	private JComboBox<String> cbcBlood=new JComboBox<String>(blood);
	private JPanel pan=new JPanel();
	private JTextArea txtShow=new JTextArea("�өʤ��R:",4,4);
	
	CComboF(){
		pan.add(lblHead);
		cbcBlood.addItemListener(this);
		pan.add(cbcBlood);
		
		add(pan,BorderLayout.NORTH);
		add(txtShow,BorderLayout.SOUTH);
		setTitle("�U�Ԧ��M��");
		setBounds(50,50,220,180);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		switch((String)e.getItem()) {
			case "�п��":
				txtShow.setText("�өʤ��R");
				break;
			case "A��":
				txtShow.setText("A�����H:\n�өʷũM�Aí�����C\n�P���״I�A�۹������");
				break;
			case "B��":
				txtShow.setText("B�����H:\n�ө��x��A�����U���C\n���~�p�`�A�ˤ����m�F");
				break;
			case "AB��":
				txtShow.setText("AB�����H:\n�ݨ�A���PB�����S��C\n���ܡA�����w���u���W");
				break;
			case "O��":
				txtShow.setText("O�����H:\n���[�i���A���ԥ~�V�C\n�N�Ӱ�w�A�����Ӧ��۫H");
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
