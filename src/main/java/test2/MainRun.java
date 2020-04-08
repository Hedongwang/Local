package test2;
import java.util.Scanner;
public class MainRun {


		private static String[][] rooms;//利用数组来放置所有的房间状态或者姓名
		private static ListHome lh=new ListHome();//房间号码以及状态类
		private static InHotel ih=new InHotel();//住房类
		private static OutHotel oh=new OutHotel();//退房类
		public static void main(String args[]) {
			iniRooms();//初始化房间
			command();
		}
		
		
		private static void iniRooms() {//初始化函数
			rooms=new String[10][12];//设置10*12的房间数组
			for(int i=0;i<rooms.length;i++) {//长度length就是数组的行数
			
				for(int j=0;j<rooms[0].length;j++) {//第一个房间的列数，其实就是整个房间的列数
					
					rooms[i][j]="EMPTY";//初始化 所有房间的状态为空
				}
			}
		}
		/*在这里发现，Java不想C语言那样需要按照顺序去输入数据。只需将所有的数据都空格分开输入，系统会自动按部就班*/
		private static void command() {
			String comm;
			while(true) {//不断迭代，满足用户的不断输入
				
				System.out.println("请输入命令: ");
				Scanner sca=new Scanner(System.in);//调用输入函数
				System.gc();//这个函数的作用好像是重复利用已经分配的内存
				comm=sca.next();//接着输入；
				if("search".equalsIgnoreCase(comm)){//当用户输入“搜索”时
					lh.search();//这里为调用搜索函数，找到所有的房间以及他的状态
				}
				else if("in".equalsIgnoreCase(comm)) {//当用户输入“进入”
					//System.out.println("已经进入了登记阶段!");
					int roomNo=sca.nextInt();//接着输入数据
					try {
						if(validRoomNo(roomNo)) {
						//	System.out.println("未输入姓名!");
							String name=sca.next();//接着输入姓名，并且存入到name中
						//	System.out.println("输入成功了,名字和房间号--->>>"+name+roomNo);
							System.out.println(ih.in(roomNo,name));//这句话有问题
						}else
							System.out.println("房间号错误!");
					}catch(Exception e)
					{
						System.out.println("出现了异常!");
					}
				}
				else if("out".equalsIgnoreCase(comm)) {//当用户输入“退房”
					//System.out.println("已经进入了登记阶段!");
					int roomNo=sca.nextInt();//接着输入数据
					try {
						if(validRoomNo(roomNo)) {
						//	System.out.println("未输入姓名!");
						//	String name=sca.next();//接着输入姓名，并且存入到name中
						//	System.out.println("输入成功了,名字和房间号--->>>"+name+roomNo);
							System.out.println(oh.out(roomNo));//这句话有问题
						}else
							System.out.println("房间号错误!");
					}catch(Exception a) {
						System.out.println("出现了异常!");
					}
						
					
				}
				else if("exit".equalsIgnoreCase(comm)) {//当用户输入“退出”
					System.out.println("程序退出...");  
					break;
				}else {
					System.out.println("命令输入错误，请重新输入:");
				}
				
			}
}
			private static boolean validRoomNo(int roomNo) {//布尔判断函数
				if((roomNo/100>10)||(roomNo/100<1)||(roomNo%100>12)||(roomNo%100<1))//当输入的房间号码大小不合适 
					return false;
				else
					return true;
			}
				public String[][] getRoom(){//得到所有的房间（返回房间数组）
					return rooms;
			}
			
		

}
