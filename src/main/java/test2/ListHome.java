package test2;

public class ListHome {
/*
	MainRun mr=new MainRun();
	public void search() {
		for(int i=0;i<mr.getRoom().length;i++) {//��������
	
			for(int j=0;j<mr.getRoom()[0].length;j++) {//�������ֵĴ�С��������
				if(j+1<10) {
					System.out.print(i+1+"0"+(j+1)+"	");
				}
				else {
					System.out.print(i+1+""+(j+1)+"	  ");
				}
			}
			
			System.out.println();
			for(int j=0;j<mr.getRoom()[0].length;j++) {
				System.out.print(mr.getRoom()[i][j]+"	");//���EMPTY
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
		for(int i=0;i<10;i++) {//��������
	
			for(int j=0;j<12;j++) {//�������ֵĴ�С��������
				if(j+1<10) {
					System.out.print(i+1+"0"+(j+1)+"\t");
				}
				else {
					System.out.print(i+1+""+(j+1)+"\t");
				}
			}
			//System.out.println();				
			for(int j=0;j<12;j++) {
					System.out.print(iData.getStation((i+1)*100+j+1)+"\t");//���EMPTY
				}
				//System.out.println();
		}
	}
	
	
	
}
