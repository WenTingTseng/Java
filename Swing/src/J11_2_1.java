import java.awt.*;
import javax.swing.*;

class CTextAreaF extends JFrame{
	CTextAreaF(){
		JPanel pan=new JPanel();
		add(pan);
		JLabel lalPoetry=new JLabel("���b��");
		pan.add(lalPoetry);
		
		String st1="���H�w�����b�h�A ���a�žl���b�ӡC\n";
		String st2="���b�@�h���_��A �ն��d���űy�y�C\n";
		String st3="���t�����~����A �گ�ֵ��x�M�w�C ��Ƕm����B�O�A �Ϫi���W�ϤH�T�C";
		
		JTextArea txtPoetry=new JTextArea(st1,4,9);
		txtPoetry.setBorder(BorderFactory.createLineBorder(Color.blue));
		txtPoetry.setLineWrap(true);
		txtPoetry.append(st2);
		txtPoetry.append(st3);
		JScrollPane span=new JScrollPane(txtPoetry,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS
				,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		pan.add(span);
		
		setTitle("���ʭ���");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class J11_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CTextAreaF();
	}

}
