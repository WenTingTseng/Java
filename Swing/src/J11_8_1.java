import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class CFoodF extends JFrame implements ActionListener
{
	private JSpinner spinTable=new JSpinner();
	private JRadioButton[] rdbMain=new JRadioButton[4];
	private JCheckBox[] chkSecond=new JCheckBox[2];
	private JButton btnOK=new JButton("�T�w");
	private JTextArea txtInfo=new JTextArea();
	private String t_table="�স:����",t_main="�D�\:�A�N����(200��)",t_second="���\_����",t_dessert="���I_����";
	private int m_main=200,m_second=0,m_total;
	
	CFoodF(){
		JPanel panTable=new JPanel();	add(panTable);
		panTable.setBounds(10,10,150,60);
		panTable.setLayout(new FlowLayout(FlowLayout.LEFT));
		panTable.setBorder(BorderFactory.createTitledBorder("�y���T:"));
		
		JLabel lblTable=new JLabel("�স:");
		spinTable=new JSpinner(new SpinnerNumberModel(0,0,30,1));
		spinTable.addChangeListener(LisTable);
		panTable.add(lblTable);    panTable.add(spinTable);
		
		//�T�w�s
		btnOK.setBounds(220,30,70,25);   add(btnOK);
		btnOK.addActionListener(ListOK);
		//�D�\
		JPanel panMain=new JPanel();  	 add(panMain);
		panMain.setBounds(10,80,300,80);
		panMain.setLayout(new GridLayout(2,2));
		panMain.setBorder(BorderFactory.createTitledBorder("�D�\:"));
		rdbMain[0]=new JRadioButton("�A�N����(200��)",true);
		rdbMain[1]=new JRadioButton("���p��(300��)");
		rdbMain[2]=new JRadioButton("�K�N����(250��)");
		rdbMain[3]=new JRadioButton("�k���N��(260��)");
		//ButtonGroup grpRdb=new ButtonGroup();
		for(int i=0;i<rdbMain.length;i++)
		{
			rdbMain[i].addActionListener(this);
			panMain.add(rdbMain[i]);
		}
		//���\
		JPanel panSecond=new JPanel();  	 add(panSecond);
		panSecond.setBounds(10,180,150,80);
		panSecond.setLayout(new GridLayout(2,1));
		panMain.setBorder(BorderFactory.createTitledBorder("���\:"));
		String[] second_items= {"�A��Ī��(80��)","�������G(50��)"};
		for(int i=0;i<second_items.length;i++)
		{
			chkSecond[i]=new JCheckBox(second_items[i]);
			chkSecond[i].addItemListener(ListSecond1);
			panSecond.add(chkSecond[i]);
		}
		//���I
		JPanel panDessert=new JPanel();    add(panDessert);
		panDessert.setBounds(190,180,120,60);
		panDessert.setBorder(BorderFactory.createTitledBorder("���I(�K�O):"));
		String[] dessert_items= {"�п��","�k������","����B�N�O","���k���T"};
		JComboBox<String> cboDessert=new JComboBox<String>(dessert_items);
		cboDessert.addItemListener(ListSecond1);
		panDessert.add(cboDessert);
		
		//�I�\��T
		JPanel panInfo=new JPanel();	add(panInfo);
		panInfo.setBounds(10,280,300,120);
		panInfo.setBackground(Color.white);
		panInfo.setBorder(BorderFactory.createTitledBorder("�I�\��T"));
		panInfo.add(txtInfo);
		
		setTitle("�I�\���");
		setLayout(null);
		setBounds(10,10,340,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//�স_�ƥ��ť��
	public ChangeListener LisTable=new ChangeListener() {
		@Override
		public void stateChanged(ChangeEvent e) {
			int value=(Integer)spinTable.getValue();
			if(value==0)
				t_table="�স:����";
			else
				t_table="�স:��"+spinTable.getValue()+"��";
		}
	};
	//�D�\
	public void actionPerformed(ActionEvent e)
	{
		t_main="�D�\:"+((JRadioButton)e.getSource()).getText();
		if(rdbMain[0].isSelected()) m_main=200;
		if(rdbMain[1].isSelected()) m_main=300;
		if(rdbMain[2].isSelected()) m_main=350;
		if(rdbMain[3].isSelected()) m_main=260;
	}
	//���\
	public ItemListener ListSecond1=new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
			t_second="���\";
			m_second=0;
			if(chkSecond[0].isSelected()) {
				t_second+="�A��Ī��(80��)";
				m_second+=80;
			}
			if(chkSecond[1].isSelected()) {
				t_second+="�������G(50��)";
				m_second+=50;
			}
			if(chkSecond[0].isSelected() && chkSecond[1].isSelected())
				t_second+="����";
		}
	};
	//���I
	public ItemListener ListSecond=new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
			if(e.getItem().toString()=="�п��") t_dessert="���I:����";
			else t_dessert="���I:"+e.getItem().toString()+"(�K�O)";
		}
	};
	public ActionListener ListOK=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			m_total=m_main+m_second;
			txtInfo.setText(t_table+"\n"+t_main+"\n"+t_second+"\n"+t_dessert+"\n"+"�X�p:"+m_total+"��");
		}
	};
}
public class J11_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CFoodF();
	}

}
