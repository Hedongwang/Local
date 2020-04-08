package test2;

public class ListHome {
/*
	MainRun mr=new MainRun();
	public void search() {
		for(int i=0;i<mr.getRoom().length;i++) {//输出房间号
	
			for(int j=0;j<mr.getRoom()[0].length;j++) {//根据数字的大小调整数字
				if(j+1<10) {
					System.out.print(i+1+"0"+(j+1)+"	");
				}
				else {
					System.out.print(i+1+""+(j+1)+"	  ");
				}
			}
			
			System.out.println();
			for(int j=0;j<mr.getRoom()[0].length;j++) {
				System.out.print(mr.getRoom()[i][j]+"	");//输出EMPTY
			}
			System.out.println();
		}
	}
	*/
	IData iData;
	public ListHome(IData iData) {
		this.iData=iData;
	}
	public ListHome() {
		
	}
	public void search() {
		for(int i=0;i<10;i++) {//输出房间号
	
			for(int j=0;j<12;j++) {//根据数字的大小调整数字
				if(j+1<10) {
					System.out.print(i+1+"0"+(j+1)+"\t");
				}
				else {
					System.out.print(i+1+""+(j+1)+"\t");
				}
			}
			//System.out.println();				
			for(int j=0;j<12;j++) {
					System.out.print(iData.getStation((i+1)*100+j+1)+"\t");//输出EMPTY
				}
				//System.out.println();
		}
	}
	
	
	
}
