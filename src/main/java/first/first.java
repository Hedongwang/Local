package first;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world"+"\n");
		//��串��
		float x;
		x=commission(0,1,1);//���������Ϸ������
		System.out.println("�����ѵ�Ӷ����"+x);
		x=commission(1,1,1);//�����Ϸ�������£�<1000
		System.out.println("�����ѵ�Ӷ����"+x);
		x=commission(1,1,130);//�����Ϸ�������£�1000<total<1800
		System.out.println("�����ѵ�Ӷ����"+x);
		x=commission(1,1,500);//�����Ϸ�������£�>1800
		System.out.println("�����ѵ�Ӷ����"+x);
 		//�ж�����
		//��������
		//�ж���������
		//������ϸ���
		//MC/DC����
		//·������
	}

	public static float commission (int headphones, int shells, int protectors) //�������ֻ��ǣ��ֻ�Ĥ
	{ 
		float salary;//Ӷ��
		float total; //�����۶�
		if (headphones<=0 || shells<0 || protectors<0) //�ж������ĺϷ���
				return (float) -1;
		total = headphones * 80 + shells * 10 + protectors * 8;
		System.out.print("�ܹ������ˣ�"+total+"\n");
		if (total<1000) //����Ӷ��
				salary = total * (float) 0.1;
		else if (total<1800)
				salary = 1000* (float) 0.1 + (total-1000) * (float) 0.15;
		else
				salary = 1000 * (float) 0.1 + (800) * (float) 0.15 + (total-1800) * (float)0.2; 
		return salary;
	}
}
