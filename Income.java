import java.util.Scanner;
class Income
{
	public static void main(String args[])
	{
	double tax=0,it;
	int val;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	it=sc.nextDouble();
	if(it<20000)
		val =0;
	else if (it<50000) 
		val=1;
	else if (it<75000) 
		val=2;
	else if (it<100000) 
		val=3;
	else if (it<150000)
		val=4;
	else if (it<250000) 
		val=5;
	else
		val=6;
	
		
	
	switch (val) {
  case 1:
    tax=0;
    break;
  case 2:
    tax=0.05*it;
    break;
  case 3:
    tax=0.15*it;
    break;
  case 4:
    tax=0.2*it;
    break;
  case 5:
    tax=0.35*it;
    break;
  case 6:
    tax=0.4*it;
    break;
    }
    System.out.println(tax);
   }
}