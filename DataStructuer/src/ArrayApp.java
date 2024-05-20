import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length");
		int n=sc.nextInt();
		Array a=new Array(n);
		//use while loop infant
		while(true)
		{
			System.out.println("Press1___________insert");
			System.out.println("Press2___________delete");
			System.out.println("Press3___________display");
			System.out.println("press any othe number exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1 : a.insert();
			break;

			case 2 : a.delete();
			break;

			case 3 : a.display();
			break;

			default :System.exit(0);
			}
		}
	}

}
