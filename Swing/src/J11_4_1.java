import java.awt.*;
import javax.swing.*;

class CTabPaneF extends JFrame{
	CTabPaneF(){
		JTabbedPane tpan=new JTabbedPane();
		tpan.setBounds(10,10,220,180);
		add(tpan);
		
		String st="���b��--��.�Z�V\n"
				+"���H�w�����b�h�A ���a�žl���b�ӡC\n"
				+"���b�@�h���_��A �ն��d���űy�y�C\n"
				+"���t�����~����A �گ�ֵ��x�M�w�C\n"
				+ " ��Ƕm����B�O�A �Ϫi���W�ϤH�T�C";
		JTextArea txtPoetry=new JTextArea(st);
		txtPoetry.setLineWrap(true);
		tpan.addTab("�C���߸�",txtPoetry);
		
		JLabel lblPic=new JLabel(new ImageIcon("2.jpg"));
		tpan.addTab("�Ӥ�", lblPic);
		
		setTitle("����");
		setLayout(null);
		setBounds(50,50,250,230);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
public class J11_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CTabPaneF();
	}

}
