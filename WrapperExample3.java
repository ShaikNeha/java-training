public class WrapperExample3
{
	public static void main(String[] args) 
	{
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.f;
		double d=60.d;
		char c='a';
		boolean b2=true;
		//autoboxing converting primitive into object
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		//printing objects
		System.out.println("...........printing object values..............." );
		System.out.println("Byte object:"+byteobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Integer object:"+intobj);
		System.out.println("Long object:"+longobj);
		System.out.println("Float object:"+floatobj);
		System.out.println("Double object:"+doubleobj);
		System.out.println("Character object:"+charobj);
		System.out.println("Boolean object:"+boolobj);
		//unboxing:converting object to primitive
        byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		//printing primitive values
		System.out.println("...........primitive values..............." );
		System.out.println("byte values:"+bytevalue);
		System.out.println("Short value:"+shortvalue);
		System.out.println("Integer value:"+intvalue);
		System.out.println("Long value:"+longvalue);
		System.out.println("Float value:"+floatvalue);
		System.out.println("Double value:"+doublevalue);
		System.out.println("Character value:"+charvalue);
		System.out.println("Boolean value:"+boolvalue);
	}
}
