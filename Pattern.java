package __Variation__;

public class Pattern
{

	public static void main(String[] args)
	{
		int irange = 5;
		int jrange = 9;

		for (int i = 0; i < irange; i++)
		{
			for (int j = 0; j < jrange; j++)
			{
				if (j + i >= 4 && j - i <= 4)
				{
					if ((j + i) % 2 == 0)
					{
						System.out.print("*");

					}
					else
					{
						System.out.print("-");
					}
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}

	}

}
