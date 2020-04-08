package test2;

public class OutHotel extends Empty{

	public String out(int roomNo) {
		MainRun mr=new MainRun();
		if(isEmpty(roomNo)) {//调用父类中判断函数，如果没有人则：
			return "该房间没有客人，退房失败!";
		}else
		{					//如果有人则置空
			mr.getRoom()[(roomNo/100)-1][(roomNo%100)-1]="EMPTY";
			return roomNo+"退房成功!";		
		}
	}
}
