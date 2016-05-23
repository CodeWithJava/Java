import java.util.Scanner;
public class T
{
	public static void main(String [] args)
	{
		System.out.println("Input a value");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		for(int i = 0;i <= value;i++)
			System.out.println(i + "+" + (value - i) + "=" + value);
	}
}