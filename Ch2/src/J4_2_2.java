
public class J4_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id[]= {"B03","B01","A03","D12","F12"};
		String find_id="D12";
		int order=0;
		boolean is_order=false;
		for(String id_i:id)
		{
			order++;
			if(find_id.equals(id_i))
			{
				is_order=true;
				break;
			}	
		}
		if(is_order)
			System.out.println("�s��:"+find_id+"��"+order+"�W");
		else
			System.out.println("�s��:"+find_id+"�S�i�J�Ʀ�]");
	}

}
