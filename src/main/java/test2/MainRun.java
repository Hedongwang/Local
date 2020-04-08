package test2;
import java.util.Scanner;
public class MainRun {


		private static String[][] rooms;//�����������������еķ���״̬��������
		private static ListHome lh=new ListHome();//��������Լ�״̬��
		private static InHotel ih=new InHotel();//ס����
		private static OutHotel oh=new OutHotel();//�˷���
		public static void main(String args[]) {
			iniRooms();//��ʼ������
			command();
		}
		
		
		private static void iniRooms() {//��ʼ������
			rooms=new String[10][12];//����10*12�ķ�������
			for(int i=0;i<rooms.length;i++) {//����length�������������
			
				for(int j=0;j<rooms[0].length;j++) {//��һ���������������ʵ�����������������
					
					rooms[i][j]="EMPTY";//��ʼ�� ���з����״̬Ϊ��
				}
			}
		}
		/*�����﷢�֣�Java����C����������Ҫ����˳��ȥ�������ݡ�ֻ�轫���е����ݶ��ո�ֿ����룬ϵͳ���Զ������Ͱ�*/
		private static void command() {
			String comm;
			while(true) {//���ϵ����������û��Ĳ�������
				
				System.out.println("����������: ");
				Scanner sca=new Scanner(System.in);//�������뺯��
				System.gc();//������������ú������ظ������Ѿ�������ڴ�
				comm=sca.next();//�������룻
				if("search".equalsIgnoreCase(comm)){//���û����롰������ʱ
					lh.search();//����Ϊ���������������ҵ����еķ����Լ�����״̬
				}
				else if("in".equalsIgnoreCase(comm)) {//���û����롰���롱
					//System.out.println("�Ѿ������˵Ǽǽ׶�!");
					int roomNo=sca.nextInt();//������������
					try {
						if(validRoomNo(roomNo)) {
						//	System.out.println("δ��������!");
							String name=sca.next();//�����������������Ҵ��뵽name��
						//	System.out.println("����ɹ���,���ֺͷ����--->>>"+name+roomNo);
							System.out.println(ih.in(roomNo,name));//��仰������
						}else
							System.out.println("����Ŵ���!");
					}catch(Exception e)
					{
						System.out.println("�������쳣!");
					}
				}
				else if("out".equalsIgnoreCase(comm)) {//���û����롰�˷���
					//System.out.println("�Ѿ������˵Ǽǽ׶�!");
					int roomNo=sca.nextInt();//������������
					try {
						if(validRoomNo(roomNo)) {
						//	System.out.println("δ��������!");
						//	String name=sca.next();//�����������������Ҵ��뵽name��
						//	System.out.println("����ɹ���,���ֺͷ����--->>>"+name+roomNo);
							System.out.println(oh.out(roomNo));//��仰������
						}else
							System.out.println("����Ŵ���!");
					}catch(Exception a) {
						System.out.println("�������쳣!");
					}
						
					
				}
				else if("exit".equalsIgnoreCase(comm)) {//���û����롰�˳���
					System.out.println("�����˳�...");  
					break;
				}else {
					System.out.println("���������������������:");
				}
				
			}
}
			private static boolean validRoomNo(int roomNo) {//�����жϺ���
				if((roomNo/100>10)||(roomNo/100<1)||(roomNo%100>12)||(roomNo%100<1))//������ķ�������С������ 
					return false;
				else
					return true;
			}
				public String[][] getRoom(){//�õ����еķ��䣨���ط������飩
					return rooms;
			}
			
		

}
