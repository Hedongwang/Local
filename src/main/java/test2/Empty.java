package test2;

public class Empty {

	MainRun mr=new MainRun();
	boolean isEmpty(int roomNo)
	{
		if("EMPTY".equals(mr.getRoom()[(roomNo/100)-1][(roomNo%100)-1]))//����÷����״̬�ǿշ���
			return true;
		else
			return false;
	}
}
