package Arrays;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		 //num = scanner.nextInt();
		 Integer[][] arr = new Integer[3][3]; // 8 * 10 = 80bytes
	     
		 for(int i=0 ; i<3 ; i++) {
			 for(int j=0; j<3 ; j++) {
				 arr[i][j] = scanner.nextInt();
				 
			 }
		 }
		 for(int i=0 ; i<3 ; i++) {
			 for(int j=0; j<3 ; j++) {
	
			 System.out.print("  " + arr[i][j]);
				 
			 }
			 System.out.println();
		 
		 }
	}
}

	


	


