class Main4
{
	public static void main(String[] args) 
	{
		int[]numbers={12,4,5,4,6,8,-2,-3,8};
		int Sum=0;
		Double average;
		for(int number:numbers)
		{
			Sum+=number;
		}
		int arrayLength=numbers.length;
		average=((double)Sum/(double)arrayLength);
		System.out.println("Sum="+Sum);
		System.out.println("average="+average);
	
	}
}
