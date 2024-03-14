package intro;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum + " is the value stored in myNum variable");
		System.out.println(website);
		
		//Array
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		//Array other way
		int[] arr2 = {1,2,4,5,6};
		System.out.println(arr2[2]);
		
		//for loop arr.length =5
		for(int i=0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//for loop for string
		String[] name = {"rahul", "shetty","academy"};
		for(int i=0; i< arr.length; i++)
		{
			System.out.println(name[i]);
		}
		

	}

}
