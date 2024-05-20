package Circular;

import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		 int n=sc.nextInt();
		 CircularQueue clq=new CircularQueue(n);
		 while(true)
		 {
			 System.out.println("press 1-________________insert");
			 System.out.println("press 2_________________delete");
			 System.out.println("press 3__________________display");
			 System.out.println("Press any not number exit");
			 System.out.println("Enter your choise");
			 int choise=sc.nextInt();
			 switch(choise)
			 {
			 case 1 : clq.insert();
			 break;
			 
			 case 2: clq.delete();
			 break;
			   
			 case 3: clq.display();
			 break;
			 
			 default : System.exit(0);
			 }
		 }
	}

}
