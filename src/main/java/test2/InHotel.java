package test2;

/*
public class InHotel extends Empty{
	
	private int room;
	public String in(int roomNo,String name) {
		MainRun mr=new MainRun();
		room=(roomNo%100)-1;
	//	System.out.println("是否进来了IH类中in方法？");
		if(isEmpty(roomNo)) {//如果房间为空
			System.out.println("此时的房间为空!");
			mr.getRoom()[(roomNo/100)-1][room]=name;//则将姓名放到房价中
			return name+"成功入住"+roomNo+"房间!";
		}
		else
			return "该房间已经有客人入住!"; 
	}
	
	@Override
	public boolean isEmpty(int roomNo) {//这个人的代码风格很不好，为什么要重名设置变量
		MainRun m=new MainRun();
	//	System.out.println("进判断函数了吗");
		String room_2=m.getRoom()[(roomNo/100)-1][(roomNo%100)-1];//取当前编号的房间的内容！！！因为少了一个0，花了3个小时找问题，认真！！！
	//	System.out.println("此时的状态是:"+room_2);
		if("EMPTY".equals(room_2))//如果房间为空
		{
			System.out.println("判断成功函数中!");
			return true;
		}
			
		else {
			System.out.println("判断失败函数中!");
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
	
	public String in(int roomNo,String name) {//先试一下这个
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














