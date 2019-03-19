import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
class CListF extends JFrame implements ListSelectionListener{
	private String[] place= {"陽明山","梨山","日月潭","阿里山","太平山","小琉球"};
	private String[] city= {"台北","台中","南投","嘉義","宜蘭","屏東"};
	private JList<String> lstPlace=new JList<String>(place);
	private JTextArea txtPlaceCity=new JTextArea(3,3);
	CListF(){
		JPanel pan=new JPanel();
		add(pan,BorderLayout.NORTH);
		JLabel lblPlace=new JLabel("風景區代表:");
		pan.add(lblPlace);
		JScrollPane spanPlace=new JScrollPane(lstPlace);
		pan.add(spanPlace);
		lstPlace.setVisibleRowCount(4);
		lstPlace.addListSelectionListener(this);
		
		JScrollPane spanPlaceCity=new JScrollPane(txtPlaceCity);
		add(spanPlaceCity,BorderLayout.SOUTH);
		
		setTitle("清單");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		Object[] values=lstPlace.getSelectedValues(); 
		int[] indices=lstPlace.getSelectedIndices();
		String place_city="";
		for(int i=0;i<values.length;i++)
		{
		    place_city = values[i]+":"+city[indices[i]];
			if(i<values.length-1) place_city+="\n";
		}
		 
		txtPlaceCity.setText(place_city);
	}
}
public class J11_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CListF();
	}

}

