package PST;
import java .util.Scanner;
public class Lengthofstring {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int count=0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println("length of string"+count);
		sc.close();

	}

}
