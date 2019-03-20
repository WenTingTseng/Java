import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class CFoodF extends JFrame implements ActionListener
{
	private JSpinner spinTable=new JSpinner();
	private JRadioButton[] rdbMain=new JRadioButton[4];
	private JCheckBox[] chkSecond=new JCheckBox[2];
	private JButton btnOK=new JButton("確定");
	private JTextArea txtInfo=new JTextArea();
	private String t_table="桌次:未選",t_main="主餐:鮮烤魚排(200元)",t_second="副餐_未選",t_dessert="甜點_未選";
	private int m_main=200,m_second=0,m_total;
	
	CFoodF(){
		JPanel panTable=new JPanel();	add(panTable);
		panTable.setBounds(10,10,150,60);
		panTable.setLayout(new FlowLayout(FlowLayout.LEFT));
		panTable.setBorder(BorderFactory.createTitledBorder("座位資訊:"));
		
		JLabel lblTable=new JLabel("桌次:");
		spinTable=new JSpinner(new SpinnerNumberModel(0,0,30,1));
		spinTable.addChangeListener(LisTable);
		panTable.add(lblTable);    panTable.add(spinTable);
		
		//確定鈕
		btnOK.setBounds(220,30,70,25);   add(btnOK);
		btnOK.addActionListener(ListOK);
		//主餐
		JPanel panMain=new JPanel();  	 add(panMain);
		panMain.setBounds(10,80,300,80);
		panMain.setLayout(new GridLayout(2,2));
		panMain.setBorder(BorderFactory.createTitledBorder("主餐:"));
		rdbMain[0]=new JRadioButton("鮮烤魚排(200元)",true);
		rdbMain[1]=new JRadioButton("牛小排(300元)");
		rdbMain[2]=new JRadioButton("焗烤明蝦(250元)");
		rdbMain[3]=new JRadioButton("法式烤雞(260元)");
		//ButtonGroup grpRdb=new ButtonGroup();
		for(int i=0;i<rdbMain.length;i++)
		{
			rdbMain[i].addActionListener(this);
			panMain.add(rdbMain[i]);
		}
		//附餐
		JPanel panSecond=new JPanel();  	 add(panSecond);
		panSecond.setBounds(10,180,150,80);
		panSecond.setLayout(new GridLayout(2,1));
		panMain.setBorder(BorderFactory.createTitledBorder("副餐:"));
		String[] second_items= {"鮮蝦蘆筍(80元)","香炸豆腐(50元)"};
		for(int i=0;i<second_items.length;i++)
		{
			chkSecond[i]=new JCheckBox(second_items[i]);
			chkSecond[i].addItemListener(ListSecond1);
			panSecond.add(chkSecond[i]);
		}
		//甜點
		JPanel panDessert=new JPanel();    add(panDessert);
		panDessert.setBounds(190,180,120,60);
		panDessert.setBorder(BorderFactory.createTitledBorder("甜點(免費):"));
		String[] dessert_items= {"請選擇","法式布蕾","香草冰淇淋","香榭奶酪"};
		JComboBox<String> cboDessert=new JComboBox<String>(dessert_items);
		cboDessert.addItemListener(ListSecond1);
		panDessert.add(cboDessert);
		
		//點餐資訊
		JPanel panInfo=new JPanel();	add(panInfo);
		panInfo.setBounds(10,280,300,120);
		panInfo.setBackground(Color.white);
		panInfo.setBorder(BorderFactory.createTitledBorder("點餐資訊"));
		panInfo.add(txtInfo);
		
		setTitle("點餐表單");
		setLayout(null);
		setBounds(10,10,340,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//桌次_事件傾聽者
	public ChangeListener LisTable=new ChangeListener() {
		@Override
		public void stateChanged(ChangeEvent e) {
			int value=(Integer)spinTable.getValue();
			if(value==0)
				t_table="桌次:未選";
			else
				t_table="桌次:第"+spinTable.getValue()+"桌";
		}
	};
	//主餐
	public void actionPerformed(ActionEvent e)
	{
		t_main="主餐:"+((JRadioButton)e.getSource()).getText();
		if(rdbMain[0].isSelected()) m_main=200;
		if(rdbMain[1].isSelected()) m_main=300;
		if(rdbMain[2].isSelected()) m_main=350;
		if(rdbMain[3].isSelected()) m_main=260;
	}
	//副餐
	public ItemListener ListSecond1=new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
			t_second="副餐";
			m_second=0;
			if(chkSecond[0].isSelected()) {
				t_second+="鮮蝦蘆筍(80元)";
				m_second+=80;
			}
			if(chkSecond[1].isSelected()) {
				t_second+="香炸豆腐(50元)";
				m_second+=50;
			}
			if(chkSecond[0].isSelected() && chkSecond[1].isSelected())
				t_second+="未選";
		}
	};
	//甜點
	public ItemListener ListSecond=new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
			if(e.getItem().toString()=="請選擇") t_dessert="甜點:未選";
			else t_dessert="甜點:"+e.getItem().toString()+"(免費)";
		}
	};
	public ActionListener ListOK=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			m_total=m_main+m_second;
			txtInfo.setText(t_table+"\n"+t_main+"\n"+t_second+"\n"+t_dessert+"\n"+"合計:"+m_total+"元");
		}
	};
}
public class J11_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CFoodF();
	}

}
