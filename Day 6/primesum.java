//tahseen anwar tahir


public class primesum {
	public static void main(String[] args)
	{
		int j=2,count=0,sum=0;
		while (count!=10)
		{
			int flag=0;
			for (int i=2;i<=Math.sqrt(j);i++)
			{
				if (j%i == 0)
					flag=1;
			}
			if (flag==0)
			{
				sum+=j;
				count++;
			}
			j++;
		}
		System.out.println(sum);
	}

}
