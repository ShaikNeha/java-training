class Bank
{
	int getRateOfInterest(){return 0;}
}
class SBI extends Bank{
	int getRateOfInterest(){return 8;}
}
class ICIC extends Bank{
	int getRateOfInterest(){return 9;}
}
class AXIS extends Bank{
	int getRateOfInterest(){return 7;}
}
class Testbank
{
public static void main(String[] args) 
	{
		SBI s=new SBI();
		ICIC i=new ICIC();
		AXIS a=new AXIS();
		System.out.println("SBI rate of interest"+s.getRateOfInterest());
		System.out.println("ICIC rate of interest"+i.getRateOfInterest());

		System.out.println("AXIS rate of interest"+a.getRateOfInterest());

	}
	}
