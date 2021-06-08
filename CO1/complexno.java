public class cmplxno
{ 
	double real,img;
	cmplxno(double r,double i)
	{
		this.real=r;
		this.img=i;
	}
	public static cmplxno sum(cmplxno c1,cmplxno c2)
	{
	cmplxno temp=new cmplxno(0,0);
	temp.real=c1.real + c2.real;
	temp.img=c1.real + c2.img;
	return temp;
	}
	public static void main(String args[])
	{
	cmplxno c1=new cmplxno(3.3,4);
	cmplxno c2=new cmplxno(5.3,8);
	cmplxno temp= sum(c1,c2);
	System.out.printf("sum=" + temp.real +"+" + temp.img +"i");
	}
}
