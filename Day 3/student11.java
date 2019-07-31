//tahseen anwar tahir


class student 
{
	float m1,m2,avg1;
	String name;
	
	public float avg(float f1, float f2)
	{
		return (f1+f2)/2;
	}
	
	public void nam(String name)
	{
		System.out.println(name);
	}
	
	public void compare( student s1, student s2)
	{
//		student s1 =new student();
//		student s2 = new student();
		if (s1.avg1 > s2.avg1)
		{
			System.out.println(s1.name);
		}
		else
		{
			System.out.println(s2.name);
		}
	}
	
}