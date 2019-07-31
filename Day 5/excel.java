//tahseen anwar tahir

package Testing1;


public class excel {

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
int z;
int a=0,b=0,c=0;
function1 f = new function1();

z=f.read(3, 0);
System.out.println("here " + z);
f.write(a, 0,"Prime",z);

for(int i=0;i<10;i++)
{
	z=f.read(i, 0);
	System.out.println("here " + z);
if(f.prime(z))
{
	f.write(a, 0,"Prime",z);
	a++;
}
else
{
	if(f.even(z))
	{
		f.write(b,0,"Even",z);
		b++;
	}
	else
	{
		f.write(c,0,"Odd",z);
		c++;
	}
}
}
}

}
