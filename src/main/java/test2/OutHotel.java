package test2;

public class OutHotel extends Empty{

	public String out(int roomNo) {
		MainRun mr=new MainRun();
		if(isEmpty(roomNo)) {//���ø������жϺ��������û������
			return "�÷���û�п��ˣ��˷�ʧ��!";
		}else
		{					//����������ÿ�
			mr.getRoom()[(roomNo/100)-1][(roomNo%100)-1]="EMPTY";
			return roomNo+"�˷��ɹ�!";		
		}
	}
}
