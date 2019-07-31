//tahseen anwar tahir


import java.util.Scanner;
public class student1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		student s1 =new student();
		student s2 = new student();

		student s3 = new student();
		
		
		s1.m1=0.0f;
		s1.m2=10.0f;
		s1.name="alice";
		
		s2.m1=6.0f;
		s2.m2=101.0f;
		s2.name="bob";
		
		s1.avg1 = s1.avg(s1.m1,s1.m2);
		s2.avg1 = s2.avg(s2.m1,s2.m2);
		System.out.println(s1.avg1 +" "+ s2.avg1);
		
		//s1.nam(s1.name);
		s3.compare(s1,s2);
		

	}

}

//class student 
//{
//	float m1,m2,avg1,avg2;
//	String name;
//	
//	public float avg(float f1, float f2)
//	{
//		return (f1+f2)/2;
//	}
//	
//	public void nam(String name)
//	{
//		System.out.println(name);
//	}
//	
//	public void compare(float avg1,float avg2, student s1, student s2)
//	{
////		student s1 =new student();
////		student s2 = new student();
//		if (avg1 > avg2)
//		{
//			System.out.println(s1.name);
//		}
//		else
//		{
//			System.out.println(s2.name);
//		}
//	}
//	
//}