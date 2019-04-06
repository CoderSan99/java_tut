import java.util.*;
public class swap_notemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a = sc.nextInt();	 //3 try changing datatype to float/double,try negative inputs
		int b = sc.nextInt();	// 4
		
		System.out.println("a="+a+" b="+b);	//before swapping
		a = a+b;	//a = 3+4 =7
		b = a-b;	//b = 7-4 = 3
		a = a-b;		// a = 7-3=4
		System.out.println("a="+a+" b="+b);	//after swapping
		sc.close();
		

	}

}
