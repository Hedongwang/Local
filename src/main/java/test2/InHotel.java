package test2;

/*
public class InHotel extends Empty{
	
	private int room;
	public String in(int roomNo,String name) {
		MainRun mr=new MainRun();
		room=(roomNo%100)-1;
	//	System.out.println("�Ƿ������IH����in������");
		if(isEmpty(roomNo)) {//�������Ϊ��
			System.out.println("��ʱ�ķ���Ϊ��!");
			mr.getRoom()[(roomNo/100)-1][room]=name;//�������ŵ�������
			return name+"�ɹ���ס"+roomNo+"����!";
		}
		else
			return "�÷����Ѿ��п�����ס!"; 
	}
	
	@Override
	public boolean isEmpty(int roomNo) {//����˵Ĵ�����ܲ��ã�ΪʲôҪ�������ñ���
		MainRun m=new MainRun();
	//	System.out.println("���жϺ�������");
		String room_2=m.getRoom()[(roomNo/100)-1][(roomNo%100)-1];//ȡ��ǰ��ŵķ�������ݣ�������Ϊ����һ��0������3��Сʱ�����⣬���棡����
	//	System.out.println("��ʱ��״̬��:"+room_2);
		if("EMPTY".equals(room_2))//�������Ϊ��
		{
			System.out.println("�жϳɹ�������!");
			return true;
		}
			
		else {
			System.out.println("�ж�ʧ�ܺ�����!");
			return false;
		}
			
	}
}
*/
public class InHotel {
	IData iData;
	public InHotel(IData iData) {
		this.iData=iData;
	} 
	
	public InHotel() {
		
	}
	
	public String in(int roomNo,String name) {//����һ�����
		return iData.in_out_Room(roomNo,name);
	}
	
/*	public boolean isEmpty(int roomNo) {
		if(HotelConstant.EMPTY.equals(iData.getStation(roomNo))) {
			return true;
		}
		else
			return false;
	}
	*/
}














