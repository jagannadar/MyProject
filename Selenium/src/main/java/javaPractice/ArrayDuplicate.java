package javaPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class ArrayDuplicate {
	int num[] = {1,2,7,3,4,4,5,7,6};
	
	public void forlogic()
	{
		
	for(int i = 0; i< num.length;i++)
	{
		for(int j =i+1 ; j < num.length; j++)
		{
			if(num[i]==num[j])
			{
				System.out.println(num[i]);
				break;
				
			}
		}
	}
	
	}
	
	public void sorting()
	{
		int num1[] = {2,7,3,4,5,5,5,7};
		Arrays.sort(num1);
		//System.out.println(num);
		
		for(int i =0 ; i < num1.length-1 ; i++)
		{
			if(num1[i]==num1[i+1])
			{
				System.out.println("Duplicate " +num1[i]);
			}
		}
		
	}
	
	public void setExp()
	{
		Set<Integer> sett = new LinkedHashSet<Integer>();
		int num3[] = {3,3,4,2,1,5,6,7,5};
		for(int i=0; i < num3.length ; i ++)
		{
		if(sett.add(num3[i])==false)
				{
					System.out.println(num3[i]);
				}
		
		}
		
				
				
	
	}

	public static void main(String[] args) {
		ArrayDuplicate d = new ArrayDuplicate();
		d.forlogic();
		d.sorting();
		d.setExp();
	}

		
		
		
	
	
}


