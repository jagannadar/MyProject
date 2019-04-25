package javaPractice;

public class MaxandMin {


	public void min()
	{
		int arr[] = {2,6,5};

		int min = arr[0];
		for(int i =1 ; i < arr.length ; i++)
		{
			if(min > arr[i])
			{
				min= arr[i];

			}
			
		}
		System.out.println(min);
	}

	public void maxx()
	{
		int arr[] = {2,6,5};

		int max = arr[0];
		for(int i =1 ; i < arr.length ; i++)
		{
			if(max < arr[i])
			{
				max= arr[i];

			}
			
		}
		System.out.println(max);
	}


	public static void main(String[] args) {
		MaxandMin m = new MaxandMin();
		m.min();
		m.maxx();

	}

}
