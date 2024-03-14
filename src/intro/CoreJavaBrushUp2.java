package intro;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,4,5,6,9,112};
		//to check multiples of 2
		for(int i=0;i<arr2.length;i++)
		{
			if (arr2[i] % 2 ==0 )
			{
				System.out.println(arr2[i]);
			}
			else
			{
				System.out.println(arr2[i] + " is not multiple of 2");
			}
				
		}
		
		//Array list
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");
		System.out.println(a.get(3));
		
		//to find size of arraylist
		
		for (int i = 0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		//to check item present in arraylist 
		System.out.println(a.contains("seleniumn"));
	}

}
