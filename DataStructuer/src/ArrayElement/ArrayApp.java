package ArrayElement;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		int n=sc.nextInt();
		Array ar=new Array(n);
		System.out.println("Enter our chosie");
		while(true)
		{
			System.out.println("Presse 1__________insert");
			System.out.println("Presse 2__________delete");
			System.out.println("Presse 3__________display");
			System.out.println("Ente any one number after that exit");
			int chosie=sc.nextInt();
			switch(chosie)
			{
			case 1 : ar.insert();
			break;
			
			case 2 : ar.delete();
			break;
			
			case 3 : ar.display();
			break;
			
			default : System.exit(0);
			}
		}
	}

}
