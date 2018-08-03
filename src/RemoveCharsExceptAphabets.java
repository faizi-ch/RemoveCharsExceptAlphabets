import javax.swing.plaf.ActionMapUIResource;
import java.util.Scanner;

public class RemoveCharsExceptAphabets
{
	public static void main(String[] args)
	{
		removeCharsExceptAlphabets();
	}
	public static void removeCharsExceptAlphabets()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s;
		s = in.nextLine();
		char c;
		char ch[];
		for (int i = 0; i < s.length(); i++)
		{
			c = s.charAt(i);
			if (!((c>='a'&&c<='z') || (c>='A'&&c<='Z' || c=='\0')))
			{
				for (int j = 0; j !=c ; j++)
				{
					System.out.print(c);
				}
				System.out.print(c);
			}

		}
	}
}
