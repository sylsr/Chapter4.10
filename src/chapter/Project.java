package chapter;

public class Project
{
	public void partA()
	{
		 char star = '*';
		 int x=10;
		 int y=9;
		 
		 while (x!=1)
		 {
			 System.out.print(star);
			 x--;
			 if(x==1)
			 {
				 System.out.println();
				 x=y;
				 y--;
			 }
		 }
		 
	}
	public void partB()
	{
		 char star = '*';
		 char space=' ';
		 int x=9;
		 int y=9;
		 int z=9;
		 
		 while (y!=0)
		 {
			 while(x!=0)
			 {
				 System.out.print(space);
				 x--;
			 }
			 while(z<10)
			 {
				 System.out.print(star);
				 z++;
			 }
			 System.out.println();
			 x=y-1;
			 y--;
			 z=y;
			 
		 }
		 
	}
	public void partC()
	{
		 char star = '*';
		 char space=' ';
		 int x=10;
		 int y=10;
		 int z=10;
		 
		 while (y!=0)
		 {
			 while(z<10)
			 {
				 System.out.print(space);
				 z++;
			 }
			 while(x>0)
			 {
				 System.out.print(star);
				 x--;
			 }
			 System.out.println();
			 x=y-1;
			 z=y-1;
			 y--;
			 
		 }
		 
	}
	public void partD()
	{
		char star = '*';
		char space=' ';
		int x=5;
		int y=5;
		int z=2;
		int xyz=1;
		while(y!=0)
		{
			while(x>1)
			{
				System.out.print(space);
				x--;
			}
			while(z>1)
			{
				System.out.print(star);
				z--;
			}
			System.out.println();
			x=(y-1);
			z=xyz+3;
			xyz=xyz+2;
			y--;
		}
		y=5;
		z=1;
		x=0;
		xyz=3;
		int spaceIncrease=0;
		while(y!=0)
		{
			while(x>0)
			{
				System.out.print(space);
				x--;
			}
			while(z<10)
			{
				System.out.print(star);
				z++;
			}

			System.out.println();
			spaceIncrease++;
			x=spaceIncrease;
			z=xyz;
			xyz=xyz+2;
			y--;
		}
		
	}
	public static void main(String[] args)
	{
		Project go = new Project();
		go.partA();
		System.out.println();
		go.partB();
		System.out.println();
		go.partC();
		System.out.println();
		go.partD();
		

	}

}
