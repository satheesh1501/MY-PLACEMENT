import java.util.*;
public class revstar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=a;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}