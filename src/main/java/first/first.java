package first;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world"+"\n");
		//语句覆盖
		float x;
		x=commission(0,1,1);//当数量不合法的情况
		System.out.println("您花费的佣金是"+x);
		x=commission(1,1,1);//数量合法的情况下，<1000
		System.out.println("您花费的佣金是"+x);
		x=commission(1,1,130);//数量合法的情况下，1000<total<1800
		System.out.println("您花费的佣金是"+x);
		x=commission(1,1,500);//数量合法的情况下，>1800
		System.out.println("您花费的佣金是"+x);
 		//判定覆盖
		//条件覆盖
		//判定条件覆盖
		//条件组合覆盖
		//MC/DC覆盖
		//路径覆盖
	}

	public static float commission (int headphones, int shells, int protectors) //耳机，手机壳，手机膜
	{ 
		float salary;//佣金
		float total; //总销售额
		if (headphones<=0 || shells<0 || protectors<0) //判断数量的合法性
				return (float) -1;
		total = headphones * 80 + shells * 10 + protectors * 8;
		System.out.print("总共花费了："+total+"\n");
		if (total<1000) //计算佣金
				salary = total * (float) 0.1;
		else if (total<1800)
				salary = 1000* (float) 0.1 + (total-1000) * (float) 0.15;
		else
				salary = 1000 * (float) 0.1 + (800) * (float) 0.15 + (total-1800) * (float)0.2; 
		return salary;
	}
}
