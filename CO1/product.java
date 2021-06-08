class product
{
 int pcode;
 String pname;
 double price;

public product(int pcode, String pname, double price)
{
 this.pcode=pcode;
 this.pname=pname;
 this.price=price;
}
public static void main(String args[])
{
 product p1=new product(7368,"iphone",99000);
 product p2=new product(3368,"samsung",12000);
 product p3=new product(6368,"vivo",10000);
 if ((p1.price<p2.price) && (p1.price<p3.price))
        {
            System.out.println("lowest price is : "+p1.price);
        }
        else if ((p2.price<p1.price) && (p2.price<p3.price))
        {
            System.out.println("lowest price is : "+p2.price);

        }
        else
        {
            System.out.println("lowest price is : "+p3.price);

        }
}
}     