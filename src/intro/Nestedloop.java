package intro;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nested loop works
		
		for(int i=1; i<=4; i++) //outer for loop
		{
			System.out.println("outer loop started");
			for(int j=1; j<=4; j++) //inner for loop
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop finished");
		}

	}

}
